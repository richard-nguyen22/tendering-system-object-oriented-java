package classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Tender {
  private final int ID; // Index 0
  private String name, deadline, status, created_date, created_time;
  private float tender_price, products_price, labour_cost, mark_up, discount;

  public Tender() {
    this.ID = generateID();
    this.tender_price = 0;
    this.products_price = 0;
    this.labour_cost = 0;
    this.mark_up = 0;
    this.discount = 0;
    this.status = "In Progress";
    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    String date_time_str = dateFormat.format(date);
    this.created_date = date_time_str.split(" ")[0];
    this.created_time = date_time_str.split(" ")[1];
  }
  
  public Tender(int id) {
    this.ID = id;
    List<String> tender_list = AccessFile.getFile("data/tender/tender.txt");
    String[] pieces = null;
    for (String tender: tender_list) {
      if (tender.split("!")[0].equals(id+"")) {
        pieces = tender.split("!");
        break;
      }
    }
    this.name = pieces[1];
    this.tender_price = Float.parseFloat(pieces[2]);
    this.products_price = Float.parseFloat(pieces[3]);
    this.labour_cost = Float.parseFloat(pieces[4]);
    this.mark_up = Float.parseFloat(pieces[5]);
    this.discount = Float.parseFloat(pieces[6]);
    this.deadline = pieces[7];
    this.status = pieces[8];
    this.created_date = pieces[9];
    this.created_time = pieces[10];
  }

  public int getID() {
    return this.ID;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public float getTenderPrice() {
    return this.tender_price;
  }
  public void setProductsPrice(float amount) {
    this.products_price = amount;
  }
  public void setLabourCost(float amount) {
    this.labour_cost = amount;
  }
  public void setMarkUp(float amount) {
    this.mark_up = amount;
  }
  public void setDiscount(float amount) {
    this.discount = amount;
  }
  public void setDeadline(String deadline) {
    this.deadline = deadline;
  }
  public String getDeadline() {
    return this.deadline;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  public String getStatus() {
    return this.status;
  }
  public void setDate(String date) {
    this.created_date = date;
  }
  public String getDate() {
    return this.created_date;
  }

  private int generateID() {
    List<String> tender_list = AccessFile.getFile("data/tender/tender.txt");
    if (tender_list.isEmpty()) {
      return 1;
    } else {
      int max = 0;
      for (String tender: tender_list) {
        if (Integer.parseInt(tender.split("!")[0]) > max) {
          max = Integer.parseInt(tender.split("!")[0]);
        }
      }
      return max + 1;
    }      
  }
  public void calculateTenderPrice() {
    this.tender_price = this.products_price + this.labour_cost + this.mark_up - this.discount;
  }
  
  public boolean checkDuplicateTender(String new_name) {
    List<String> tender_list = AccessFile.getFile("data/tender/tender.txt");
    boolean duplicated = false;
    for (String tender: tender_list) {
      if (!tender.split("!")[0].equals(this.ID+"") & tender.split("!")[1].equalsIgnoreCase(new_name)) {
        duplicated = true;
        break;
      }
    }
    return duplicated;
  }
  
  @Override
  public String toString() {
    String print_str;
    print_str = this.ID+"!"+this.name+"!"+this.tender_price+"!"+this.products_price+
        "!"+this.labour_cost+"!"+this.mark_up+"!"+this.discount+"!"+this.deadline+
        "!"+this.status+"!"+this.created_date+"!"+this.created_time;
    return print_str;
  }
}

interface TenderInterface {
  public List<String> searchProduct(String keyword);
  public List<String> getTenderProducts(String id);
  public float calculateProductsPrice(String tender_id, List<String> tender_products_list);
}