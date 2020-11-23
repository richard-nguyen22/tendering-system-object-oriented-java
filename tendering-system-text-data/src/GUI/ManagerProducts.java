package GUI;

import classes.AccessFile;
import classes.Manager;
import classes.Staff;
import classes.Product;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManagerProducts extends javax.swing.JFrame {
  Staff manager = main.staff;
  /**
   * Creates new form ManagerProducts
   */
  public ManagerProducts() {
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
    add_button = new javax.swing.JButton();
    edit_button = new javax.swing.JButton();
    delete_button = new javax.swing.JButton();
    search_button = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    search_field = new javax.swing.JTextField();
    show_all_button = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    products_table = new javax.swing.JTable();
    help_button = new javax.swing.JButton();
    back_button = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Manage products list");

    add_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    add_button.setText("Add product");
    add_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        add_buttonActionPerformed(evt);
      }
    });

    edit_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    edit_button.setText("Edit product");
    edit_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        edit_buttonActionPerformed(evt);
      }
    });

    delete_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    delete_button.setText("Delete product");
    delete_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        delete_buttonActionPerformed(evt);
      }
    });

    search_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    search_button.setText("Search products");
    search_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        search_buttonActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel2.setText("Enter brand, model or type to search");

    search_field.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

    show_all_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    show_all_button.setText("Show all");
    show_all_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        show_all_buttonActionPerformed(evt);
      }
    });

    products_table.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
    products_table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "ID", "Brand", "Model", "Type", "Price (RM)"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    products_table.getTableHeader().setReorderingAllowed(false);
    jScrollPane2.setViewportView(products_table);

    help_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    help_button.setText("Help");
    help_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        help_buttonActionPerformed(evt);
      }
    });

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
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(show_all_button, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
              .addComponent(add_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(edit_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(delete_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(back_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(help_button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(118, 118, 118)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(17, 17, 17)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(search_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(help_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(show_all_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(edit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void showProductsTable(String keyword) {
    List<String> found_products = ((Manager) manager).searchProduct(keyword);
    List<String> products_list = AccessFile.getFile("data/products list.txt");
    if (products_list.isEmpty()) {
      JOptionPane.showMessageDialog(null, "There is product in products list. Manager can add products in products list");
      return;
    } 
    DefaultTableModel model = (DefaultTableModel) products_table.getModel();
    String[] cols = {"ID", "Brand", "Model", "Type", "Price (RM)"};
    if (keyword.equals("all")) {
      String[][] rows = new String[found_products.size()][5];
      int row_count = 0;
      for (String tender: found_products) {
        rows[row_count] =  tender.split("!");
        row_count++;
      }
      model.setDataVector(rows, cols);
    } else if (found_products.isEmpty()) {
      JOptionPane.showMessageDialog(null, "Cannot find any product");
      model.setRowCount(0);
    } else {
      int row_count = 0;
      String[][] rows = new String[found_products.size()][5];
      for (String product: found_products) {
          rows[row_count] = product.split("!");
          row_count++;
      }
      model.setDataVector(rows, cols);
    }    
  }
  
  private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
    // TODO add your handling code here:
    if (search_field.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "No search keyword. Enter product brand, model or type to search");
    } else {
      showProductsTable(search_field.getText());
    }    
  }//GEN-LAST:event_search_buttonActionPerformed

  private void show_all_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_all_buttonActionPerformed
    // TODO add your handling code here:
    showProductsTable("all");
  }//GEN-LAST:event_show_all_buttonActionPerformed

  private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
    // TODO add your handling code here:
    ManagerProductsAdd new_GUI = new ManagerProductsAdd();
    new_GUI.setLocationRelativeTo(null);
    new_GUI.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_add_buttonActionPerformed

  private void edit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_buttonActionPerformed
    // TODO add your handling code here:
    ManagerProductsEdit new_GUI = new ManagerProductsEdit();
    new_GUI.setLocationRelativeTo(null);
    new_GUI.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_edit_buttonActionPerformed

  private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
    // TODO add your handling code here:
    DefaultTableModel model = (DefaultTableModel) products_table.getModel();
    if (products_table.getSelectedRow() == -1) {
      if (products_table.getRowCount() == 0) {
        JOptionPane.showMessageDialog(null, "There is no product in the table");
      } else {
        JOptionPane.showMessageDialog(null, "Select a product in the table to delete");
      }      
    } else {
      int dialog_button = JOptionPane.YES_NO_OPTION;
      int dialog_result = JOptionPane.showConfirmDialog(null, "Do you want to delete the product?","Delete confirmation",dialog_button);
      if (dialog_result == 0) {
      String delete_id = products_table.getValueAt(products_table.getSelectedRow(), 0)+"";
      model.removeRow(products_table.getSelectedRow());
      List<String> products_list = AccessFile.getFile("data/products list.txt");
      for (String product: products_list) {
        if (product.split("!")[0].equals(delete_id)) {
          products_list.remove(product);
          break;
        }
      }      
      AccessFile.writeToFile(products_list, "data/products list.txt");
      } 
    }
  }//GEN-LAST:event_delete_buttonActionPerformed

  private void help_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help_buttonActionPerformed
    // TODO add your handling code here:
    String help = "";
    help += "  - Search: Enter brand or model or type to search. All products match with brand or model or type will be displayed\n\n";
    help += "  - Show all: Show all products in products list\n\n";
    help += "  - Add: Add a new product in products list\n\n";
    help += "  - Edit: Edit a product's brand or model or type\n\n";
    help += "  - Delete: Delete a chosen product in the table\n\n";
    help += "  - Back: Go back to the previous menu\n";
    JOptionPane.showMessageDialog(null, help, "Manage products list help", WIDTH);
  }//GEN-LAST:event_help_buttonActionPerformed

  private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
    // TODO add your handling code here:
    ManagerGUI new_GUI = new ManagerGUI();
    new_GUI.setLocationRelativeTo(null);
    new_GUI.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_back_buttonActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton add_button;
  private javax.swing.JButton back_button;
  private javax.swing.JButton delete_button;
  private javax.swing.JButton edit_button;
  private javax.swing.JButton help_button;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTable products_table;
  private javax.swing.JButton search_button;
  private javax.swing.JTextField search_field;
  private javax.swing.JButton show_all_button;
  // End of variables declaration//GEN-END:variables
}
