package classes;

import java.util.List;

public final class Product {
  private final int ID;   
  private int quantity;
  private String brand, model, type;
  private float price, discount, discount_price;

  // Constructor used to create new Product object with auto-generated ID
  public Product(String brand, String model, String type, float price) {
    this.ID = generateID();
    this.brand = brand; this.model = model; this.type = type; 
    this.price = price; this.discount = 0; this.discount_price = 0; 
    this.quantity = 0;  // Index 7
  }

  // Overload constructor used to create a Product object with old ID 
  public Product(int id) {
    this.ID = id;
  }
  
  private int generateID() {
    List<String> product_list = AccessFile.getFile("data/products list.txt");
    if (product_list.isEmpty()) {
      return 1;
    } else {
      int max = 0;
      for (String product: product_list) {
        if (Integer.parseInt(product.split("!")[0]) > max) {
          max = Integer.parseInt(product.split("!")[0]);
        }
      }
      return max + 1;
    }
  }
  
  public boolean checkDuplicateProduct(String brand, String model, String type) {
    List<String> product_list = AccessFile.getFile("data/products list.txt");
    boolean duplicate = false;
    for (String product: product_list) {
      if (!product.split("!")[0].equals(this.ID+"") & product.split("!")[1].equalsIgnoreCase(brand) & 
          product.split("!")[2].equalsIgnoreCase(model) & 
          product.split("!")[3].equalsIgnoreCase(type)) {
        duplicate = true;
        break;
      }
    }
    return duplicate;
  }
  
  @Override
  public String toString() {
    return this.ID+"!"+this.brand+"!"+this.model+"!"+this.type+"!"+this.price+
        "!"+this.discount+"!"+this.discount_price+"!"+this.quantity;
  }
  
  public int getID() {
    return this.ID;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public String getBrand() {
    return this.brand;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public String getModel() {
    return this.model;
  }
  public void setType(String type) {
    this.type = type;
  }
  public String getType() {
    return this.type;
  }
  public void setPrice(float price) {
    this.price = price;
  }
  public float getPrice() {
    return this.price;
  }
  void setDiscount(float discount) {
    this.discount = discount;
  }
  void setDiscountPrice(float discount_price) {
    this.discount_price = discount_price;
  }
  void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}