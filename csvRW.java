package cinema;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class csvRW {
	
	//Search for a specific row in database 
	//Based on first column
	//Returns column number
	public static int search(String dbname, String target) {
		String path = "./resources/" + dbname + ".csv";
		BufferedReader in;
		int count = 0;
		try {
			in = new BufferedReader(new FileReader(path));
			String row;
			List<String[]> csvData = new ArrayList<String[]>();

			while ((row = in.readLine()) != null) {
				String[] rowData = row.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
				count++;
				csvData.add(rowData);
			}
			in.close();
			for (int i = 0; i <= count; i++) {
				if (csvData.get(i)[0].equals(target)) {
					return i+1;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	//Delete row in database
	public static void delete(String dbname, int targetRow) {
		String path = "./resources/" + dbname + ".csv";
		try {
			BufferedReader in = new BufferedReader(new FileReader(path));
			StringBuffer sb = new StringBuffer("");
			int lineno = 1;
			String row;

			while ((row = in.readLine()) != null) {
				if (lineno != targetRow)
					sb.append(row + "\n");
				lineno++;
			}
			in.close();

			FileWriter fw = new FileWriter(new File(path));
			// Write entire string buffer into the file
			fw.write(sb.toString());
			fw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//write data to bottom of csv file
	//takes in data as List<String>
	public static void writeToCSV(String dbname, List<String> data) {

		String path = "./resources/" + dbname + ".csv";
		// List<String> newrow = Arrays.asList("user","pw");
		try {
			FileWriter csvWriter = new FileWriter(path, true);
			csvWriter.append(String.join(",", data));
			csvWriter.append("\n");
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Read database file based on name
	public static List<String[]> readCSV(String dbname) {
		try {
			String path = "./resources/" + dbname + ".csv";
			BufferedReader in = new BufferedReader(new FileReader(path));
			String row;
			List<String[]> csvData = new ArrayList<String[]>();

			while ((row = in.readLine()) != null) {
				String[] rowData = row.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
				csvData.add(rowData);
			}
			in.close();
			return csvData;

		} catch (FileNotFoundException e) {
			System.out.println("File Error!" + e.getMessage());
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
