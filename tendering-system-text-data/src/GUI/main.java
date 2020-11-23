package GUI;

import classes.Staff;
import classes.AccessFile;

public class main {
  public static Staff staff;

  public static void main(String args[]) {
    AccessFile.checkFolder("data");
    AccessFile.checkFile("data\\staff.txt");
    AccessFile.checkFile("data\\logs.txt");
    AccessFile.checkFile("data\\products list.txt");
    AccessFile.checkFolder("data\\tender");
    AccessFile.checkFile("data\\tender\\tender.txt");
    
    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LoginGUI().setVisible(true);
      }
    });
  }
}
