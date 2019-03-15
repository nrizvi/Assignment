/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstdraft;

/**
 *
 * @author aelek
 */
public class EditSwitchWindow extends javax.swing.JFrame {

    /**
     * Creates new form EditHostWindow
     */
    public EditSwitchWindow() {
        initComponents();
    }
    Switch oldSwitch;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hostOSNameField = new javax.swing.JLabel();
        hostOSField = new javax.swing.JTextField();
        hostOSVersionNameField = new javax.swing.JLabel();
        hostIPAddressNameField = new javax.swing.JLabel();
        hostSubnetMaskNameField = new javax.swing.JLabel();
        hostDefaultGatewayNameField = new javax.swing.JLabel();
        hostDNSNameField = new javax.swing.JLabel();
        hostOSVersionField = new javax.swing.JTextField();
        hostIPAddressField = new javax.swing.JTextField();
        hostSubnetMaskField = new javax.swing.JTextField();
        hostDefaultGatewayField = new javax.swing.JTextField();
        hostDNSField = new javax.swing.JTextField();
        hostName = new javax.swing.JTextField();
        editAcceptButton = new javax.swing.JButton();
        editCancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Host:");

        hostOSNameField.setText("OS:");

        hostOSField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostOSFieldActionPerformed(evt);
            }
        });

        hostOSVersionNameField.setText("OS Version:");

        hostIPAddressNameField.setText("IP Address:");

        hostSubnetMaskNameField.setText("Subnet Mask");

        hostDefaultGatewayNameField.setText("Default Gateway:");

        hostDNSNameField.setText("DNS");

        hostName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostNameActionPerformed(evt);
            }
        });

        editAcceptButton.setText("Accept");
        editAcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAcceptButtonActionPerformed(evt);
            }
        });

        editCancelButton.setText("Cancel");
        editCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hostOSNameField)
                    .addComponent(hostOSVersionNameField)
                    .addComponent(hostIPAddressNameField)
                    .addComponent(hostSubnetMaskNameField)
                    .addComponent(hostDNSNameField)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(editAcceptButton)
                        .addComponent(hostDefaultGatewayNameField)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editCancelButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jLabel2))
                        .addComponent(hostOSField)
                        .addComponent(hostOSVersionField)
                        .addComponent(hostIPAddressField)
                        .addComponent(hostSubnetMaskField)
                        .addComponent(hostDefaultGatewayField)
                        .addComponent(hostDNSField)
                        .addComponent(hostName, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hostName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostOSNameField)
                    .addComponent(hostOSField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostOSVersionNameField)
                    .addComponent(hostOSVersionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hostIPAddressNameField)
                    .addComponent(hostIPAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hostSubnetMaskNameField)
                    .addComponent(hostSubnetMaskField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hostDefaultGatewayNameField)
                    .addComponent(hostDefaultGatewayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hostDNSNameField)
                    .addComponent(hostDNSField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editAcceptButton)
                    .addComponent(editCancelButton))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hostOSFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostOSFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostOSFieldActionPerformed

    private void editAcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAcceptButtonActionPerformed
        setProperties(oldSwitch);
        this.setVisible(false);
        
    }//GEN-LAST:event_editAcceptButtonActionPerformed

    private void editCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_editCancelButtonActionPerformed

    private void hostNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostNameActionPerformed

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
            java.util.logging.Logger.getLogger(EditSwitchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSwitchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSwitchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSwitchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSwitchWindow().setVisible(true);
            }
        });
    }

    public void getProperties(Switch obj) {
        oldSwitch = obj;
        hostName.setText(obj.name);
        hostOSField.setText(obj.os);
        hostOSVersionField.setText(obj.osversion);
        hostSubnetMaskField.setText(obj.subnetmask);
        hostDefaultGatewayField.setText(obj.defaultgateway);
        hostDNSField.setText(obj.dns);
        hostIPAddressField.setText(obj.ip);
    }    
    
    public void setProperties(Switch obj) {
        obj.setName(this.hostName.getText());
        obj.setIP(this.hostIPAddressField.getText());
        obj.setOS(this.hostOSField.getText());
        obj.setOSVersion(this.hostOSVersionField.getText());
        obj.setSubnetMask(this.hostSubnetMaskField.getText());
        obj.setDefaultGateway(this.hostDefaultGatewayField.getText());
        obj.setDNS(this.hostDNSField.getText());
        
        
        
    }
    
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editAcceptButton;
    private javax.swing.JButton editCancelButton;
    private javax.swing.JTextField hostDNSField;
    private javax.swing.JLabel hostDNSNameField;
    private javax.swing.JTextField hostDefaultGatewayField;
    private javax.swing.JLabel hostDefaultGatewayNameField;
    private javax.swing.JTextField hostIPAddressField;
    private javax.swing.JLabel hostIPAddressNameField;
    private javax.swing.JTextField hostName;
    private javax.swing.JTextField hostOSField;
    private javax.swing.JLabel hostOSNameField;
    private javax.swing.JTextField hostOSVersionField;
    private javax.swing.JLabel hostOSVersionNameField;
    private javax.swing.JTextField hostSubnetMaskField;
    private javax.swing.JLabel hostSubnetMaskNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}