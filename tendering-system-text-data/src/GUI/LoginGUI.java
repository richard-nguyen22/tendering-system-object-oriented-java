package GUI;

import classes.Admin;
import classes.Login;
import classes.Manager;
import classes.Officer;
import classes.Staff;
import javax.swing.JOptionPane;

public class LoginGUI extends javax.swing.JFrame {

  /**
   * Creates new form LoginGUI
   */
  public LoginGUI() {
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

    jLabel1 = new javax.swing.JLabel();
    userName = new javax.swing.JTextField();
    userPass = new javax.swing.JPasswordField();
    login_button = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    exit_button = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Tendering software");

    userName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    userPass.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    login_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    login_button.setText("Login");
    login_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        login_buttonActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel2.setText("User name:");

    jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel3.setText("Password:");

    exit_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    exit_button.setText("Exit");
    exit_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exit_buttonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(51, 51, 51)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel2))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(userName)
              .addComponent(userPass, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(76, 76, 76)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(0, 37, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGap(63, 63, 63)
        .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(49, 49, 49)
        .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(userPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(30, 30, 30)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(35, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
    // TODO add your handling code here:
    String user_name = userName.getText();
    char[] user_char = userPass.getPassword();
    String user_pass = new String(user_char);
    if (user_name.equals("") & user_pass.equals("")) {
      JOptionPane.showMessageDialog(null, "No user name & password. Enter user name & password");
      return;
    } else if (user_name.equals("")) {
      JOptionPane.showMessageDialog(null, "No user name. Enter user name");
      return;
    } else if (user_pass.equals("")) {
      JOptionPane.showMessageDialog(null, "No password. Enter password");
      return;
    }
    if (!Login.verify(user_name, user_pass)) {
      JOptionPane.showMessageDialog(null, "Log in fail");
      return;
    }
    Staff staff = Login.getStaff(user_name);
    main.staff = staff;
    if (staff instanceof Admin) {
      JOptionPane.showMessageDialog(null, "Log in success. Log in as Admin");
      AdminGUI new_GUI = new AdminGUI();
      this.dispose();
      new_GUI.setLocationRelativeTo(null);
      new_GUI.setVisible(true);
    } else if (staff instanceof Manager) {
      JOptionPane.showMessageDialog(null, "Log in success. Log in as Manager");
      ManagerGUI new_GUI = new ManagerGUI();
      this.dispose();
      new_GUI.setLocationRelativeTo(null);
      new_GUI.setVisible(true);
    } else if (staff instanceof Officer) {
      JOptionPane.showMessageDialog(null, "Log in success. Log in as Officer");
      OfficerGUI new_GUI = new OfficerGUI();
      this.dispose();
      new_GUI.setLocationRelativeTo(null);
      new_GUI.setVisible(true);
    }
  }//GEN-LAST:event_login_buttonActionPerformed

  private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
    // TODO add your handling code here:
    int dialog_button = JOptionPane.YES_NO_OPTION;
    int dialog_result = JOptionPane.showConfirmDialog(null, "Do you want exit tendering software?","Exit confirmation",dialog_button);
    if (dialog_result == 0) {
      this.dispose();
    }
  }//GEN-LAST:event_exit_buttonActionPerformed
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton exit_button;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JButton login_button;
  private javax.swing.JTextField userName;
  private javax.swing.JPasswordField userPass;
  // End of variables declaration//GEN-END:variables
}
