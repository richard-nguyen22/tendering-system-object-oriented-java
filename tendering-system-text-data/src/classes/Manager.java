package classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manager extends Staff implements TenderInterface {
  public Manager(int ID) {
    super(ID);
    this.role = "Manager";
  }
  
  public void addTender(Tender tender) {
    String new_folder = tender.getID() + " " + tender.getName();
    AccessFile.checkFolder("data\\tender\\" + new_folder);
    AccessFile.checkFile("data\\tender\\" + new_folder + "\\products.txt");
    AccessFile.appendToFile(tender.toString(), "data\\tender\\tender.txt");
  }

  public List<String> searchTender(String tender_id) {
    List<String> tender_list = AccessFile.getFile("data/tender/tender.txt");
    List<String> found = new ArrayList<>();
    if (tender_id.equals("all")) {
      return tender_list;
    } else {
      for (String tender: tender_list) {
        if (tender.split("!")[0].equals(tender_id)) {
          found.add(tender);
          break;
        }
      }
      return found;
    }
  }

  @Override
  public List<String> getTenderProducts(String id) {
    List<String> found = searchTender(id);
    String tender_folder = found.get(0).split("!")[0]+" "+
        found.get(0).split("!")[1];
    List<String> tender_products = AccessFile.getFile("data/tender/" + tender_folder + "/products.txt");
    return tender_products;
  }

  public void editTender(Tender tender, boolean changeName) {
    List<String> tender_list = AccessFile.getFile("data/tender/tender.txt");
    String old_tender = "";
    for (String item: tender_list) {
      if (item.split("!")[0].equals(""+tender.getID())) {
        old_tender = item;
        break;
      }
    }
    if (changeName) {
      renameTenderFolder(old_tender.split("!")[0]+" "+old_tender.split("!")[1], 
          tender.getID() + " " + tender.getName());
    }
    tender_list.remove(old_tender);
    tender_list.add(tender.toString());
    AccessFile.writeToFile(tender_list, "data/tender/tender.txt");
  }
  
  public void deleteTender(Tender tender) {
    String tender_folder = tender.getID() + " " + tender.getName();
    Path folder_path = Paths.get("data/tender/" + tender_folder);
    Path file_path = Paths.get("data/tender/" + tender_folder + "/products.txt");
    try {
      Files.deleteIfExists(file_path);
      Files.deleteIfExists(folder_path);
    } catch (IOException ex) {
      Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    List<String> tender_list = AccessFile.getFile("data/tender/tender.txt");
    tender_list.remove(tender.toString());
    AccessFile.writeToFile(tender_list, "data/tender/tender.txt");
  }
  
   private void renameTenderFolder(String old_folder, String new_folder) {
    Path old_path = Paths.get("data\\tender\\" + old_folder);
    Path old_file = Paths.get("data\\tender\\" + old_folder + "\\products.txt");
    Path new_path = Paths.get("data\\tender\\" + new_folder);
    Path new_file = Paths.get("data\\tender\\" + new_folder + "\\products.txt");
    if (Files.exists(old_path)) {
      try {
      if (Files.notExists(new_path)) {
        Files.createDirectory(new_path);
      }
      Files.copy(old_file, new_file);
      Files.deleteIfExists(old_file);
      Files.deleteIfExists(old_path);
      } catch (IOException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }
  
  public void setPriceFormula(Tender tender) {
    List<String> tender_list = AccessFile.getFile("data/tender/tender.txt");
    String old_tender = "";
    for (String item: tender_list) {
      if (item.split("!")[0].equals(""+tender.getID())) {
        old_tender = item;
        break;
      }
    }
    tender_list.remove(old_tender);
    tender_list.add(tender.toString());
    AccessFile.writeToFile(tender_list, "data/tender/tender.txt");
}
  
  public float applyDiscount(String tender_id, String product_id, String discount, String discount_price) {
    List<String> tender_list = AccessFile.getFile("data/tender/tender.txt");    
    List<String> tender_products_list;
    String tender_folder = "";
    for (String tender: tender_list) {
      if (tender.split("!")[0].equals(tender_id)) {
        tender_folder = tender.split("!")[0] + " " + tender.split("!")[1];
        break;
      }
    }
    tender_products_list = AccessFile.getFile("data/tender/" + tender_folder + "/products.txt");
    String found = "";
    for (String product: tender_products_list) {
      if (product.split("!")[0].equals(product_id)) {
        found = product;
        break;
      }
    }
    tender_products_list.remove(found);
    String[] pieces = found.split("!");
    tender_products_list.add(pieces[0]+"!"+pieces[1]+"!"+pieces[2]+"!"+pieces[3]+
        "!"+pieces[4]+"!"+Float.parseFloat(discount)+"!"+discount_price+"!"+pieces[7]);
    AccessFile.writeToFile(tender_products_list, "data/tender/" + tender_folder + "/products.txt");
    return calculateProductsPrice(tender_id, tender_products_list);
  }

  @Override
  public float calculateProductsPrice(String tender_id, List<String> tender_products_list) {
    List<String> tender_list = AccessFile.getFile("data/tender/tender.txt");
    Tender tender = new Tender(Integer.parseInt(tender_id));
    float products_price = 0;
    for (String product: tender_products_list) {
      products_price += Float.parseFloat(product.split("!")[6]) * Integer.parseInt(product.split("!")[7]);
    }
    tender.setProductsPrice(products_price);
    for (String old_tender: tender_list) {
      if (old_tender.split("!")[0].equals(tender_id)) {
        tender_list.remove(old_tender);
        break;
      }
    }
    tender.calculateTenderPrice();
    tender_list.add(tender.toString());
    AccessFile.writeToFile(tender_list, "data/tender/tender.txt");
    return products_price;
  }
 
  public void addProduct(Product product) {
    AccessFile.appendToFile(product.toString(), "data\\products list.txt");
  }

  public void editProduct(Product product) {
    List<String> product_list = AccessFile.getFile("data/products list.txt");
    String found = "";
    for (String item: product_list) {
      if (item.split("!")[0].equals(product.getID()+"")) {
        found = item;
      }
    }      
    product_list.remove(found);
    product_list.add(product.toString());      
    AccessFile.writeToFile(product_list, "data\\products list.txt");
  }

  public void deleteProduct(Product product) {
    List<String> product_list = AccessFile.getFile("data/products list.txt");
    product_list.remove(product.toString());
    AccessFile.writeToFile(product_list, "data\\products list.txt");
  }
  
  public Product findProduct(String id) {
    List<String> product_list = AccessFile.getFile("data/products list.txt");
    for (String item: product_list) {
      if (item.split("!")[0].equals(id)) {
        Product found_product = new Product(Integer.parseInt(id));
        found_product.setBrand(item.split("!")[1]);
        found_product.setModel(item.split("!")[2]);
        found_product.setType(item.split("!")[3]);
        found_product.setPrice(Float.parseFloat(item.split("!")[4]));
        return found_product;
      }
    }
    return null;
  }
  
  @Override
  public List<String> searchProduct(String keyword) {
    List<String> product_list = AccessFile.getFile("data/products list.txt");
    List<String> found_list = new ArrayList<>();
    if (keyword.equals("all")) {
      return product_list;
    } else {
      for (String item: product_list) {
        if (item.split("!")[1].contains(keyword) || item.split("!")[2].contains(keyword) || item.split("!")[3].contains(keyword)) {
          found_list.add(item);
        }
      }
    }
    return found_list;
  }
}
