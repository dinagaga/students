package user;

import admin.*;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import mark2d.loginForm;
import static sun.security.jgss.GSSUtil.login;

public class changePass extends javax.swing.JFrame {

    public changePass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        fname = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        conpass = new javax.swing.JTextField();
        newpass = new javax.swing.JTextField();
        oldpass = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        acc_ln1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        acc_ln2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        iddisplay = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        acc_fn = new javax.swing.JLabel();
        acc_ln = new javax.swing.JLabel();
        cp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 0));
        jPanel4.setLayout(null);

        fname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fname.setText("Type Old Pass:");
        jPanel4.add(fname);
        fname.setBounds(30, 50, 190, 40);

        email.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        email.setText("Confirm Pass:");
        jPanel4.add(email);
        email.setBounds(30, 170, 180, 30);

        lname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lname.setText("Enter New Pass:");
        jPanel4.add(lname);
        lname.setBounds(30, 120, 210, 20);

        conpass.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jPanel4.add(conpass);
        conpass.setBounds(240, 170, 220, 30);

        newpass.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });
        jPanel4.add(newpass);
        newpass.setBounds(240, 120, 220, 30);

        oldpass.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jPanel4.add(oldpass);
        oldpass.setBounds(240, 60, 220, 30);

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(null);

        acc_ln1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        acc_ln1.setText("Save");
        jPanel2.add(acc_ln1);
        acc_ln1.setBounds(30, 10, 38, 17);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(370, 220, 90, 40);

        jPanel6.setBackground(new java.awt.Color(51, 255, 255));
        jPanel6.setLayout(null);

        acc_ln2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        acc_ln2.setText("Back");
        jPanel6.add(acc_ln2);
        acc_ln2.setBounds(30, 10, 38, 17);

        jPanel4.add(jPanel6);
        jPanel6.setBounds(240, 220, 90, 40);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(0, 255, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("CHANGE PASSWORD");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("LOGOUT");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        iddisplay.setBackground(new java.awt.Color(0, 255, 153));
        iddisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        iddisplay.setForeground(new java.awt.Color(0, 0, 204));
        iddisplay.setText("(UID)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(iddisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(iddisplay)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        acc_fn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        acc_fn.setText("USER");

        acc_ln.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        acc_ln.setText("USER");

        cp.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        cp.setText("Change pass");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC11\\Downloads\\icons8-admin-96.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acc_ln)
                            .addComponent(acc_fn))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(acc_fn)
                .addGap(18, 18, 18)
                .addComponent(acc_ln)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(cp)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        loginForm lgf = new loginForm();
        JOptionPane.showMessageDialog(null, "Logged-out!");
        lgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getinstance();

        iddisplay.setText("USER ID:" + sess.getUid());


    }//GEN-LAST:event_formWindowActivated

    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

        try {
            dbConnector dbc = new dbConnector();
            Session sess = Session.getinstance();
          
               
            String query = "SELECT * FROM tbl_user  WHERE u_id = '" +sess.getUid()+ "'";
            ResultSet rs = dbc.getData(query);
            if(rs.next()){
                String olddbpass = rs.getString("u_password");
                String oldhash = passwordHasher.hashPassword(oldpass.getText());

                if (olddbpass.equals(oldhash)){
                    String npass = passwordHasher.hashPassword(newpass.getText());
                    dbc.updateData("UPDATE tbl_user SET u_password = '" +npass+ "'");
                    JOptionPane.showMessageDialog(null, "Successfully Updated!");
                    loginForm lg = new loginForm();
                    lg.setVisible(true);
                    this.dispose();
                }else{
                JOptionPane.showMessageDialog(null, "Old Password is Incorrect!");
                }
                }
                }catch (SQLException | NoSuchAlgorithmException ex){
                    System.out.println(""+ex);
       
            }
    }//GEN-LAST:event_jPanel2MouseClicked

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
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_fn;
    private javax.swing.JLabel acc_ln;
    private javax.swing.JLabel acc_ln1;
    private javax.swing.JLabel acc_ln2;
    private javax.swing.JTextField conpass;
    private javax.swing.JLabel cp;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel iddisplay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lname;
    private javax.swing.JTextField newpass;
    private javax.swing.JTextField oldpass;
    // End of variables declaration//GEN-END:variables
}
