package classes;

import java.util.List;

public class Staff  {
  private final int ID; 
  private String name, user_name, password, address, phone;
  String role;
  
  public Staff() {
    this.ID = generateID();
  }
  // Overload constructor used to find staff's information based on ID argument
  public Staff(int ID) {
    List<String> staff_list = AccessFile.getFile("data/staff.txt");
    String found = "";
    for(String staff: staff_list) {
      if (staff.split("!")[0].equals(ID+"")) {
        found = staff;
      }
    }
    this.ID = ID;
    this.name = found.split("!")[1]; 
    this.role = found.split("!")[2]; 
    this.user_name = found.split("!")[3]; 
    this.password = found.split("!")[4]; 
    this.address = found.split("!")[5];
    this.phone = found.split("!")[6];
  }

  private int generateID() {
    List<String> staff_list = AccessFile.getFile("data/staff.txt");
    if (staff_list.isEmpty()) {
      return 1;
    } else {
      int max = 0;
      for (String staff: staff_list) {
        if (Integer.parseInt(staff.split("!")[0]) > max) {
          max = Integer.parseInt(staff.split("!")[0]);
        }
      }
      return max + 1;
    }
  }

  public int getID() {
    return this.ID;
  }
  public void setRole(String role) {
    this.role = role;
  }  
  public String getRole() {
    return this.role;
  }  
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public void setUserName(String user_name) {
    this.user_name = user_name;
  }
  public String getUserName() {
    return this.user_name;
  }
  public void setPassword(String pass) {
    this.password = pass;
  }
  public String getPassword() {
    return this.password;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getAddress() {
    return this.address;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  public String getPhone() {
    return this.phone;
  }

  @Override
  public String toString() {
    return this.ID+"!"+this.name+"!"+this.role+"!"+this.user_name+"!"+
        this.password+"!"+this.address+"!"+this.phone;
  }
}
