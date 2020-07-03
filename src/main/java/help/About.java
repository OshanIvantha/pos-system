/*
 * Copyright © 02.10.2015 by O.I.Mudannayake. All Rights Reserved.
 */
package help;

import java.awt.event.ActionListener;
import javax.swing.event.InternalFrameListener;
import controller.View;
import javax.swing.BorderFactory;
import ui.ColourPalatte;

/**
 *
 * @author Ivantha
 */
public class About extends javax.swing.JInternalFrame implements View{

    /**
     * Creates new form aboutView
     */
    public About() {
        initComponents();
        
        this.aboutPanel.setBackground(ColourPalatte.DARK_BLUE);
        
        this.closeButton.setBackground(ColourPalatte.DARK_BLUE);
        this.closeButton.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.closeButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.BRIGHT_WHITE, 1));
        
        this.techLobbyLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.versionNoLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.versionNoValueLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.developerLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.developerValueLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.telephoneNoLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.telephoneNoValueLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.emailLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.emailValueLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutPanel = new javax.swing.JPanel();
        techLobbyLabel = new javax.swing.JLabel();
        versionNoLabel = new javax.swing.JLabel();
        developerLabel = new javax.swing.JLabel();
        telephoneNoLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        telephoneNoValueLabel = new javax.swing.JLabel();
        emailValueLabel = new javax.swing.JLabel();
        developerValueLabel = new javax.swing.JLabel();
        versionNoValueLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();

        setFrameIcon(new javax.swing.ImageIcon(ClassLoader.getSystemClassLoader().getResource("icon/about_button_dark.png"))); // NOI18N

        aboutPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        techLobbyLabel.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        techLobbyLabel.setText("TechLobby POS System");

        versionNoLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        versionNoLabel.setText("Version no.");

        developerLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        developerLabel.setText("Developer ");

        telephoneNoLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        telephoneNoLabel.setText("Telephone no.");

        emailLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        emailLabel.setText("Email");

        telephoneNoValueLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        telephoneNoValueLabel.setText("+94719084020");

        emailValueLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        emailValueLabel.setText("oshan.ivantha@gmail.com");

        developerValueLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        developerValueLabel.setText("O.I.Mudannayake");

        versionNoValueLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        versionNoValueLabel.setText("1.0.0");

        closeButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        closeButton.setText("Close");
        closeButton.setBorder(null);
        closeButton.setFocusPainted(false);
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout aboutPanelLayout = new javax.swing.GroupLayout(aboutPanel);
        aboutPanel.setLayout(aboutPanelLayout);
        aboutPanelLayout.setHorizontalGroup(
            aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telephoneNoLabel)
                    .addComponent(emailLabel)
                    .addComponent(developerLabel)
                    .addComponent(versionNoLabel))
                .addGap(18, 18, 18)
                .addGroup(aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(versionNoValueLabel)
                    .addComponent(developerValueLabel)
                    .addComponent(emailValueLabel)
                    .addComponent(telephoneNoValueLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutPanelLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutPanelLayout.createSequentialGroup()
                        .addComponent(techLobbyLabel)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutPanelLayout.createSequentialGroup()
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        aboutPanelLayout.setVerticalGroup(
            aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(techLobbyLabel)
                .addGap(39, 39, 39)
                .addGroup(aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(versionNoLabel)
                    .addComponent(versionNoValueLabel))
                .addGap(18, 18, 18)
                .addGroup(aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(developerLabel)
                    .addComponent(developerValueLabel))
                .addGap(18, 18, 18)
                .addGroup(aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephoneNoLabel)
                    .addComponent(telephoneNoValueLabel))
                .addGap(18, 18, 18)
                .addGroup(aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aboutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aboutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseEntered
        this.closeButton.setBackground(ColourPalatte.VERY_DARK_BLUE);
        this.closeButton.setForeground(ColourPalatte.FONT_BLUE);
        this.closeButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.FONT_BLUE, 1));
    }//GEN-LAST:event_closeButtonMouseEntered

    private void closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseExited
        this.closeButton.setBackground(ColourPalatte.DARK_BLUE);
        this.closeButton.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.closeButton.setBorder(BorderFactory.createLineBorder(ColourPalatte.BRIGHT_WHITE, 1));
    }//GEN-LAST:event_closeButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutPanel;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel developerLabel;
    private javax.swing.JLabel developerValueLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailValueLabel;
    private javax.swing.JLabel techLobbyLabel;
    private javax.swing.JLabel telephoneNoLabel;
    private javax.swing.JLabel telephoneNoValueLabel;
    private javax.swing.JLabel versionNoLabel;
    private javax.swing.JLabel versionNoValueLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateViewInternalFrameListener(InternalFrameListener ifl) {
        this.addInternalFrameListener(ifl);
    }
    
    public void addCloseButtonActionListener(ActionListener al){
        closeButton.addActionListener(al);
    }
}
