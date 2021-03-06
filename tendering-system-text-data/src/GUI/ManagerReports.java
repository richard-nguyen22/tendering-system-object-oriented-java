package GUI;

import classes.Manager;
import classes.Staff;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManagerReports extends javax.swing.JFrame {
  Staff manager = main.staff;
  /**
   * Creates new form ManagerReports
   */
  public ManagerReports() {
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

    jLabel2 = new javax.swing.JLabel();
    tender_id_field = new javax.swing.JTextField();
    search_button = new javax.swing.JButton();
    tender_products_label1 = new javax.swing.JLabel();
    tender_id_label = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    tender_products_table = new javax.swing.JTable();
    name_label = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    tender_id_label1 = new javax.swing.JLabel();
    tender_id_label2 = new javax.swing.JLabel();
    tender_id_label3 = new javax.swing.JLabel();
    tender_id_label4 = new javax.swing.JLabel();
    tender_id_label5 = new javax.swing.JLabel();
    tender_id_label6 = new javax.swing.JLabel();
    tender_id_label7 = new javax.swing.JLabel();
    tender_id_label8 = new javax.swing.JLabel();
    deadline_label = new javax.swing.JLabel();
    status_label = new javax.swing.JLabel();
    date_label = new javax.swing.JLabel();
    labour_label = new javax.swing.JLabel();
    products_cost_label = new javax.swing.JLabel();
    mark_up_label = new javax.swing.JLabel();
    discount_label = new javax.swing.JLabel();
    tender_price_label = new javax.swing.JLabel();
    time_label = new javax.swing.JLabel();
    tender_id_label9 = new javax.swing.JLabel();
    back_button = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel2.setText("Tender ID:");

    tender_id_field.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    search_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    search_button.setText("Search Tender");
    search_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        search_buttonActionPerformed(evt);
      }
    });

    tender_products_label1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    tender_products_label1.setText("Products in tender");

    tender_id_label.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    tender_id_label.setText("Tender ID:  ");

    tender_products_table.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
    tender_products_table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "ID", "Brand", "Model", "Type", "Original Price", "Discount (%)", "Discount Price", "Quantity"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, true, true
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane2.setViewportView(tender_products_table);

    name_label.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    name_label.setText("Name: ");

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Generate tender report");

    tender_id_label1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    tender_id_label1.setText("Deadline: ");

    tender_id_label2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    tender_id_label2.setText("Status: ");

    tender_id_label3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    tender_id_label3.setText("Created date:");

    tender_id_label4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    tender_id_label4.setText("Mark-up:");

    tender_id_label5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    tender_id_label5.setText("Labour cost:");

    tender_id_label6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    tender_id_label6.setText("Products cost:");

    tender_id_label7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    tender_id_label7.setText("Tender Discount:");

    tender_id_label8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    tender_id_label8.setText("Tender price:");

    deadline_label.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    deadline_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    status_label.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    status_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    date_label.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    date_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    labour_label.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    labour_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    products_cost_label.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    products_cost_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    mark_up_label.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    mark_up_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    discount_label.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    discount_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    tender_price_label.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    tender_price_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    time_label.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    time_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    tender_id_label9.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    tender_id_label9.setText("Created time:");

    back_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    back_button.setText("Back");
    back_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        back_buttonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(40, 40, 40)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(tender_id_label5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
              .addComponent(tender_id_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(labour_label, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(mark_up_label, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tender_id_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(tender_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(date_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(name_label, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tender_id_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(tender_id_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(status_label, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
              .addComponent(deadline_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createSequentialGroup()
                .addComponent(tender_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(tender_id_label8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(tender_id_label7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(tender_id_label9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
              .addComponent(tender_id_label6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(tender_price_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
              .addComponent(discount_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(time_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(products_cost_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addGap(18, 18, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(tender_products_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(12, 12, 12))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tender_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tender_products_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
            .addGap(20, 20, 20))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(tender_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(deadline_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(tender_id_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(status_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(tender_id_label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tender_id_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(time_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(tender_id_label9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tender_id_label6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(products_cost_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(tender_id_label5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(labour_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(tender_id_label4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(mark_up_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(tender_id_label7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tender_id_label8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(discount_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tender_price_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(88, Short.MAX_VALUE))))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
    // TODO add your handling code here:
    String tender_id = tender_id_field.getText();
    if (tender_id.equals("")) {
      JOptionPane.showMessageDialog(null, "Enter tender ID to search");
      tender_id_label.setText("Tender ID: ");
      name_label.setText("Name: ");
      deadline_label.setText("");
      status_label.setText("");
      date_label.setText("");
      time_label.setText("");
      labour_label.setText("");
      mark_up_label.setText("");
      products_cost_label.setText("");
      discount_label.setText("");
      tender_price_label.setText("");
      showProductsTable(new ArrayList<>());
      return;
    } else {
      try {
        if (Integer.parseInt(tender_id) <= 0) {
          JOptionPane.showMessageDialog(null, "Invalid ID");
          tender_id_label.setText("Tender ID: ");
          name_label.setText("Name: ");
          deadline_label.setText("");
          status_label.setText("");
          date_label.setText("");
          time_label.setText("");
          labour_label.setText("");
            mark_up_label.setText("");
          products_cost_label.setText("");
          discount_label.setText("");
          tender_price_label.setText("");
          showProductsTable(new ArrayList<>());
          return;
        }
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid ID");
        tender_id_label.setText("Tender ID: ");
        name_label.setText("Name: ");
        deadline_label.setText("");
        status_label.setText("");
        date_label.setText("");
        time_label.setText("");
        labour_label.setText("");
        mark_up_label.setText("");
        products_cost_label.setText("");
        discount_label.setText("");
        tender_price_label.setText("");
        showProductsTable(new ArrayList<>());
        return;
      }
    }
    List<String> found_tender = ((Manager) manager).searchTender(tender_id);
    if (found_tender.isEmpty()) {
      JOptionPane.showMessageDialog(null, "Cannot find tender ID: " + tender_id);
      tender_id_label.setText("Tender ID: ");
      name_label.setText("Name: ");
      deadline_label.setText("");
      status_label.setText("");
      date_label.setText("");
      time_label.setText("");
      labour_label.setText("");
      mark_up_label.setText("");
      products_cost_label.setText("");
      discount_label.setText("");
      tender_price_label.setText("");
      showProductsTable(new ArrayList<>());
      return;
    }
    String[] pieces = found_tender.get(0).split("!");
    tender_id_label.setText("Tender ID: "+pieces[0]);
    name_label.setText("Name: "+pieces[1]);
    deadline_label.setText(pieces[7]);
    status_label.setText(pieces[8]);
    date_label.setText(pieces[9]);
    time_label.setText(pieces[10]);
    labour_label.setText(pieces[4]);
    mark_up_label.setText(pieces[5]);
    products_cost_label.setText(pieces[3]);
    discount_label.setText(pieces[6]);
    tender_price_label.setText(pieces[2]);
    List<String> tender_products = ((Manager) manager).getTenderProducts(tender_id);
    showProductsTable(tender_products);
  }//GEN-LAST:event_search_buttonActionPerformed

  private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
    // TODO add your handling code here:
    ManagerGUI new_GUI = new ManagerGUI();
    new_GUI.setLocationRelativeTo(null);
    new_GUI.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_back_buttonActionPerformed

  private void showProductsTable(List<String> tender_products) {
    DefaultTableModel model = (DefaultTableModel) tender_products_table.getModel();
    String[] cols = {"ID", "Brand", "Model", "Type", "Original Price", "Discount (%)", "Discount Price", "Quantity"};          
    String[][] rows = new String[tender_products.size()][8];
    if (tender_products.isEmpty()) {
      rows = new String[0][8];
    } else {
      int row_count = 0;
      for (String product: tender_products) {
        rows[row_count] = product.split("!");
        row_count++;
      }
    }
    model.setDataVector(rows, cols);
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton back_button;
  private javax.swing.JLabel date_label;
  private javax.swing.JLabel deadline_label;
  private javax.swing.JLabel discount_label;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JLabel labour_label;
  private javax.swing.JLabel mark_up_label;
  private javax.swing.JLabel name_label;
  private javax.swing.JLabel products_cost_label;
  private javax.swing.JButton search_button;
  private javax.swing.JLabel status_label;
  private javax.swing.JTextField tender_id_field;
  private javax.swing.JLabel tender_id_label;
  private javax.swing.JLabel tender_id_label1;
  private javax.swing.JLabel tender_id_label2;
  private javax.swing.JLabel tender_id_label3;
  private javax.swing.JLabel tender_id_label4;
  private javax.swing.JLabel tender_id_label5;
  private javax.swing.JLabel tender_id_label6;
  private javax.swing.JLabel tender_id_label7;
  private javax.swing.JLabel tender_id_label8;
  private javax.swing.JLabel tender_id_label9;
  private javax.swing.JLabel tender_price_label;
  private javax.swing.JLabel tender_products_label1;
  private javax.swing.JTable tender_products_table;
  private javax.swing.JLabel time_label;
  // End of variables declaration//GEN-END:variables
}
