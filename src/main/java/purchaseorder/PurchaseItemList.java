/*
 * Copyright © 02.10.2015 by O.I.Mudannayake. All Rights Reserved.
 */
package purchaseorder;

import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.event.InternalFrameListener;
import controller.View;
import javax.swing.BorderFactory;
import ui.ColourPalatte;

/**
 *
 * @author Ivantha
 */
public class PurchaseItemList extends javax.swing.JInternalFrame implements View{

    /**
     * Creates new form NewPurchaseListView
     */
    public PurchaseItemList() {
        initComponents();
        
        this.purchaseItemListPanel.setBackground(ColourPalatte.MEDIUM_BLUE);
        
        this.searchLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        purchaseItemListPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemListTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemListJList = new javax.swing.JList();
        searchTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        searchLabel = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Purchase list");

        itemListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item no.", "Name", "Qty", "Unit price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemListTable.setRowHeight(20);
        jScrollPane1.setViewportView(itemListTable);

        jScrollPane2.setViewportView(itemListJList);

        searchTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        searchTextField.setText(" ");
        searchTextField.setBorder(null);

        addButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        addButton.setText("Add");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addButtonMouseExited(evt);
            }
        });

        removeButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        removeButton.setText("Remove");
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeButtonMouseExited(evt);
            }
        });

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

        searchLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        searchLabel.setText("Search");

        javax.swing.GroupLayout purchaseItemListPanelLayout = new javax.swing.GroupLayout(purchaseItemListPanel);
        purchaseItemListPanel.setLayout(purchaseItemListPanelLayout);
        purchaseItemListPanelLayout.setHorizontalGroup(
            purchaseItemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaseItemListPanelLayout.createSequentialGroup()
                .addGap(12, 25, Short.MAX_VALUE)
                .addGroup(purchaseItemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(purchaseItemListPanelLayout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, purchaseItemListPanelLayout.createSequentialGroup()
                        .addComponent(searchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchTextField)))
                .addGap(18, 18, 18)
                .addGroup(purchaseItemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(purchaseItemListPanelLayout.createSequentialGroup()
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        purchaseItemListPanelLayout.setVerticalGroup(
            purchaseItemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaseItemListPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(purchaseItemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(purchaseItemListPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(11, 11, 11)
                        .addGroup(purchaseItemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLabel)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(purchaseItemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 935, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(purchaseItemListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(purchaseItemListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        this.addButton.setBackground(ColourPalatte.VERY_DARK_BLUE);
        this.addButton.setForeground(ColourPalatte.FONT_BLUE);
        this.addButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.FONT_BLUE, 1));
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
        this.addButton.setBackground(ColourPalatte.DARK_BLUE);
        this.addButton.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.addButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.BRIGHT_WHITE, 1));
    }//GEN-LAST:event_addButtonMouseExited

    private void removeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseEntered
        this.removeButton.setBackground(ColourPalatte.VERY_DARK_BLUE);
        this.removeButton.setForeground(ColourPalatte.FONT_BLUE);
        this.removeButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.FONT_BLUE, 1));
    }//GEN-LAST:event_removeButtonMouseEntered

    private void removeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseExited
        this.removeButton.setBackground(ColourPalatte.DARK_BLUE);
        this.removeButton.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.removeButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.BRIGHT_WHITE, 1));
    }//GEN-LAST:event_removeButtonMouseExited

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
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    javax.swing.JList itemListJList;
    javax.swing.JTable itemListTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel purchaseItemListPanel;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel searchLabel;
    javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateViewInternalFrameListener(InternalFrameListener ifl) {
        this.addInternalFrameListener(ifl);
    }
    
    public void addAddButtonActionListener(ActionListener al){
        addButton.addActionListener(al);
    }
    
    public void addRemoveButtonActionListener(ActionListener al){
        removeButton.addActionListener(al);
    }
    
    public void addOKButtonActionListener(ActionListener al){
        okButton.addActionListener(al);
    }
    
    public void addClearButtonActionListener(ActionListener al){
        clearButton.addActionListener(al);
    }
    
    public void addItemListMouseListener(MouseListener ml){
        itemListJList.addMouseListener(ml);
    }
    
    public void addItemListFocusListener(FocusListener fl){
	itemListJList.addFocusListener(fl);
    }
    
    public void addSearchTextFieldActionListener(KeyListener kl){
        searchTextField.addKeyListener(kl);
    }
}
