/*
 * Copyright © 02.10.2015 by O.I.Mudannayake. All Rights Reserved.
 */
package goodreceive;

import java.awt.event.ActionListener;
import javax.swing.event.InternalFrameListener;
import controller.View;
import javax.swing.BorderFactory;
import ui.ColourPalatte;

/**
 *
 * @author Ivantha
 */
public class NewGRN extends javax.swing.JInternalFrame implements View {

    /**
     * Creates new form xxView
     */
    public NewGRN() {
        initComponents();

        this.newGRNPanel.setBackground(ColourPalatte.MEDIUM_BLUE);
        this.paymentPanel.setBackground(ColourPalatte.MEDIUM_BLUE);

        this.poNoLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.invoiceNoLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.invoiceDateLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.itemListLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.descriptionLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.netAmountLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.discountLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.paymentMethodLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.bankLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.noLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        
        this.itemListIDTextField.setBackground(ColourPalatte.VERY_LIGHT_BLUE);
        this.netAmountTextField.setBackground(ColourPalatte.VERY_LIGHT_BLUE);
        this.descriptionTextArea.setBackground(ColourPalatte.PALE_WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentMethodButtonGroup = new javax.swing.ButtonGroup();
        newGRNPanel = new javax.swing.JPanel();
        poNoLabel = new javax.swing.JLabel();
        invoiceNoLabel = new javax.swing.JLabel();
        invoiceDateLabel = new javax.swing.JLabel();
        poNoComboBox = new javax.swing.JComboBox();
        invoiceNoTextField = new javax.swing.JTextField();
        invoiceDateXDatePicker = new org.jdesktop.swingx.JXDatePicker();
        itemListLabel = new javax.swing.JLabel();
        itemListIDTextField = new javax.swing.JTextField();
        newButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        netAmountLabel = new javax.swing.JLabel();
        cashRadioButton = new javax.swing.JRadioButton();
        chequeRadioButton = new javax.swing.JRadioButton();
        debitCardRadioButton = new javax.swing.JRadioButton();
        creditCardRadioButton = new javax.swing.JRadioButton();
        paymentMethodLabel = new javax.swing.JLabel();
        netAmountTextField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        okButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        discountLabel = new javax.swing.JLabel();
        discountTextField = new javax.swing.JTextField();
        paymentPanel = new javax.swing.JPanel();
        bankLabel = new javax.swing.JLabel();
        noLabel = new javax.swing.JLabel();
        noTextField = new javax.swing.JTextField();
        bankTextField = new javax.swing.JTextField();
        printCheckBox = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("New good receive note");
        setFrameIcon(new javax.swing.ImageIcon(ClassLoader.getSystemClassLoader().getResource("icon/grn_button_dark.png"))); // NOI18N

        poNoLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        poNoLabel.setText("Purchase order no.");

        invoiceNoLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        invoiceNoLabel.setText("Invoice no.");

        invoiceDateLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        invoiceDateLabel.setText("Invoice date");

        poNoComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        invoiceNoTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        invoiceNoTextField.setBorder(null);

        itemListLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        itemListLabel.setText("Item list");

        itemListIDTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        itemListIDTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        itemListIDTextField.setEnabled(false);

        newButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        newButton.setText("New ");
        newButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newButtonMouseExited(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        editButton.setText("Edit");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editButtonMouseExited(evt);
            }
        });

        netAmountLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        netAmountLabel.setText("Net amount");

        paymentMethodButtonGroup.add(cashRadioButton);
        cashRadioButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cashRadioButton.setSelected(true);
        cashRadioButton.setText("Cash");

        paymentMethodButtonGroup.add(chequeRadioButton);
        chequeRadioButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        chequeRadioButton.setText("Cheque");

        paymentMethodButtonGroup.add(debitCardRadioButton);
        debitCardRadioButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        debitCardRadioButton.setText("Debit card");

        paymentMethodButtonGroup.add(creditCardRadioButton);
        creditCardRadioButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        creditCardRadioButton.setText("Credit card");

        paymentMethodLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        paymentMethodLabel.setText("Payment method");

