package GUI;

import classes.Manager;
import classes.Staff;
import classes.Product;
import javax.swing.JOptionPane;

public class ManagerProductsAdd extends javax.swing.JFrame {
  Staff manager = main.staff;
  /**
   * Creates new form ManagerProductsAdd
   */
  public ManagerProductsAdd() {
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

    jLabel7 = new javax.swing.JLabel();
    back_button = new javax.swing.JButton();
    add_button = new javax.swing.JButton();
    price_field = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    type_field = new javax.swing.JTextField();
    model_field = new javax.swing.JTextField();
    brand_field = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel7.setText("Brand:");

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

    price_field.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Add product");

    jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel8.setText("Type:");

    jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel9.setText("Model:");

    jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel10.setText("Price (RM):");

    type_field.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    model_field.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    brand_field.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(price_field, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                      .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(type_field, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(model_field, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(brand_field, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
              .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(22, 22, 22))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(42, 42, 42)
            .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(61, 61, 61)))
        .addContainerGap(13, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(brand_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(model_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(type_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(price_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(back_button)
          .addComponent(add_button))
        .addContainerGap(29, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
    // TODO add your handling code here:
    ManagerProducts new_GUI = new ManagerProducts();
    new_GUI.setLocationRelativeTo(null);
    new_GUI.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_back_buttonActionPerformed

  private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
    // TODO add your handling code here:
    String new_brand, new_model, new_type, new_price;
    new_brand = brand_field.getText();
    if (new_brand.equals("")) {
      JOptionPane.showMessageDialog(null, "No brand");
      return;
    }
    new_model = model_field.getText();
    if (new_model.equals("")) {
      JOptionPane.showMessageDialog(null, "No model");
      return;
    }
    new_type = type_field.getText();
    if (new_type.equals("")) {
      JOptionPane.showMessageDialog(null, "No type");
      return;
    }
    new_price = price_field.getText();
    if (new_price.equals("")) {
      JOptionPane.showMessageDialog(null, "No price");
      return;
    } else {
      try {
        if (Float.parseFloat(new_price) < 0) {
          JOptionPane.showMessageDialog(null, "Invalid price");
          return;
        }
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid price");
        return;
      }
    }
    Product new_product = new Product(new_brand, new_model, new_type, Float.parseFloat(new_price));
    if (new_product.checkDuplicateProduct(new_brand, new_model, new_type)) {
      JOptionPane.showMessageDialog(null, "Duplicated product");
      return;
    }
    int dialog_button = JOptionPane.YES_NO_OPTION;
    int dialog_result = JOptionPane.showConfirmDialog(null, "Do you want to add this product into products list?","Add product confirmation",dialog_button);
    if (dialog_result == 0) {
      ((Manager) manager).addProduct(new_product);
      JOptionPane.showMessageDialog(null, "New product is added in products list");
      brand_field.setText("");
      model_field.setText("");
      type_field.setText("");
      price_field.setText("");
    } else {
      JOptionPane.showMessageDialog(null, "The product is not added in products list");
    }
  }//GEN-LAST:event_add_buttonActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton add_button;
  private javax.swing.JButton back_button;
  private javax.swing.JTextField brand_field;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JTextField model_field;
  private javax.swing.JTextField price_field;
  private javax.swing.JTextField type_field;
  // End of variables declaration//GEN-END:variables
}