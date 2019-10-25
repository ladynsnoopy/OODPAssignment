package cinema;

import java.util.ArrayList;
import java.util.List;

public class readwriteTest {
	public static void main(String[] args) {
		
		//read data test
		//returns an array of string array
		List<String[]> csvData =  new ArrayList<String[]>();
		csvData = csvRW.readCSV("moviedatabase");
		//example of going thru data
		int i = Integer.parseInt(csvData.get(0)[6]);
		System.out.println(i);
		//more example 
		for (int j=0; j<csvData.size();j++) {
			System.out.println(csvData.get(i)[0]);
		}
		
		//search example to find the row data is in
		//i can change this to return the row instead
		int a = csvRW.search("staffdatabase", "gv003");
		System.out.println(a);
		
		
		
//  	//adding example
//		List<String> addstuff = new ArrayList<String>();
//		addstuff.add("gv003");
//		addstuff.add("password123");
//		csvRW.writeToCSV("staffdatabase", addstuff);
//		
//		//delete example
//		csvRW.delete("staffdatabase", 6);
	}
}
