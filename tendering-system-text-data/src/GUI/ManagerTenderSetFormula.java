package GUI;

import classes.Manager;
import classes.Tender;
import classes.Staff;
import java.util.List;
import javax.swing.JOptionPane;

public class ManagerTenderSetFormula extends javax.swing.JFrame {
  Staff manager = main.staff;
  
  /**
   * Creates new form ManagerTenderApply
   */
  public ManagerTenderSetFormula() {
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

    jLabel9 = new javax.swing.JLabel();
    mark_up_field = new javax.swing.JTextField();
    back_button = new javax.swing.JButton();
    set_button = new javax.swing.JButton();
    id_field = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    search_button = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    labour_field = new javax.swing.JTextField();
    id_label = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    discount_field = new javax.swing.JTextField();
    products_price_label = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    tender_price_label = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    name_label = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel9.setText("Tender ID :");

    mark_up_field.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    back_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    back_button.setText("Back");
    back_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        back_buttonActionPerformed(evt);
      }
    });

    set_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    set_button.setText("Set");
    set_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        set_buttonActionPerformed(evt);
      }
    });

    id_field.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel8.setText("Tender ID :");

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Set tender price formula");

    jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel4.setText("Mark-up (RM):");

    search_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    search_button.setText("Search");
    search_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        search_buttonActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel2.setText("Labour cost (RM):");

    labour_field.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    id_label.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    id_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel7.setText("Products price (RM):");

    jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel5.setText("Discount (RM):");

    discount_field.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    products_price_label.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    products_price_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel10.setText("Tender price (RM):");

    tender_price_label.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    tender_price_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel11.setText("Name:");

    name_label.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    name_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel12.setText("Tender price = Products price + labour cost + mark-up - discount");
    jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(72, 72, 72)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(id_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(mark_up_field, javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(labour_field, javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(products_price_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(tender_price_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(discount_field, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
          .addGroup(layout.createSequentialGroup()
            .addGap(168, 168, 168)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(40, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(94, 94, 94)
            .addComponent(jLabel8)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addGap(170, 170, 170)
            .addComponent(set_button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(42, 42, 42)
            .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(24, 24, 24)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(search_button)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tender_price_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(products_price_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(labour_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(mark_up_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(discount_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(back_button)
          .addComponent(set_button))
        .addContainerGap(22, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
    // TODO add your handling code here:
    ManagerGUI manager_GUI = new ManagerGUI();
    manager_GUI.setLocationRelativeTo(null);
    manager_GUI.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_back_buttonActionPerformed

  private void set_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_buttonActionPerformed
    // TODO add your handling code here:
    String tender_id, labour_cost, mark_up, discount;
    tender_id = id_label.getText();
    if (tender_id.equals("")) {
      JOptionPane.showMessageDialog(null, "No tendering request to set price formula");
      return;
    }
    labour_cost = labour_field.getText();
    try {
      if (Float.parseFloat(labour_cost) < 0) {
        JOptionPane.showMessageDialog(null, "Invalid labour cost amount");
        return;
      }
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Invalid labour cost amount");
      return;
    }
    mark_up = mark_up_field.getText();
    try {
      if (Float.parseFloat(mark_up) < 0) {
        JOptionPane.showMessageDialog(null, "Invalid mark-up amount");
        return;
      }
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Invalid mark-up amount");
      return;
    }
    discount = discount_field.getText();
    try {
      if (Float.parseFloat(discount) < 0) {
        JOptionPane.showMessageDialog(null, "Invalid discount amount");
        return;
      }
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Invalid discount amount");
      return;
    }
    List<String> found_tender = ((Manager) manager).searchTender(tender_id);
    String[] pieces = found_tender.get(0).split("!");
    if (labour_cost.equals(pieces[4]) & mark_up.equals(pieces[5]) & 
        discount.equals(pieces[6])) {
      JOptionPane.showMessageDialog(null, "There is no change");
      return;
    } 
    int dialog_button = JOptionPane.YES_NO_OPTION;
    int dialog_result = JOptionPane.showConfirmDialog(null, "Do you want to set price formula for tender ID: "+tender_id,"Set price formula confirmation",dialog_button);
    if (dialog_result == 0) {
      Tender tender = new Tender(Integer.parseInt(tender_id));
      tender.setLabourCost(Float.parseFloat(labour_cost));
      tender.setMarkUp(Float.parseFloat(mark_up));
      tender.setDiscount(Float.parseFloat(discount));
      tender.calculateTenderPrice();
      tender_price_label.setText(tender.getTenderPrice()+"");
      ((Manager) manager).setPriceFormula(tender);
      JOptionPane.showMessageDialog(null, "Price formula for tender ID: "+tender_id+" is set. Tender price is calculated");
    } else {
      JOptionPane.showMessageDialog(null, "Price formula for tender ID: "+tender_id+" is not set.");
    }
  }//GEN-LAST:event_set_buttonActionPerformed

  private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
    // TODO add your handling code here:
    String tender_id = id_field.getText();
    if (tender_id.equals("")) {
      JOptionPane.showMessageDialog(null, "Enter tender ID to search");
      id_label.setText("");
      name_label.setText("");
      tender_price_label.setText("");
      products_price_label.setText("");
      labour_field.setText("");
      mark_up_field.setText("");
      discount_field.setText("");
      return;
    } else {
      try {
        if (Integer.parseInt(tender_id) <= 0) {
          JOptionPane.showMessageDialog(null, "Invalid ID");
          id_label.setText("");
          name_label.setText("");
          tender_price_label.setText("");
          products_price_label.setText("");
          labour_field.setText("");
          mark_up_field.setText("");
          discount_field.setText("");
          return;
        }
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "ID is not number. Enter ID as number");
        id_label.setText("");
        name_label.setText("");
        tender_price_label.setText("");
        products_price_label.setText("");
        labour_field.setText("");
        mark_up_field.setText("");
        discount_field.setText("");
        return;
      }
    }
    List<String> found_tender = ((Manager) manager).searchTender(tender_id);
    if (found_tender.isEmpty()) {
      JOptionPane.showMessageDialog(null, "Cannot find tender ID: "+tender_id);
      id_label.setText("");
      name_label.setText("");
      tender_price_label.setText("");
      products_price_label.setText("");
      labour_field.setText("");
      mark_up_field.setText("");
      discount_field.setText("");
      return;
    } 
    String[] pieces = found_tender.get(0).split("!");
    if (pieces[3].equals("0.0")) {
      JOptionPane.showMessageDialog(null, "There is no product in tender ID: "+tender_id+". Tendering officer should add products first");
      id_label.setText("");
      name_label.setText("");
      tender_price_label.setText("");
      products_price_label.setText("");
      labour_field.setText("");
      mark_up_field.setText("");
      discount_field.setText("");
    } else {
      id_label.setText(pieces[0]);
      name_label.setText(pieces[1]);
      tender_price_label.setText(pieces[2]);
      products_price_label.setText(pieces[3]);
      labour_field.setText(pieces[4]);
      mark_up_field.setText(pieces[5]);
      discount_field.setText(pieces[6]);    
    }
  }//GEN-LAST:event_search_buttonActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton back_button;
  private javax.swing.JTextField discount_field;
  private javax.swing.JTextField id_field;
  private javax.swing.JLabel id_label;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JTextField labour_field;
  private javax.swing.JTextField mark_up_field;
  private javax.swing.JLabel name_label;
  private javax.swing.JLabel products_price_label;
  private javax.swing.JButton search_button;
  private javax.swing.JButton set_button;
  private javax.swing.JLabel tender_price_label;
  // End of variables declaration//GEN-END:variables
}