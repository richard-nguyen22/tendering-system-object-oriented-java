package classes;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccessFile {
  public static List<String> getFile(String path) {
    List<String> list = new ArrayList<>();
    try {
      list = Files.readAllLines(
          Paths.get(path),
          Charset.defaultCharset());
    } catch (IOException ex) {
      Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    return list;
  }
    
  public static void writeToFile(List<String> list, String file_path) {
    list.sort(Comparator.naturalOrder());
    Path path;
    path = Paths.get(file_path);
    if (Files.notExists(path)) {
        try {
          Files.createFile(path);
        } catch (IOException ex) {
          Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    try {
      Files.write(path, list, StandardOpenOption.TRUNCATE_EXISTING);
    } catch (IOException ex) {
      Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public static void appendToFile(String data, String file_path) {
    Path path = Paths.get(file_path);
    data += "\r\n";
    try {
      Files.write(path, data.getBytes(), StandardOpenOption.APPEND);
    } catch (IOException ex) {
      Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public static void checkFolder(String folder_name) {
    Path folder_path = Paths.get(folder_name);
    if (Files.notExists(folder_path)) {
      try {
        Files.createDirectory(folder_path);
      } catch (IOException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  public static void checkFile(String path) {
    Path file_path = Paths.get(path);
    if (Files.notExists(file_path)) {
        try {
          Files.createFile(file_path);
          if (path.equals("data\\staff.txt")) {
            String staff = "";
            staff += "1!PeterAdmin!Admin!admin!Admin!Endah Ria!011111111\r\n" +
                "2!PeterManager1!Manager!manager!Man1!KLCC!022222222\r\n" +
                "3!Officer1!Officer!officer1!111!Vista!012345678\r\n";
            Files.write(file_path, staff.getBytes(), StandardOpenOption.APPEND);
          }
        } catch (IOException ex) {
          Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  }

}

