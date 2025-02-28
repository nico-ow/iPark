/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
/**
 *
 * @author mendo
 */
public class signupDashboard extends javax.swing.JFrame {

    /**
     * Creates new form signupDashboard
     */
    public signupDashboard() {
        initComponents();
    }
    Color lightGray = new Color(211, 211, 211);
    Color lightBlue = new Color(173, 216, 230);
    Color charcoal = new Color(28, 28, 28);
    Color teal = new Color(0, 128, 128);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sign = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        to_login = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        confirm = new javax.swing.JPasswordField();
        gender = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 128, 128));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 450));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CREATE ACCOUNT");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 160, -1));

        firstname.setText(" ");
        jPanel3.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 200, 30));

        jLabel2.setText("Firstname");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel3.setText("Email");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 200, 30));

        jLabel4.setText("Phone No.");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 20));
        jPanel3.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 200, 30));

        jLabel5.setText("Gender");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel7.setText("Type");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        sign.setBackground(new java.awt.Color(0, 128, 128));
        sign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signMouseExited(evt);
            }
        });
        sign.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Sign Up");
        sign.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 30));

        jPanel3.add(sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 80, -1));

        to_login.setBackground(new java.awt.Color(0, 128, 128));
        to_login.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        to_login.setForeground(new java.awt.Color(0, 128, 128));
        to_login.setText("I have an account");
        to_login.setContentAreaFilled(false);
        to_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_loginActionPerformed(evt);
            }
        });
        jPanel3.add(to_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 120, -1));

        jLabel8.setText("Lastname");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        lname.setText(" ");
        jPanel3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 200, 30));

        jLabel9.setText("Address");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel3.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 200, 30));

        jLabel10.setText("Username");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, 20));
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 200, 30));

        jLabel11.setText("Password");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 200, 30));

        jLabel12.setText("Confirm Password");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel3.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 200, 30));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel3.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 200, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 200, 30));

        jPanel6.setBackground(new java.awt.Color(173, 216, 230));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 20, 20));

        jPanel11.setBackground(new java.awt.Color(173, 216, 230));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 20, 20));

        jPanel10.setBackground(new java.awt.Color(173, 216, 230));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 20, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 570, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void to_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_to_loginActionPerformed

    private void signMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signMouseExited
        sign.setBackground(teal);
    }//GEN-LAST:event_signMouseExited

    private void signMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signMouseEntered
        sign.setBackground(lightGray);
    }//GEN-LAST:event_signMouseEntered

    private void signMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signMouseClicked
        
    }//GEN-LAST:event_signMouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

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
            java.util.logging.Logger.getLogger(signupDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JPasswordField confirm;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField phone;
    private javax.swing.JPanel sign;
    private javax.swing.JButton to_login;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
