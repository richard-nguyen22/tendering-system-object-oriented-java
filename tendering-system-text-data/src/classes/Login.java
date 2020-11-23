package classes;

import classes.Manager;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class Login {

  public static boolean verify(String user_name, String password) {
    List<String> staff_list = AccessFile.getFile("data/staff.txt");
    for (String staff: staff_list) {
      if (staff.split("!")[3].equalsIgnoreCase(user_name) & staff.split("!")[4].equals(password)) {
        recordLog(user_name, "in");
        return true;
      }
    }
    return false;
  }

  public static void recordLog(String user_name, String type) {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date = new Date();
    String date_time_str = dateFormat.format(date);
    String log;
    if (type.equals("in")) {
      log = user_name + "!logged in!" + date_time_str.replace(" ", "!");
    } else {
      log = user_name + "!logged out!" + date_time_str.replace(" ", "!");
    }
    AccessFile.appendToFile(log, "data\\logs.txt");
  }

  public static Staff getStaff(String user_name) {
    List<String> staff_list = AccessFile.getFile("data/staff.txt");
    for (String item: staff_list) {
      if (item.split("!")[3].equalsIgnoreCase(user_name)) {
        switch (item.split("!")[2]) {
          case "Admin": {
            Staff staff = new Admin(Integer.parseInt(item.split("!")[0]));
            return staff;
          }
          case "Manager": {
            Staff staff = new Manager(Integer.parseInt(item.split("!")[0]));
            return staff;
          }
          default: {
            Staff staff = new Officer(Integer.parseInt(item.split("!")[0]));
            return staff;
          }
        }
      }
    }
    return null;
  }  
}