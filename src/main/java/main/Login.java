/*
 * Copyright © 02.10.2015 by O.I.Mudannayake. All Rights Reserved.
 */
package main;

import cache.EmployeeCache;
import entity.Employee;
import database.sql.SQLStatement;
import database.sql.SQLFactory;
import controller.ControllerFactory;
import controller.Interface;
import database.sql.type.EmployeeManagementSQL;
import entity.job.Job;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import ui.ColourPalatte;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import static main.support.Resources.ExportResource;

/**
 *
 * @author Ivantha
 */
public class Login extends javax.swing.JFrame {

    private final EmployeeManagementSQL employeeManagementSQL = (EmployeeManagementSQL) SQLFactory.getSQLStatement(SQLStatement.EMPLOYEE_MANAGEMENT);

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemClassLoader().getResource("icon/tech_lobby_logo.png")));

        //Background
        ImageIcon backgroundPanelWallpaper = new ImageIcon(ClassLoader.getSystemClassLoader().getResource("icon/login_background_label_wallpaper.jpg"));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        this.backgroundLabel.setIcon(new ImageIcon(backgroundPanelWallpaper.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));

        //Login panel
        this.loginLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.employeeIDLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.employeeIDText.setBackground(ColourPalatte.PALE_WHITE);
        this.passwordLabel.setForeground(ColourPalatte.BRIGHT_WHITE);
        this.passwordField.setBackground(ColourPalatte.PALE_WHITE);

        this.errorMessageLabel.setText(null);
        this.errorMessageLabel.setBackground(ColourPalatte.DARK_BLUE);
        this.errorMessageLabel.setForeground(ColourPalatte.FONT_ORANGE);

        File resourceDirectory = new File(System.getProperty("user.dir"), "resources");
        if (!resourceDirectory.exists()) {
            resourceDirectory.mkdir();
        }
