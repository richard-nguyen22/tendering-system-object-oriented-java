package classes;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Staff {
  public Admin (int ID) {
    super(ID);
    this.role = "Admin";
  }

  public void editStaff(Staff edit_staff) {
    List<String> staff_list = AccessFile.getFile("data/staff.txt");
    for (String staff: staff_list) {
      if (staff.split("!")[0].equals(edit_staff.getID()+"")) {
        staff_list.remove(staff);
        break;
      }
    }
    staff_list.add(edit_staff.toString());
    AccessFile.writeToFile(staff_list, "data/staff.txt");
  }

  public void addStaff(Staff new_staff) {
    AccessFile.appendToFile(new_staff.toString(), "data/staff.txt");
  }
  
  public void deleteStaff(String ID) {
    List<String> staff_list = AccessFile.getFile("data/staff.txt");
    String[] staff_pieces = null;
    for (String staff: staff_list) {
      if (staff.split("!")[0].equals(ID)) {
        staff_pieces = staff.split("!");
        break;
      }
    }
    String delete_data = staff_pieces[0] + "!" + staff_pieces[1] + "!" + 
        staff_pieces[2] + "!" + staff_pieces[3] + "!" + staff_pieces[4] + "!" +
        staff_pieces[5] + "!" + staff_pieces[6];
    staff_list.remove(delete_data);
    AccessFile.writeToFile(staff_list, "data/staff.txt");
  }
  
  /*
   *  This method use String ID to find and return staff List<String> 
   *  If ID == "all" return all staff in List<String>
   */
  
  public List<String> findStaff(String ID) {
    List<String> found = new ArrayList<>(), staff_list = AccessFile.getFile("data/staff.txt");
    if (ID.equals("all")) {
      return staff_list;
    } else {
      for (String staff: staff_list) {
        if (staff.split("!")[0].equals(ID)) {
          found.add(staff);
          break;
        }
      }
      return found;
    }
  }
  
  public boolean checkDuplicatedStaff(String staff_id, String staff_name) {
    boolean duplicate = false;
    List<String> staff_list = AccessFile.getFile("data/staff.txt");
    for (String staff: staff_list) {
      if (!staff.split("!")[0].equals(staff_id) & staff.split("!")[1].equalsIgnoreCase(staff_name)) {
        duplicate = true;
        break;
      }
    }
    return duplicate;
  }
  
  public boolean checkDuplicatedUserName(String staff_id, String user_name) {
    boolean duplicate = false;
    List<String> staff_list = AccessFile.getFile("data/staff.txt");
    for (String staff: staff_list) {
      if (!staff.split("!")[0].equals(staff_id) & staff.split("!")[3].equalsIgnoreCase(user_name)) {
        duplicate = true;
        break;
      }
    }
    return duplicate;
  }
  
  public List<String> getRecordLogs(String keyword) {
    List<String> found_logs = new ArrayList<>(), logs_list = AccessFile.getFile("data/logs.txt");
    List<String> staff_list = AccessFile.getFile("data/staff.txt");
    if (logs_list.isEmpty()) {
      return found_logs;      
    }
    if (keyword.equals("Manager")) {
      for (String staff: staff_list) {
        if (staff.split("!")[2].equals("Manager")) {
          for (String log: logs_list) {
            if (log.split("!")[0].equals(staff.split("!")[3])) {
              found_logs.add(log);
            }
          }
        }
      }
    } else if (keyword.equals("Officer")) {
      for (String staff: staff_list) {
        if (staff.split("!")[2].equals("Officer")) {
          for (String log: logs_list) {
            if (log.split("!")[0].equals(staff.split("!")[3])) {
              found_logs.add(log);
            }
          }
        }
      }
    } else if (keyword.equals("Admin")) {
      for (String staff: staff_list) {
        if (staff.split("!")[2].equals("Admin")) {
          for (String log: logs_list) {
            if (log.split("!")[0].equals(staff.split("!")[3])) {
              found_logs.add(log);
            }
          }
        }
      }
    } else {
      for (String log: logs_list) {
        if (log.split("!")[0].equalsIgnoreCase(keyword)) {
          found_logs.add(log);
        }
      }
    }
    return found_logs;
  }
}
