package manipulateCsvFile;


public class ReadNSearchFile {

	public static void main(String[] args) {
		readAndSearchClass obj1 = new readAndSearchClass();
		String[] data = new String[10];
		data = (readAndSearchClass.readRecord("data.csv","4444"));
		for(int i=0 ; i<data.length; i++) {

			System.out.println(data[i]);
			
		}
	}	
	
}