        netAmountTextField.setEditable(false);
        netAmountTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        netAmountTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        descriptionLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        descriptionLabel.setText("Description");

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        descriptionTextArea.setRows(5);
        descriptionTextArea.setBorder(null);
        jScrollPane1.setViewportView(descriptionTextArea);

        okButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        okButton.setText("OK");
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                okButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                okButtonMouseExited(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearButtonMouseExited(evt);
            }
        });

        discountLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        discountLabel.setText("Discount");

        discountTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        discountTextField.setText("0.0");
        discountTextField.setBorder(null);

        paymentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bankLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        bankLabel.setText("Bank");
        paymentPanel.add(bankLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 25, -1, -1));

        noLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        noLabel.setText("No.");
        paymentPanel.add(noLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 24, -1, -1));

        noTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        noTextField.setText(" ");
        noTextField.setBorder(null);
        paymentPanel.add(noTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 100, 25));

        bankTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        bankTextField.setText(" ");
        bankTextField.setBorder(null);
        paymentPanel.add(bankTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, 25));

        printCheckBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        printCheckBox.setText("Print");
        printCheckBox.setPreferredSize(new java.awt.Dimension(80, 25));

        javax.swing.GroupLayout newGRNPanelLayout = new javax.swing.GroupLayout(newGRNPanel);
        newGRNPanel.setLayout(newGRNPanelLayout);
        newGRNPanelLayout.setHorizontalGroup(
            newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newGRNPanelLayout.createSequentialGroup()
                .addGroup(newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newGRNPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(debitCardRadioButton)
                            .addComponent(creditCardRadioButton)
                            .addGroup(newGRNPanelLayout.createSequentialGroup()
                                .addGroup(newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chequeRadioButton)
                                    .addComponent(cashRadioButton))
                                .addGap(35, 35, 35)
                                .addComponent(paymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(newGRNPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newGRNPanelLayout.createSequentialGroup()
                                .addGroup(newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(newGRNPanelLayout.createSequentialGroup()
                                        .addComponent(poNoLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(poNoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(newGRNPanelLayout.createSequentialGroup()
                                        .addComponent(netAmountLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(netAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73)
                                .addComponent(discountLabel)
                                .addGap(18, 18, 18)
                                .addComponent(discountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(paymentMethodLabel)
                            .addComponent(descriptionLabel)
                            .addGroup(newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, newGRNPanelLayout.createSequentialGroup()
                                    .addComponent(printCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, newGRNPanelLayout.createSequentialGroup()
                                    .addGroup(newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(invoiceNoLabel)
                                        .addComponent(itemListLabel))
                                    .addGap(63, 63, 63)
                                    .addGroup(newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(newGRNPanelLayout.createSequentialGroup()
                                            .addComponent(itemListIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(newGRNPanelLayout.createSequentialGroup()
                                            .addComponent(invoiceNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(60, 60, 60)
                                            .addComponent(invoiceDateLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(invoiceDateXDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(80, 80, 80))))))))
                .addGap(25, 25, 25))
        );
        newGRNPanelLayout.setVerticalGroup(
            newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newGRNPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poNoLabel)
                    .addComponent(poNoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceNoLabel)
                    .addComponent(invoiceNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceDateLabel)
                    .addComponent(invoiceDateXDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemListLabel)
                    .addComponent(itemListIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(descriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netAmountLabel)
                    .addComponent(netAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discountLabel)
                    .addComponent(discountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(paymentMethodLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newGRNPanelLayout.createSequentialGroup()
                        .addComponent(cashRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chequeRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(paymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(debitCardRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(creditCardRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(newGRNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newGRNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newGRNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newButtonMouseEntered
        this.newButton.setBackground(ColourPalatte.VERY_DARK_BLUE);
        this.newButton.setForeground(ColourPalatte.FONT_BLUE);
        this.newButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.FONT_BLUE, 1));
    }//GEN-LAST:event_newButtonMouseEntered

    private void newButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newButtonMouseExited
        this.newButton.setBackground(ColourPalatte.DARK_BLUE);
        this.newButton.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.newButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.BRIGHT_WHITE, 1));
    }//GEN-LAST:event_newButtonMouseExited

    private void editButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseEntered
        this.editButton.setBackground(ColourPalatte.VERY_DARK_BLUE);
        this.editButton.setForeground(ColourPalatte.FONT_BLUE);
        this.editButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.FONT_BLUE, 1));
    }//GEN-LAST:event_editButtonMouseEntered

    private void editButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseExited
        this.editButton.setBackground(ColourPalatte.DARK_BLUE);
        this.editButton.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.editButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.BRIGHT_WHITE, 1));
    }//GEN-LAST:event_editButtonMouseExited

    private void okButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseEntered
        this.okButton.setBackground(ColourPalatte.VERY_DARK_BLUE);
        this.okButton.setForeground(ColourPalatte.FONT_BLUE);
        this.okButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.FONT_BLUE, 1));
    }//GEN-LAST:event_okButtonMouseEntered

    private void okButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseExited
        this.okButton.setBackground(ColourPalatte.DARK_BLUE);
        this.okButton.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.okButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.BRIGHT_WHITE, 1));
    }//GEN-LAST:event_okButtonMouseExited

    private void clearButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseEntered
        this.clearButton.setBackground(ColourPalatte.VERY_DARK_BLUE);
        this.clearButton.setForeground(ColourPalatte.FONT_BLUE);
        this.clearButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.FONT_BLUE, 1));
    }//GEN-LAST:event_clearButtonMouseEntered

    private void clearButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseExited
        this.clearButton.setBackground(ColourPalatte.DARK_BLUE);
        this.clearButton.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.clearButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.BRIGHT_WHITE, 1));
    }//GEN-LAST:event_clearButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel bankLabel;
    javax.swing.JTextField bankTextField;
    javax.swing.JRadioButton cashRadioButton;
    javax.swing.JRadioButton chequeRadioButton;
    javax.swing.JButton clearButton;
    javax.swing.JRadioButton creditCardRadioButton;
    javax.swing.JRadioButton debitCardRadioButton;
    private javax.swing.JLabel descriptionLabel;
    javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel discountLabel;
    javax.swing.JTextField discountTextField;
    javax.swing.JButton editButton;
    private javax.swing.JLabel invoiceDateLabel;
    org.jdesktop.swingx.JXDatePicker invoiceDateXDatePicker;
    private javax.swing.JLabel invoiceNoLabel;
    javax.swing.JTextField invoiceNoTextField;
    javax.swing.JTextField itemListIDTextField;
    private javax.swing.JLabel itemListLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel netAmountLabel;
    javax.swing.JTextField netAmountTextField;
    javax.swing.JButton newButton;
    private javax.swing.JPanel newGRNPanel;
    javax.swing.JLabel noLabel;
    javax.swing.JTextField noTextField;
    javax.swing.JButton okButton;
    private javax.swing.ButtonGroup paymentMethodButtonGroup;
    private javax.swing.JLabel paymentMethodLabel;
    private javax.swing.JPanel paymentPanel;
    javax.swing.JComboBox poNoComboBox;
    private javax.swing.JLabel poNoLabel;
    javax.swing.JCheckBox printCheckBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateViewInternalFrameListener(InternalFrameListener ifl) {
        this.addInternalFrameListener(ifl);
    }

    public void addNewButtonActionlistener(ActionListener al) {
        newButton.addActionListener(al);
    }

    public void addEditButtonActionListener(ActionListener al) {
        editButton.addActionListener(al);
    }

    public void addOKButtonActionListener(ActionListener al) {
        okButton.addActionListener(al);
    }

    public void addClearButtonActionListener(ActionListener al) {
        clearButton.addActionListener(al);
    }

    public void addCashRadioButtonActionListener(ActionListener al) {
        cashRadioButton.addActionListener(al);
    }

    public void addChequeRadioButtonActionListener(ActionListener al) {
        chequeRadioButton.addActionListener(al);
    }

    public void addDebitCardRadioButtonActionListener(ActionListener al) {
        debitCardRadioButton.addActionListener(al);
    }

    public void addCreditCardRadioButtonActionListener(ActionListener al) {
        creditCardRadioButton.addActionListener(al);
    }

    public void addPoNoComboBoxActionListener(ActionListener al) {
        poNoComboBox.addActionListener(al);
    }
}