//        try {
//            String fullPath = ExportResource("/resources/Project.txt");
//            Runtime.getRuntime().exec("notepad.exe " + fullPath);
//        } catch (IOException ex) {
//            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (Exception ex) {
//            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        backgroundPanel = new javax.swing.JPanel();
        backgroundLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        employeeIDLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        logInButton = new javax.swing.JButton();
        employeeIDText = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        errorMessageLabel = new javax.swing.JLabel();
        techLobbyBannerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );

        mainPanel.setOpaque(false);

        loginPanel.setOpaque(false);
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLabel.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Login");
        loginPanel.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 26, 84, 49));

        employeeIDLabel.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        employeeIDLabel.setText("Employee ID");
        loginPanel.add(employeeIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 94, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        passwordLabel.setText("Password");
        loginPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 147, -1, -1));

        logInButton.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        logInButton.setIcon(new javax.swing.ImageIcon(ClassLoader.getSystemClassLoader().getResource("icon/login_button_dark.png"))); // NOI18N
        logInButton.setToolTipText("");
        logInButton.setBorder(null);
        logInButton.setOpaque(false);
        logInButton.setPressedIcon(new javax.swing.ImageIcon(ClassLoader.getSystemClassLoader().getResource("icon/login_button_light.png"))); // NOI18N
        logInButton.setRolloverIcon(new javax.swing.ImageIcon(ClassLoader.getSystemClassLoader().getResource("icon/login_button_light.png"))); // NOI18N
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });
        loginPanel.add(logInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, 50));

        employeeIDText.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        employeeIDText.setText("em.0000001");
        employeeIDText.setToolTipText("");
        employeeIDText.setBorder(null);
        employeeIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIDTextActionPerformed(evt);
            }
        });
        loginPanel.add(employeeIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 93, 165, 25));

        passwordField.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        passwordField.setText("cat");
        passwordField.setToolTipText("");
        passwordField.setBorder(null);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        loginPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 146, 165, 25));

        errorMessageLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        errorMessageLabel.setText("<error_message>");
        loginPanel.add(errorMessageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        techLobbyBannerLabel.setIcon(new javax.swing.ImageIcon(ClassLoader.getSystemClassLoader().getResource("icon/tech_lobby_banner_large.png"))); // NOI18N
        techLobbyBannerLabel.setIconTextGap(0);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(techLobbyBannerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 221, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(techLobbyBannerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(backgroundPanel, 1);
        jLayeredPane1.setLayer(mainPanel, 2);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 818, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        this.login();
    }//GEN-LAST:event_logInButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void employeeIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIDTextActionPerformed
        this.login();
    }//GEN-LAST:event_employeeIDTextActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        this.login();
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void login() {
        String employeeID = employeeIDText.getText().trim();
        String password = String.valueOf(passwordField.getPassword());
        Employee employee = null;
        try {
//            employee = employeeManagementSQL.getEmployee(employeeID, password);

            //Bypassing the password
            Job job = new Job() {
                @Override
                public int getJobID() {
                    return 1;
                }

                @Override
                public String getJobTitle() {
                    return "Admin";
                }
            };
            employee = new Employee("em.0000001", "100000000", "Oshan", "xxx", "0000000000", job, "cat");
        } catch (Exception ex) {
            this.errorMessageLabel.setText("Unable to connect to database. Please check your connection.");
        }

        if (employee != null) {
            EmployeeCache.setEmployee(employee);
            DashboardController controller = (DashboardController) ControllerFactory.getController(Interface.DASHBOARD);
            controller.showView(employee);
            this.dispose();
        } else {
            this.errorMessageLabel.setText("Unable to login. Please check your username and/or password");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 /*try {
            UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

            //Button
            UIManager.put("Button.background", ColourPalatte.DARK_BLUE);
            UIManager.put("Button.foreground", ColourPalatte.BRIGHT_WHITE);
            UIManager.put("Button.border", BorderFactory.createLineBorder(ColourPalatte.BRIGHT_WHITE, 1));
            UIManager.put("Button.focus", ColourPalatte.VERY_DARK_BLUE);

            //Tabbed pane
            UIManager.put("TabbedPane.focus", ColourPalatte.FONT_ORANGE);
            UIManager.put("TabbedPane.selected", ColourPalatte.FONT_ORANGE);
            UIManager.put("TabbedPane.contentOpaque", false);
            //
            UIManager.getDefaults().put("TabbedPane.contentBorderInsets", new Insets(0, 0, 0, 0));
            UIManager.getDefaults().put("TabbedPane.tabsOverlapBorder", false);
            //
            UIManager.put("TabbedPane.darkShadow", ColourPalatte.DARK_BLUE);
            UIManager.put("TabbedPane.shadow", ColourPalatte.DARK_BLUE);
            UIManager.put("TabbedPane.highlight", ColourPalatte.DARK_BLUE);

            //Internal frame 
            UIManager.put("InternalFrame.border", BorderFactory.createLineBorder(ColourPalatte.VERY_DARK_BLUE, 1));
            UIManager.put("InternalFrame.titlePaneHeight", 30);
            UIManager.getDefaults().put("InternalFrame.titleFont", new Font("Calibri", Font.PLAIN, 17));
            UIManager.put("InternalFrame.icon", new ImageIcon(ClassLoader.getSystemClassLoader().getResource("icon/tech_lobby_title_bar_dark.png")));
            UIManager.put("InternalFrame.titleButtonHeight", 25);
            UIManager.put("InternalFrame.titleButtonWidth", 25);
            UIManager.put("InternalFrame.iconifyIcon", new ImageIcon(ClassLoader.getSystemClassLoader().getResource("icon/minimize_title_bar.png")));
            UIManager.put("InternalFrame.closeIcon", new ImageIcon(ClassLoader.getSystemClassLoader().getResource("icon/close_title_bar.png")));
            //
            UIManager.put("InternalFrame.activeTitleBackground", ColourPalatte.DARK_BLUE);
            UIManager.put("InternalFrame.activeTitleForeground", ColourPalatte.PALE_WHITE);
            UIManager.put("InternalFrame.activeTitleGradient", ColourPalatte.DARK_BLUE);
            UIManager.put("InternalFrame.activeBorderColor", ColourPalatte.VERY_DARK_BLUE);
            UIManager.put("InternalFrame.inactiveTitleBackground", ColourPalatte.MEDIUM_BLUE);
            UIManager.put("InternalFrame.inactiveTitleForeground", ColourPalatte.PALE_WHITE);
            UIManager.put("InternalFrame.inactiveTitleGradient", ColourPalatte.MEDIUM_BLUE);

            //Scroll pane
            UIManager.put("ScrollPane.border", BorderFactory.createEmptyBorder());

            //Scroll bar
            UIManager.put("ScrollBar.width", 20);
            //
            UIManager.put("ScrollBar.track", ColourPalatte.MEDIUM_BLUE);
            UIManager.put("ScrollBar.trackForeground", ColourPalatte.MEDIUM_BLUE);
            //
            UIManager.put("ScrollBar.thumb", ColourPalatte.MEDIUM_BLUE);
            UIManager.put("ScrollBar.thumbHighlight", ColourPalatte.VERY_DARK_BLUE);
            UIManager.put("ScrollBar.thumbShadow", ColourPalatte.VERY_DARK_BLUE);
            UIManager.put("ScrollBar.thumbDarkShadow", ColourPalatte.VERY_DARK_BLUE);

            //List
            UIManager.put("List.background", ColourPalatte.PALE_WHITE);
            UIManager.put("List.font", new Font("Calibri", Font.PLAIN, 14));

            //Table header
            UIManager.put("TableHeader.background", ColourPalatte.DARK_BLUE);
            UIManager.put("TableHeader.foreground", ColourPalatte.BRIGHT_WHITE);
            UIManager.put("TableHeader.font", new Font("Calibri", Font.PLAIN, 14));

            //Table
            UIManager.put("Table.font", new Font("Calibri", Font.PLAIN, 14));
            UIManager.put("Table.background", ColourPalatte.PALE_WHITE);
            UIManager.put("Table.gridColor", ColourPalatte.DARK_BLUE);
            UIManager.put("Table.focusSelectedCellHighlightBorder", BorderFactory.createEmptyBorder());

            //Combo box
            UIManager.put("ComboBox.border", BorderFactory.createEmptyBorder());
            UIManager.put("ComboBox.buttonBackground", ColourPalatte.MEDIUM_BLUE);
            UIManager.put("ComboBox.buttonDarkShadow", ColourPalatte.VERY_DARK_BLUE);

            //Check box
            UIManager.put("CheckBox.background", ColourPalatte.MEDIUM_BLUE);
            UIManager.put("CheckBox.foreground", ColourPalatte.BRIGHT_WHITE);
            UIManager.put("CheckBox.interiorBackground", ColourPalatte.MEDIUM_BLUE);
            UIManager.put("CheckBox.darkShadow", ColourPalatte.MEDIUM_BLUE);
            UIManager.put("CheckBox.light", ColourPalatte.MEDIUM_BLUE);
            UIManager.put("CheckBox.highlight", ColourPalatte.BRIGHT_WHITE);
            UIManager.put("CheckBox.shadow", ColourPalatte.BRIGHT_WHITE);

            //Combo box
            UIManager.put("RadioButton.background", ColourPalatte.MEDIUM_BLUE);
            UIManager.put("RadioButton.focus", ColourPalatte.MEDIUM_BLUE);
            UIManager.put("RadioButton.foreground", ColourPalatte.BRIGHT_WHITE);
            UIManager.put("RadioButton.interiorBackground", ColourPalatte.MEDIUM_BLUE);
            //
            UIManager.put("RadioButton.highlight", ColourPalatte.BRIGHT_WHITE);
            UIManager.put("RadioButton.light", ColourPalatte.BRIGHT_WHITE);
            UIManager.put("RadioButton.shadow", ColourPalatte.BRIGHT_WHITE);
            UIManager.put("RadioButton.darkShadow", ColourPalatte.BRIGHT_WHITE);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel employeeIDLabel;
    private javax.swing.JTextField employeeIDText;
    private javax.swing.JLabel errorMessageLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton logInButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel techLobbyBannerLabel;
    // End of variables declaration//GEN-END:variables
}
