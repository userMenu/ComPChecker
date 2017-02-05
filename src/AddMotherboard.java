
import static java.lang.Double.parseDouble;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class AddMotherboard extends javax.swing.JDialog {

    /**
     * Creates new form AddCPU
     */
    public AddMotherboard(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        populateComboBoxes();
    }

    public AddMotherboard() {

        initComponents();
        populateComboBoxes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmboxSocket1 = new javax.swing.JComboBox<>();
        txtboxSlots1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmboxMake = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtboxModel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtboxPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmboxSocket = new javax.swing.JComboBox<>();
        cmboxFormFactor = new javax.swing.JComboBox<>();
        txtboxSlots = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmboxRAMType = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtboxmaxRAM = new javax.swing.JTextField();

        cmboxSocket1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmboxSocket1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxSocket1ActionPerformed(evt);
            }
        });

        jLabel8.setText("RAM Slots:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cmboxMake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmboxMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxMakeActionPerformed(evt);
            }
        });

        jLabel1.setText("Make:");

        jLabel2.setText("Socket:");

        jLabel3.setText("Form Factor:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel5.setText("Model:");

        jLabel6.setText("Price:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Motherboard");

        cmboxSocket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmboxSocket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxSocketActionPerformed(evt);
            }
        });

        cmboxFormFactor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmboxFormFactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxFormFactorActionPerformed(evt);
            }
        });

        jLabel7.setText("RAM Slots:");

        jLabel9.setText("Ram Type:");

        cmboxRAMType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmboxRAMType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxRAMTypeActionPerformed(evt);
            }
        });

        jLabel10.setText("Max RAM:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(cmboxMake, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtboxModel)
                            .addComponent(txtboxPrice)
                            .addComponent(cmboxSocket, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmboxFormFactor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmboxRAMType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtboxSlots)
                            .addComponent(txtboxmaxRAM, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboxMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtboxModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtboxPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmboxSocket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmboxFormFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmboxRAMType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtboxSlots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtboxmaxRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmboxMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxMakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxMakeActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        Motherboard motherboard = new Motherboard();

        String make = cmboxMake.getSelectedItem().toString();
        String model = txtboxModel.getText();
        double price = Double.parseDouble(txtboxPrice.getText());
        String socket = cmboxSocket.getSelectedItem().toString();
        String size = cmboxFormFactor.getSelectedItem().toString();
        int slots = Integer.parseInt(txtboxSlots.getText());
        int maxRAM = Integer.parseInt(txtboxmaxRAM.getText());
      
        motherboard.setMake(make);
        motherboard.setModel(model);
        motherboard.setPrice(price);
        motherboard.setSize(size);
        motherboard.setSocket(socket);
        motherboard.setRamSlots(slots);
        motherboard.setMaxRAM(maxRAM);
        
        motherboard.saveMotherboard();
        

    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmboxSocketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxSocketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxSocketActionPerformed

    private void cmboxSocket1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxSocket1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxSocket1ActionPerformed

    private void cmboxFormFactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxFormFactorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxFormFactorActionPerformed

    private void cmboxRAMTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxRAMTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxRAMTypeActionPerformed

    private void populateComboBoxes() {

        cmboxMake.removeAllItems();
        ResultSet rs;
        Make make = new Make();
        rs = make.getMakes();
        try {
            while (rs.next()) {
                String dbMake = rs.getString("Name");
                cmboxMake.addItem(dbMake);

            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());   //Prints out SQL error 
        }
        cmboxSocket.removeAllItems();
        ArrayList<String> sockets = new ArrayList<String>();
        sockets.add("LGA1151");
        sockets.add("AM3+");
        sockets.add("LGA2011-3");
        sockets.add("AM3+/AM3");
        sockets.add("FM2+");

        for (int i = 0; i < sockets.size(); i++) {
            cmboxSocket.addItem(sockets.get(i));
        }
        cmboxFormFactor.removeAllItems();
        ArrayList<String> formfactor = new ArrayList<String>();
        formfactor.add("ATX");
        formfactor.add("EATX");
        formfactor.add("Flex ATX");
        formfactor.add("HTPX");
        formfactor.add("Micro ATX");
        formfactor.add("Mini DTX");
        formfactor.add("Mini ITX");
        formfactor.add("SSI CEB");
        formfactor.add("SSI EEB");
        formfactor.add("Thin Mini ITX");
        formfactor.add("EX ATX");

        for (int i = 0; i < formfactor.size(); i++) {
            cmboxFormFactor.addItem(formfactor.get(i));
        }
        cmboxRAMType.removeAllItems();
        cmboxRAMType.addItem("DDR2");
        cmboxRAMType.addItem("DDR3");
        cmboxRAMType.addItem("DDR4");
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddCPU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCPU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCPU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCPU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddCPU dialog = new AddCPU(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmboxFormFactor;
    private javax.swing.JComboBox<String> cmboxMake;
    private javax.swing.JComboBox<String> cmboxRAMType;
    private javax.swing.JComboBox<String> cmboxSocket;
    private javax.swing.JComboBox<String> cmboxSocket1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtboxModel;
    private javax.swing.JTextField txtboxPrice;
    private javax.swing.JTextField txtboxSlots;
    private javax.swing.JTextField txtboxSlots1;
    private javax.swing.JTextField txtboxmaxRAM;
    // End of variables declaration//GEN-END:variables
}