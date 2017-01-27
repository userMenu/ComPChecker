
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tom
 */
public class CreateAccountAdmin extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccountAdmin() {
        initComponents();
        
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
        lblusername = new javax.swing.JLabel();
        txtboxUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblFname = new javax.swing.JLabel();
        lblSname = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtboxName = new javax.swing.JTextField();
        txtboxSurname = new javax.swing.JTextField();
        txtboxEmail = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblConfPassword = new javax.swing.JLabel();
        passwordfield = new javax.swing.JPasswordField();
        passwordconfirmfield = new javax.swing.JPasswordField();
        lblLogo = new javax.swing.JLabel();
        lblusername1 = new javax.swing.JLabel();
        comboboxType = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblusername.setText("Username:");

        lblPassword.setText("Password:");

        lblFname.setText("Forename:");

        lblSname.setText("Surname:");

        lblEmail.setText("Email:");

        txtboxName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtboxNameActionPerformed(evt);
            }
        });

        btnSubmit.setText("Create Account");
        btnSubmit.setActionCommand("CreateAccount");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblConfPassword.setText("Confirm Password:");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        lblLogo.setText("jLabel1");

        lblusername1.setText("Type:");

        comboboxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General User", "Admin" }));
        comboboxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFname)
                            .addComponent(lblSname)
                            .addComponent(lblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtboxName)
                            .addComponent(txtboxSurname)
                            .addComponent(txtboxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblusername)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPassword)
                                .addGap(3, 3, 3))
                            .addComponent(lblConfPassword)
                            .addComponent(lblusername1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtboxUsername)
                            .addComponent(passwordfield)
                            .addComponent(passwordconfirmfield, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(comboboxType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(73, 73, 73)
                .addComponent(btnSubmit)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblLogo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblusername1)
                            .addComponent(comboboxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblusername)
                            .addComponent(txtboxUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConfPassword)
                            .addComponent(passwordconfirmfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFname)
                            .addComponent(txtboxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSname)
                            .addComponent(txtboxSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtboxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(44, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtboxNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtboxNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtboxNameActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String username = txtboxUsername.getText();
        String password = String.valueOf(passwordfield.getPassword());
        String passwordConfirm = String.valueOf(passwordconfirmfield.getPassword());

        String name = txtboxName.getText();
        String surname = txtboxSurname.getText();
        String email = txtboxEmail.getText();
        String type = comboboxType.toString();
        boolean admin = false;
        if(type == "Admin"){
            admin = true;
    
        }            
            
            
     
        
        
        
        
        boolean confirm = true;
        
        if((username.isEmpty()|| password.isEmpty()) || passwordConfirm.isEmpty() || name.isEmpty() || surname.isEmpty() || email.isEmpty()){
          
        confirm = false;
        }
        
        
        if (confirm) { //Checks to see all fields are complete.
            int emailValidation = email.indexOf('@');
            if (emailValidation >= 0) {
                int nameLength = name.length();
                int surnameLength = surname.length();
                if (surnameLength <= 45) {
                    if (nameLength <= 45) {
                        UserAccount user = new UserAccount();
                        boolean result = user.usernameAvailability(username);
                        if (result) {
                            user.setUsername(username);
                            String hexPassword = password;
                            user.setPassword(password);
                            user.setFname(name);
                            user.setSname(surname);
                            user.setEmail(email);
                            user.setType(admin);
                            user.saveUser();

                            JOptionPane.showMessageDialog(null, "Account Created. You will be returned to the Log In Page", "Account Created", JOptionPane.INFORMATION_MESSAGE);
                            LogIn frm = new LogIn();
                            this.setVisible(false);
                            frm.setVisible(true);

                        }else{
                         JOptionPane.showMessageDialog(null, "Account in use, ","", JOptionPane.INFORMATION_MESSAGE);
                        
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Name too long.", "", JOptionPane.INFORMATION_MESSAGE);

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "Surname too long.", "", JOptionPane.INFORMATION_MESSAGE);

                }

            } else {
                JOptionPane.showMessageDialog(null, "Email Issue: Please ensure the email field contains an '@'.", "Email Issue", JOptionPane.INFORMATION_MESSAGE);

            }

        } else {

            JOptionPane.showMessageDialog(null, "Please complete all fields!", "Complete All fields", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btnSubmitActionPerformed

    private void comboboxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxTypeActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> comboboxType;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblConfPassword;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSname;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel lblusername1;
    private javax.swing.JPasswordField passwordconfirmfield;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JTextField txtboxEmail;
    private javax.swing.JTextField txtboxName;
    private javax.swing.JTextField txtboxSurname;
    private javax.swing.JTextField txtboxUsername;
    // End of variables declaration//GEN-END:variables
}
