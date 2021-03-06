package GUI;

import classes.Admin;
import classes.Staff;
import javax.swing.JOptionPane;


public class AdminAdd extends javax.swing.JFrame {
  Staff admin = main.staff;

  public AdminAdd() {
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

    jScrollPane7 = new javax.swing.JScrollPane();
    jTextArea7 = new javax.swing.JTextArea();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    back_button = new javax.swing.JButton();
    add_button = new javax.swing.JButton();
    name_field = new javax.swing.JTextField();
    user_name = new javax.swing.JTextField();
    password_field = new javax.swing.JTextField();
    address_field = new javax.swing.JTextField();
    phone_field = new javax.swing.JTextField();
    role_box = new javax.swing.JComboBox<>();

    jTextArea7.setColumns(20);
    jTextArea7.setRows(5);
    jScrollPane7.setViewportView(jTextArea7);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Add new staff");

    jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel2.setText("User name:");

    jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel3.setText("Role:");

    jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel4.setText("Password:");

    jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel5.setText("Address:");

    jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel6.setText("Phone:");

    jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel7.setText("Fullname:");

    back_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    back_button.setText("Back");
    back_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        back_buttonActionPerformed(evt);
      }
    });

    add_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    add_button.setText("Add");
    add_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        add_buttonActionPerformed(evt);
      }
    });

    name_field.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    user_name.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    password_field.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    address_field.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    phone_field.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    role_box.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    role_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Officer" }));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(109, 109, 109)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(46, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(address_field, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(phone_field, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                      .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name_field)
                    .addComponent(user_name, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(role_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(35, 35, 35))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(58, 58, 58)
            .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(112, 112, 112))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
          .addComponent(role_box))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(user_name, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(address_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(phone_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(back_button)
          .addComponent(add_button))
        .addContainerGap(24, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
    // TODO add your handling code here:
    String new_name, new_role, new_user_name, new_pass, new_address, new_phone;
    Staff new_staff = new Staff();
    new_name = name_field.getText();
    if (new_name.equals("")) {
      JOptionPane.showMessageDialog(null, "No name. Enter staff name");
      return;
    } else if (((Admin) admin).checkDuplicatedStaff(new_staff.getID()+"", new_name)) {
      JOptionPane.showMessageDialog(null, "Duplicated staff name");
      return;
    }
    new_role = role_box.getSelectedItem().toString();
    new_user_name = user_name.getText();
    if (new_user_name.equals("")) {
      JOptionPane.showMessageDialog(null, "No user name. Enter staff user name");
      return;
    } else if (((Admin) admin).checkDuplicatedUserName(new_staff.getID()+"", new_user_name)) {
      JOptionPane.showMessageDialog(null, "Duplicated user name");
      return;
    } 
    new_pass = password_field.getText();
    if (new_pass.equals("")) {
      JOptionPane.showMessageDialog(null, "No password. Enter staff password");
      return;
    } 
    new_address = address_field.getText();
    if (new_address.equals("")) {
      JOptionPane.showMessageDialog(null, "No address. Enter staff address");
      return;
    }     
    new_phone = phone_field.getText();
    if (new_phone.equals("")) {
      JOptionPane.showMessageDialog(null, "No phone. Enter staff phone");
      return;
    } else if (new_phone.length() < 9) {
      JOptionPane.showMessageDialog(null, "Invalid phone number. Phone number must have at least 9 digits");
      return;
    } else if (new_phone.charAt(0) != '0') {
      JOptionPane.showMessageDialog(null, "Invalid phone number. Phone number must start with 0");
      return;
    } else {
      try {
        Integer.parseInt(new_phone);
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Not number. Enter phone number as number");
        return;
      }
    }
    int dialog_button = JOptionPane.YES_NO_OPTION;
    int dialog_result = JOptionPane.showConfirmDialog(null, "Do you want to add this staff?","Add confirmation",dialog_button);
    if (dialog_result == 0) {
      new_staff.setName(new_name);
      new_staff.setRole(new_role);
      new_staff.setUserName(new_user_name);
      new_staff.setPassword(new_pass);
      new_staff.setAddress(new_address);
      new_staff.setPhone(new_phone);
      ((Admin) admin).addStaff(new_staff);
      JOptionPane.showMessageDialog(null, "New staff is added");
    } else {
      JOptionPane.showMessageDialog(null, "New staff is not added");
    }
  }//GEN-LAST:event_add_buttonActionPerformed

  private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
    // TODO add your handling code here:
    AdminGUI admin_view = new AdminGUI();
    this.dispose();
    admin_view.setLocationRelativeTo(null);
    admin_view.setVisible(true);
  }//GEN-LAST:event_back_buttonActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton add_button;
  private javax.swing.JTextField address_field;
  private javax.swing.JButton back_button;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JScrollPane jScrollPane7;
  private javax.swing.JTextArea jTextArea7;
  private javax.swing.JTextField name_field;
  private javax.swing.JTextField password_field;
  private javax.swing.JTextField phone_field;
  private javax.swing.JComboBox<String> role_box;
  private javax.swing.JTextField user_name;
  // End of variables declaration//GEN-END:variables
}
