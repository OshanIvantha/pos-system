/*
 * Copyright © 02.10.2015 by O.I.Mudannayake. All Rights Reserved.
 */
package purchasereturn;

import database.sql.type.PaymentSQL;
import database.sql.type.PurchaseReturnSQL;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import controller.Controller;
import cache.EmployeeCache;
import entity.payment.Cash;
import entity.payment.Cheque;
import entity.payment.PaymentMethod;
import entity.payment.type.PRNPayment;
import main.support.Input;
import main.support.DateAndTime;
import ui.support.Frame;
import controller.ControllerFactory;
import controller.Interface;
import database.sql.SQLStatement;
import database.sql.SQLFactory;
import entity.item.type.PRNItem;
import entity.note.type.PRNx;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import report.ReportFactory;
import report.ReportForm;
import report.type.PurchaseReturnReport;
import database.sql.type.InventorySQL;
import exception.EmptyStringException;
import exception.InvalidNumberException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ui.ColourPalatte;

/**
 *
 * @author Ivantha
 */
public class NewPRNController implements Controller {

    private final NewPRN view = new NewPRN();
    private final PurchaseReturnSQL purchaseReturnSQL = (PurchaseReturnSQL) SQLFactory.getSQLStatement(SQLStatement.PURCHASE_RETURN);
    private final PaymentSQL paymentSQL = (PaymentSQL) SQLFactory.getSQLStatement(SQLStatement.PAYMENT);
    private final InventorySQL inventorySQL = (InventorySQL) SQLFactory.getSQLStatement(SQLStatement.INVENTORY);
    DefaultTableModel dtm;
    private PRNItemListController prnItemListController = (PRNItemListController) ControllerFactory.getController(Interface.PRN_ITEM_LIST);
    private ArrayList<String> poList = new ArrayList<>();
    final ArrayList<String> addedItem = new ArrayList<>();
    private String prnNo;
    private String poNo;
    private double refundPayment = 0.0;

