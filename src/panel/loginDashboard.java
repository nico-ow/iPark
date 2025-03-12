package panel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import admin.adminDB;
import config.connectDB;
import java.awt.Color;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import user.userPanel;
/**
 *
 * @author mendo
 */
public class loginDashboard extends javax.swing.JFrame {

    /**
     * Creates new form loginDashboard
     */
    public loginDashboard() {
        initComponents();
    }
    Color lightGray = new Color(211, 211, 211);
    Color lightBlue = new Color(173, 216, 230);
    Color charcoal = new Color(28, 28, 28);
    Color teal = new Color(0, 128, 128);
    Color orange = new Color(255,153,0);
    Color purple = new Color(102,102,255);
    Color skyblue = new Color(102,255,255);
    Color pink= new Color(255,153,204);

        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        left = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        right = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        signup = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        no_1 = new javax.swing.JPanel();
        no_2 = new javax.swing.JPanel();
        no_4 = new javax.swing.JPanel();
        no_5 = new javax.swing.JPanel();
        no_3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left.setBackground(new java.awt.Color(0, 128, 128));
        left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ipark.png"))); // NOI18N
        left.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 420, 440));

        getContentPane().add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 420));

        right.setBackground(new java.awt.Color(255, 255, 255));
        right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 128, 128));
        jLabel2.setText("LOGIN");
        right.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setText("Username");
        right.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        username.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        right.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 290, 35));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("Password");
        right.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        right.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, 35));

        signup.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        signup.setForeground(new java.awt.Color(0, 128, 128));
        signup.setText("Sign Up");
        signup.setBorder(null);
        signup.setContentAreaFilled(false);
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        right.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 50, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setText("I don't have an account");
        right.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 20));

        login.setBackground(new java.awt.Color(0, 128, 128));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Login");
        login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, -1, 30, 30));

        right.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, 30));

        no_1.setBackground(new java.awt.Color(173, 216, 230));
        no_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                no_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                no_1MouseExited(evt);
            }
        });
        no_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        right.add(no_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 20, 20));

        no_2.setBackground(new java.awt.Color(173, 216, 230));
        no_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                no_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                no_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                no_2MouseExited(evt);
            }
        });
        no_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        right.add(no_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 20, 20));

        no_4.setBackground(new java.awt.Color(173, 216, 230));
        no_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                no_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                no_4MouseExited(evt);
            }
        });
        no_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        right.add(no_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 20, 20));

        no_5.setBackground(new java.awt.Color(173, 216, 230));
        no_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                no_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                no_5MouseExited(evt);
            }
        });
        no_5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        right.add(no_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 20, 20));

        no_3.setBackground(new java.awt.Color(173, 216, 230));
        no_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                no_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                no_3MouseExited(evt);
            }
        });
        no_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        right.add(no_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 20, 20));

        getContentPane().add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 370, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
      
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
      
        
    }//GEN-LAST:event_signupActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
     String url = "jdbc:mysql://localhost:3306/ipark";
String user = "root";
String password1 = "";

String query = "SELECT u_password, u_type FROM tbl_user WHERE u_username = ? AND u_status = 'Approved'";

try (Connection conn = DriverManager.getConnection(url, user, password1);
     PreparedStatement pstmt = conn.prepareStatement(query)) {

    pstmt.setString(1, username.getText());
    ResultSet rs = pstmt.executeQuery();

    if (rs.next()) {
        String storedPassword = rs.getString("u_password");
        String userType = rs.getString("u_type"); 

        if (password.getText().equals(storedPassword)) {
            JOptionPane.showMessageDialog(null, "Login Successful!");

            // Redirect based on user type
            if ("User".equalsIgnoreCase(userType)) {
                userPanel csdb = new userPanel();
                this.dispose();
                csdb.setVisible(true);
            } else if ("Admin".equalsIgnoreCase(userType)) {
                adminDB dbd = new adminDB();
                this.dispose();
                dbd.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Unknown user type!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Wrong Username or Password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "User not found or inactive!", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
       login.setBackground(lightGray);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
       login.setBackground(teal);
    }//GEN-LAST:event_loginMouseExited

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        signupDashboard up = new signupDashboard();
         up.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_signupMouseClicked

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
    
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
     
    }//GEN-LAST:event_passwordFocusLost

    private void no_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_1MouseEntered
          no_1.setBackground(orange);
    }//GEN-LAST:event_no_1MouseEntered

    private void no_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_1MouseExited
          no_1.setBackground(lightBlue);
    }//GEN-LAST:event_no_1MouseExited

    private void no_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_no_2MouseClicked

    private void no_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_2MouseEntered
       no_2.setBackground(teal);
    }//GEN-LAST:event_no_2MouseEntered

    private void no_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_2MouseExited
         no_2.setBackground(lightBlue);
    }//GEN-LAST:event_no_2MouseExited

    private void no_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_3MouseEntered
      no_3.setBackground(pink);
    }//GEN-LAST:event_no_3MouseEntered

    private void no_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_3MouseExited
      no_3.setBackground(lightBlue);
    }//GEN-LAST:event_no_3MouseExited

    private void no_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_4MouseEntered
        no_4.setBackground(skyblue);
    }//GEN-LAST:event_no_4MouseEntered

    private void no_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_4MouseExited
         no_4.setBackground(lightBlue);
    }//GEN-LAST:event_no_4MouseExited

    private void no_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_5MouseEntered
       no_5.setBackground(purple);
    }//GEN-LAST:event_no_5MouseEntered

    private void no_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_5MouseExited
         no_5.setBackground(lightBlue);
    }//GEN-LAST:event_no_5MouseExited

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
            java.util.logging.Logger.getLogger(loginDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel left;
    private javax.swing.JPanel login;
    private javax.swing.JPanel no_1;
    private javax.swing.JPanel no_2;
    private javax.swing.JPanel no_3;
    private javax.swing.JPanel no_4;
    private javax.swing.JPanel no_5;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel right;
    private javax.swing.JButton signup;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}
