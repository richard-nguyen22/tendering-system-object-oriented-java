package classes;

import java.util.ArrayList;
import java.util.List;

public class Officer extends Staff implements TenderInterface {
  public Officer(int ID) {
    super(ID);
    this.role = "Officer"; 
  }

  public Tender searchTender(String tender_id) {
    List<String> tender_list = AccessFile.getFile("data/tender/tender.txt");
    Tender tender = null;
    for (String item: tender_list) {
      if (item.split("!")[0].equals(tender_id)) {
        tender = new Tender(Integer.parseInt(item.split("!")[0]));
        break;
      }
    }
    return tender;
  }
  
  public String[] addProductToTender(String tender_id, String product_id, int quantity) {
    List<String> tender_list = AccessFile.getFile("data/tender/tender.txt");
    List<String> products_list = AccessFile.getFile("data/products list.txt");
    String found_tender = "", tender_folder = "", found_product = "";
    boolean found_in_tender_products = false;
    for (String item: tender_list) {
      if (item.split("!")[0].equals(tender_id)) {
        found_tender = item;
      }
    }
    tender_folder = found_tender.split("!")[0] + " " + found_tender.split("!")[1];
    List<String> tender_products_list = AccessFile.getFile("data/tender/" + tender_folder + "/products.txt");
    Product product = new Product(Integer.parseInt(product_id));
    // Case 1: No products in tendering request
    if (tender_products_list.isEmpty()) {
      for (String item: products_list) {
        if (item.split("!")[0].equals(product_id)) {
          String[] pieces = item.split("!");
          product.setBrand(pieces[1]);
          product.setModel(pieces[2]);
          product.setType(pieces[3]);
          product.setPrice(Float.parseFloat(pieces[4]));
          product.setDiscount(0);
          product.setDiscountPrice(Float.parseFloat(pieces[4]));
          product.setQuantity(quantity);
        }
      }
    // Case 2.0: There are products in tendering request
    } else {
      // Case 2.1: The add product is already in the tendering request
      for (String item: tender_products_list) {
        if (item.split("!")[0].equals(product_id)) {
          String[] pieces = item.split("!");
          product.setBrand(pieces[1]);
          product.setModel(pieces[2]);
          product.setType(pieces[3]);
          product.setPrice(Float.parseFloat(pieces[4]));
          product.setDiscount(Float.parseFloat(pieces[5]));
          product.setDiscountPrice(Float.parseFloat(pieces[6]));
          product.setQuantity(Integer.parseInt(pieces[7]) + quantity);
          found_product = item;
          found_in_tender_products = true;
        }
      }
      // Case 2.2: The add product is not in the tendering request
      if (!found_in_tender_products) {
        for (String item: products_list) {
          if (item.split("!")[0].equals(product_id)) {
            String[] pieces = item.split("!");
            product.setBrand(pieces[1]);
            product.setModel(pieces[2]);
            product.setType(pieces[3]);
            product.setPrice(Float.parseFloat(pieces[4]));
            product.setDiscount(0);
            product.setDiscountPrice(Float.parseFloat(pieces[4]));
            product.setQuantity(quantity);
          }
        }    
      }
    }
    // Finally save added product in tender products list
    if (found_in_tender_products) {
      tender_products_list.remove(found_product);
    }
    tender_products_list.add(product.toString());
    AccessFile.writeToFile(tender_products_list, "data/tender/" + tender_folder + "/products.txt");
    String[] result = new String[2];
    result[0] = product.toString();
    result[1] = ""+calculateProductsPrice(tender_id, tender_products_list);
    return result;
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
  
  public float deleteProduct(String tender_id, String product_id) {
    List<String> tender_list = AccessFile.getFile("data/tender/tender.txt");
    String tender_folder = "";
    for (String tender: tender_list) {
      if (tender.split("!")[0].equals(tender_id)) {
        tender_folder = tender.split("!")[0] + " " + tender.split("!")[1];
        break;
      }
    }
    List<String> tender_products_list = AccessFile.getFile("data/tender/" + tender_folder + "/products.txt");
    for (String product: tender_products_list) {
      if (product.split("!")[0].equals(product_id)) {
        tender_products_list.remove(product);
        break;
      }
    }    
    AccessFile.writeToFile(tender_products_list, "data/tender/" + tender_folder + "/products.txt");
    return calculateProductsPrice(tender_id, tender_products_list);
  }
  
    @Override
  public List<String> getTenderProducts(String tender_id) {
    List<String> found = new ArrayList<>();
    found.add(searchTender(tender_id).toString());
    String tender_folder = found.get(0).split("!")[0]+" "+
        found.get(0).split("!")[1];
    List<String> tender_products = AccessFile.getFile("data/tender/" + tender_folder + "/products.txt");
    return tender_products;
  }
  
  @Override
  public List<String> searchProduct(String keyword) {
    List<String> product_list = AccessFile.getFile("data/products list.txt");
    List<String> found_list = new ArrayList<>();
    for (String item: product_list) {
      if (item.split("!")[1].contains(keyword) || 
          item.split("!")[2].contains(keyword) || 
          item.split("!")[3].contains(keyword)) {
        found_list.add(item);
      }
    }
    return found_list;
  }
}
