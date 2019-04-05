package manipulateCsvFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class readAndSearchClass {
	private static Scanner x;
	public static String[] readRecord(String searchTerm,String filepath) {
		ArrayList<String> record = new ArrayList<String>();
		
		boolean found = false;
		String ID = "";
		String name1= "";
		String age="";
		String status="";
		String rec="";
		
		try {
			x = new Scanner (new File("data.csv"));
			x.useDelimiter("[,\n]");
			
			while(x.hasNext()) {
				
				ID=x.next();
				
			if(ID.equals("4444")) {
					name1=x.next();
					age = x.next();	
					status = x.next();
					rec = ID + "," + name1 + "," +age+ ","+status;
					record.add(rec);
					found=true;
				}
			else {
					x.next();
					x.next();
					x.next();
				}
			}	
			if(!found) {
				System.out.println("No records found");
			}
			
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		String[] recordsArray = new String[record.size()];
		record.toArray(recordsArray);
		return recordsArray;
		
	}

}
