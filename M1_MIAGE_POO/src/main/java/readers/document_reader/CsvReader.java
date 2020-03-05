package readers.document_reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Launcher.MainPg;

/**
 * 
 * Class responsable de la lecture des fichiers CSV
 * 
 * @version 1.0
 * @author Nadir Omega
 * @author ylgn
 *
 */
class CsvReader extends DocumentReader {
	// CHANGE EXCEPTION TYPE

	int iter = 1;
	String separator;

	public CsvReader(String pathToCsv, String Separator) {
		this.path = pathToCsv;
		this.separator = Separator;

	}

	/**
	 * Return a all the file contained into a given file
	 * 
	 * @return An ArrayList of String [] with all the data kept in it.
	 * @throws IOException
	 */
	public ArrayList<String[]> readAllFile() {
		try {
			csvReader = new BufferedReader(new FileReader(this.path));
			ArrayList<String[]> allData = new ArrayList<String[]>();
			;
			String row;
			while ((row = csvReader.readLine()) != null) {
				String[] data = row.split(",");
				allData.add(data);
				csvReader.close();
				
				return allData;
		}} catch (IOException e) {
			// TODO Auto-generated catch block
			MainPg.logger.error("Error invalid path for csv ");
			e.printStackTrace();
		}
		return null;
	
		}
		
	

	/**
	 * Return n into a given file
	 * 
	 * @param Int giving the number of records to read
	 * @return An ArrayList of String [] with all the data kept in it.
	 * @throws IOException
	 */
	public ArrayList<String[]> readMultipleLine(int nb) throws IOException {
		csvReader = new BufferedReader(new FileReader(this.path));
		ArrayList<String[]> allData = new ArrayList<String[]>();
		//System.out.println("Read chunk nb :" + this.iter);

		String row;
		int cpt = 1;
		while ((row = csvReader.readLine()) != null && cpt <= iter * nb) {
			if (cpt > ((iter - 1) * nb)) {
				String[] data = row.split(this.separator);
				allData.add(data);
			}
			cpt++;
		}
		if (row == null) {
			this.containsData = false;
		}
		iter++;
		MainPg.logger.info("Succsefully CSV read chunk nb "+this.iter);
		csvReader.close();
		return allData;
	}

}