    public NewPRNController() {
        dtm = (DefaultTableModel) view.itemListTable.getModel();

        //Update view
        view.updateViewInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameActivated(InternalFrameEvent e) {

            }
        });

        //Add button
        view.addAddButtonActionListener((ActionEvent e) -> {
            prnItemListController.showView(NewPRNController.this);
        });

        //Remove button
        view.addRemoveButtonActionListener((ActionEvent e) -> {
            String currentItemName = (String) view.itemListTable.getModel().getValueAt(view.itemListTable.getSelectedRow(), 1);
            addedItem.remove(currentItemName);
            dtm.removeRow(view.itemListTable.getSelectedRow());
        });

        //OK button
        view.addOKButtonActionListener((ActionEvent e) -> {
            try {
                String description = view.descriptionTextArea.getText();

                //Check items
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    String itemNo = dtm.getValueAt(i, 0).toString();
                    int qty = (int) Input.checkIfValidNumber(dtm.getValueAt(i, 2).toString(), "Please enter a correct quantity for " + itemNo);
                    double unitPrice = Input.checkIfValidNumber(dtm.getValueAt(i, 3).toString(), "Please enter a correct price for " + itemNo);
                }
                NewPRNController.this.calculateRefundPayment();

                //New payment
                Double refundPayment = Input.checkIfValidNumber(view.refundPaymentTextField.getText(), "Please enter a correct refund payment");
                PRNPayment payment;
                PaymentMethod paymentMethod;
                if (view.cashRadioButton.isSelected()) {
                    paymentMethod = new Cash();
                } else {
                    String bank = Input.checkIfEmptyString(view.bankTextField.getText(), "Please enter a valid bank name");
                    String no;
                    if (view.chequeRadioButton.isSelected()) {
                        no = Input.checkIfEmptyString(view.noTextField.getText(), "Please enter a valid cheque number");
                    } else if (view.debitCardRadioButton.isSelected()) {
                        no = Input.checkIfEmptyString(view.noTextField.getText(), "Please enter a valid debit card number");
                    } else {
                        no = Input.checkIfEmptyString(view.noTextField.getText(), "Please enter a valid credit card number");
                    }
                    paymentMethod = new Cheque(no, bank);
                }

                payment = new PRNPayment(paymentSQL.generateNewID(), refundPayment, paymentMethod);
                paymentSQL.newPayment(payment);

                //New PRN
                prnNo = purchaseReturnSQL.generateNewID();
                PRNx prn = new PRNx(prnNo, DateAndTime.getDate(), poNo, description, payment, EmployeeCache.getEmployee());
                purchaseReturnSQL.newPRN(prn);

                //Add items
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    String itemNo = dtm.getValueAt(i, 0).toString();
                    int qty = (int) Input.checkIfValidNumber(dtm.getValueAt(i, 2).toString(), "Please enter a correct quantity for " + itemNo);
                    double unitPrice = Input.checkIfValidNumber(dtm.getValueAt(i, 3).toString(), "Please enter a correct price for " + itemNo);

                    PRNItem prnItem = new PRNItem(itemNo, qty, unitPrice);
                    purchaseReturnSQL.newPRNItemList(prnNo, prnItem);
                    inventorySQL.decrementItemQty(itemNo, qty);
                }

                //Report
                if (view.printCheckBox.isSelected()) {
                    PurchaseReturnReport purchaseReturnReport = (PurchaseReturnReport) ReportFactory.getReport(ReportForm.PURCHASE_RETURN);
                    purchaseReturnReport.newPRNReport(prnNo);
                }

                view.dispose();
            } catch (EmptyStringException | InvalidNumberException ex) {
                Logger.getLogger(NewPRNController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        //Clear button
        view.addClearButtonActionListener((ActionEvent e) -> {
            NewPRNController.this.clearView();
        });

        //Cash radio button
        view.addCashRadioButtonActionListener((ActionEvent e) -> {
            view.bankTextField.setEditable(false);
            view.bankTextField.setBackground(ColourPalatte.VERY_LIGHT_BLUE);
            view.noTextField.setEditable(false);
            view.noTextField.setBackground(ColourPalatte.VERY_LIGHT_BLUE);

            view.noLabel.setText("No.");
        });

        //Cheque radio button
        view.addChequeRadioButtonActionListener((ActionEvent e) -> {
            view.bankTextField.setEditable(true);
            view.bankTextField.setBackground(ColourPalatte.PALE_WHITE);
            view.noTextField.setEditable(true);
            view.noTextField.setBackground(ColourPalatte.PALE_WHITE);

            view.noLabel.setText("Cheque no.");
        });

        //Debit card radio button
        view.addDebitCardRadioButtonActionListener((ActionEvent e) -> {
            view.bankTextField.setEditable(true);
            view.bankTextField.setBackground(ColourPalatte.PALE_WHITE);
            view.noTextField.setEditable(true);
            view.noTextField.setBackground(ColourPalatte.PALE_WHITE);

            view.noLabel.setText("Debit card no.");
        });

        //Credit card radio button
        view.addCreditCardRadioButtonActionListener((ActionEvent e) -> {
            view.bankTextField.setEditable(true);
            view.bankTextField.setBackground(ColourPalatte.PALE_WHITE);
            view.noTextField.setEditable(true);
            view.noTextField.setBackground(ColourPalatte.PALE_WHITE);

            view.noLabel.setText("Credit card no.");
        });

        //PO no. combo box
        view.addPoNoComboBoxActionListener((ActionEvent e) -> {
            poNo = (String) view.poNoComboBox.getSelectedItem();
            prnItemListController.dtm.setRowCount(0);
            purchaseReturnSQL.getPODetail(poNo, prnItemListController.dtm);
        });
    }

    @Override
    public void showView() {
        this.clearView();
        this.updateView();
        Frame.showInternalFrame(view);
    }

    @Override
    public void updateView() {
        view.poNoComboBox.removeAllItems();
        purchaseReturnSQL.getPOList(poList);
        for (String p : poList) {
            view.poNoComboBox.addItem(p);
        }
    }

    @Override
    public void clearView() {
        view.poNoComboBox.setSelectedItem(null);
        dtm.setRowCount(0);
        view.descriptionTextArea.setText(null);
        view.refundPaymentTextField.setText(null);

        view.cashRadioButton.setSelected(true);

        view.bankTextField.setEditable(false);
        view.bankTextField.setBackground(ColourPalatte.VERY_LIGHT_BLUE);
        view.noTextField.setEditable(false);
        view.noTextField.setBackground(ColourPalatte.VERY_LIGHT_BLUE);

        view.noLabel.setText("No.");
    }

    public void calculateRefundPayment() {
        refundPayment = 0.0;
        try {
            for (int i = 0; i < dtm.getRowCount(); i++) {
                int qty = Integer.parseInt(dtm.getValueAt(i, 2).toString());
                double unitPrice = Double.parseDouble(dtm.getValueAt(i, 3).toString());

                refundPayment += qty * unitPrice;
            }
            view.refundPaymentTextField.setText(String.valueOf(refundPayment));
        } catch (NumberFormatException ex) {
        }
    }
}
