import java.io.*;
import java.util.Arrays;
import java.util.List;

public class reading1 {

	public static void writeToCSV(String title, String genre, String runtime) {
		List<String> newrow = Arrays.asList(title, genre, runtime);
		try {
			FileWriter csvWriter = new FileWriter("resources/Book1.csv", true);
			csvWriter.append(String.join(",", newrow));
			csvWriter.append("\n");
			csvWriter.flush();
			csvWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readCSV() {
		try {
			BufferedReader in = new BufferedReader(new FileReader("resources/Book1.csv"));
			String row;

			System.out.println("The file contains:");
			while ((row = in.readLine()) != null) {
				String[] data = row.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
				for (String str : data) {
					System.out.print(str);
					System.out.println();
				}
			}
			in.close();

		} catch (FileNotFoundException e) {
			System.out.println("File Error!" + e.getMessage());
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		readCSV();
	}
}
