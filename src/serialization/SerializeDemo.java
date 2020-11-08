package serialization;

import java.io.*;
public class SerializeDemo {

   public static void main(String [] args) {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;
      
      try {
    	 String projectFolder =  System.getProperty("user.dir");
         FileOutputStream fileOut =
         new FileOutputStream(projectFolder + "/src/serialization/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in %s/src/serialization/employee.ser", projectFolder);
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}