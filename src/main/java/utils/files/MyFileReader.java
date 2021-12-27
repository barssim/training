package utils.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MyFileReader {


	public static void main(String[] args) {
		
	        final String file = "Student.txt";
	        String suchendeString = "Mark Sagal";
	        String line = null;
	        ArrayList<String> fileContents = new ArrayList<>();

	        try {
	            FileReader fReader = new FileReader(file);
	            BufferedReader fileBuff = new BufferedReader(fReader);
	            while ((line = fileBuff.readLine()) != null) {
	                fileContents.add(line);
	            }
	            fileBuff.close();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
		for (String item : fileContents) {
			if (suchendeString.equals(item)) {
				System.out.println("String existe in File");
				return;
			}

		}
	
		System.out.println("String not existe in File");
		return;
	       
	}
}
