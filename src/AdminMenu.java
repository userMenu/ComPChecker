
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luke
 */
public class AdminMenu extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenu
     */
    UserAccount currentUser;    //Now from the menu, this user var can be passed to other forms
                                //If it needs to be accessed in another form not in the method passed to...
                                //... then just assign it to a new var again like this (better way to do this?)

    public AdminMenu() {
        initComponents();
    }

    public AdminMenu(UserAccount user) {
        initComponents();
        this.setTitle("Admin Menu");     //Adds a title to the frame
        setLocationRelativeTo(null);    //Centers the frame in the middle of ths screen
        currentUser = user;     //Assigns the user variable passed to this method to a new var
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdminMenu = new javax.swing.JLabel();
        btnCreateAcc = new javax.swing.JButton();
        btnDeleteAcc = new javax.swing.JButton();
        btnAddComp = new javax.swing.JButton();
        btnCreateBuild = new javax.swing.JButton();
        btnViewBuild = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        btnAddMake = new javax.swing.JButton();
        btnNewComponent = new javax.swing.JButton();
        btnEditBuild = new javax.swing.JButton();
        btnEditAcc = new javax.swing.JButton();
        btnEditComp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        lblAdminMenu.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lblAdminMenu.setText("Admin Menu");

        btnCreateAcc.setText("Create Account");
        btnCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccActionPerformed(evt);
            }
        });

        btnDeleteAcc.setText("View Accounts");
        btnDeleteAcc.setMaximumSize(new java.awt.Dimension(107, 23));
        btnDeleteAcc.setMinimumSize(new java.awt.Dimension(107, 23));
        btnDeleteAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccActionPerformed(evt);
            }
        });

        btnAddComp.setText("View Components");
        btnAddComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCompActionPerformed(evt);
            }
        });

        btnCreateBuild.setText("Create Build");
        btnCreateBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateBuildActionPerformed(evt);
            }
        });

        btnViewBuild.setText("View Builds");
        btnViewBuild.setMaximumSize(new java.awt.Dimension(107, 23));
        btnViewBuild.setMinimumSize(new java.awt.Dimension(107, 23));
        btnViewBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBuildActionPerformed(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        btnAddMake.setText("Add New Make");
        btnAddMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMakeActionPerformed(evt);
            }
        });

        btnNewComponent.setText("New Component");
        btnNewComponent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewComponentActionPerformed(evt);
            }
        });

        btnEditBuild.setText("Edit Build");
        btnEditBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditBuildActionPerformed(evt);
            }
        });

        btnEditAcc.setText("Edit Account");
        btnEditAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAccActionPerformed(evt);
            }
        });

        btnEditComp.setText("Edit Component");
        btnEditComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCompActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditAcc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreateAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNewComponent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAdminMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddComp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditComp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddMake, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditBuild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewBuild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreateBuild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(103, 103, 103))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAdminMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateBuild, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewComponent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditBuild, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditComp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddComp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewBuild, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddMake, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccActionPerformed
        this.setVisible(false);
        //new DeleteAccount().setVisible(true);
    }//GEN-LAST:event_btnDeleteAccActionPerformed

    private void btnAddCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCompActionPerformed
        this.setVisible(false);
        //new AddComponent().setVisible(true);
    }//GEN-LAST:event_btnAddCompActionPerformed

    private void btnViewBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBuildActionPerformed
        this.setVisible(false);
        new CreateBuild().setVisible(true);
    }//GEN-LAST:event_btnViewBuildActionPerformed

    private void btnCreateBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateBuildActionPerformed
        this.setVisible(false);
        new CreateBuild().setVisible(true);
    }//GEN-LAST:event_btnCreateBuildActionPerformed

    private void btnCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccActionPerformed
        this.setVisible(false);
        new CreateAccountAdmin().setVisible(true);
    }//GEN-LAST:event_btnCreateAccActionPerformed

    private void btnAddMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMakeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AddMake().setVisible(true);
    }//GEN-LAST:event_btnAddMakeActionPerformed

    private void btnNewComponentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewComponentActionPerformed
        // TODO add your handling code here:
        String[] choices = {"Accessory", "CPU", "Cooler", "GPU", "Make", "Motherboard", "Case", "PSU", "RAM", "Storage"};
        String input = (String) JOptionPane.showInputDialog(null, "Which type of part is being added?",
                "New Part", JOptionPane.QUESTION_MESSAGE, null, // Use
                // default
                // icon
                choices, // Array of choices
                choices[0]); // Initial choice
        switch (input) {

            case "Accessory":
                break;

            case "CPU":
                this.setVisible(false);
                new AddCPU(currentUser).setVisible(true);
                break;

            case "Motherboard":
                this.setVisible(false);
                new AddMotherboard(currentUser).setVisible(true);
                break;

            case "RAM":
                this.setVisible(false);
                new addRAM(currentUser).setVisible(true);
                break;

        }
    }//GEN-LAST:event_btnNewComponentActionPerformed

    private void btnEditBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditBuildActionPerformed
        String[] choices = {"Build 1", "Build 2", "Build 3"};
        
        new EditBuild(currentUser, null).setVisible(true);
        this.setVisible(false);
        //Need build names here to be pulled from DB7
        
        
        
        /*String input = (String) JOptionPane.showInputDialog(null, "Which build would you like to edit?",
                "Edit Build", JOptionPane.QUESTION_MESSAGE, null, // Use
                // default
                // icon
                choices, // Array of choices
                choices[0]); // Initial choice
        
               new EditBuild(currentUser, input).setVisible(true);
        
       switch (input) {

            case "Build 1":
                this.setVisible(false);
                new EditBuild(currentUser, input).setVisible(true);
                break;

            case "Build 2":
                this.setVisible(false);
                new EditBuild(currentUser, input).setVisible(true);
                break;

            case "Build 3":
                this.setVisible(false);
                new EditBuild(currentUser, input).setVisible(true);
                break;
        }
        */
    //
    }//GEN-LAST:event_btnEditBuildActionPerformed

    private void btnEditAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditAccActionPerformed

    private void btnEditCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditCompActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddComp;
    private javax.swing.JButton btnAddMake;
    private javax.swing.JButton btnCreateAcc;
    private javax.swing.JButton btnCreateBuild;
    private javax.swing.JButton btnDeleteAcc;
    private javax.swing.JButton btnEditAcc;
    private javax.swing.JButton btnEditBuild;
    private javax.swing.JButton btnEditComp;
    private javax.swing.JButton btnNewComponent;
    private javax.swing.JButton btnViewBuild;
    private javax.swing.JLabel lblAdminMenu;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
