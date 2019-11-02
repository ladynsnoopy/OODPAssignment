package cinema;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class csvRW {

	// Search for a specific row in database
	// Based on first column
	// Returns column number
	public static int search(String dbname, String target) {
		String path = "./resources/" + dbname + ".csv";
		BufferedReader in;
		// int count = 0; // no need a count variable can use size()
		try {
			in = new BufferedReader(new FileReader(path));
			String row;
			List<String[]> csvData = new ArrayList<String[]>();

			while ((row = in.readLine()) != null) {
				String[] rowData = row.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
				// count++;
				csvData.add(rowData);
			}
			in.close();
			for (int i = 0; i < csvData.size(); i++) {
				if (csvData.get(i)[0].equals(target)) {
					return i;
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

	// Delete row in database
	public static void delete(String dbname, int targetRow) {
		String path = "./resources/" + dbname + ".csv";
		try {
			BufferedReader in = new BufferedReader(new FileReader(path));
			StringBuffer sb = new StringBuffer("");
			int lineno = 0; // I changed here, should be zero
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

	// write data to bottom of csv file
	// takes in data as List<String>
	public static void writeToCSV(String dbname, ArrayList<String> data) {

		String path = "./resources/" + dbname + ".csv";
		// List<String> newrow = Arrays.asList("user","pw");
		for (int i=0;i<data.size();i++) {
			data.set(i, format(data.get(i)));
		}
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

	// Read database file based on name
	public static ArrayList<String[]> readCSV(String dbname) {
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

	public static void editCSV(String dbname, int targetRow, int targetcol, int totalcol, String change) {
		String path = "./resources/" + dbname + ".csv";
		try {
			BufferedReader in = new BufferedReader(new FileReader(path));
			StringBuffer sb = new StringBuffer("");
			int lineno = 0;
			String row;
			change = format(change);
			while ((row = in.readLine()) != null) {
				if (lineno != targetRow) {
					sb.append(row + "\n");
					System.out.println(sb);}
				else if (lineno == targetRow) {
					String[] rowData = row.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
					//rowData[targetcol] = change;
					//	System.out.println(rowData[targetcol]);
					
					for (int i = 0; i < totalcol; i++) {
						if (i==targetcol && i==totalcol-1) {
							sb.append(change + "\n");
							break;
						}
						else if (i==targetcol) {
							sb.append(change);
							sb.append(",");
						}
						else if (i == totalcol - 1) {
							sb.append(rowData[i] + "\n");}
							
							else {
							sb.append(rowData[i]);
							sb.append(",");
						}

					}
				}
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
	
	
	private static String format(String str) {
	    return "\"" + str + "\"";
	}
}
