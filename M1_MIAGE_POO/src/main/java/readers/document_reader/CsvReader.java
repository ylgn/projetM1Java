package readers.document_reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 *
 * Class responsable de la lecture des fichiers CSV
 *
 */
 class CsvReader extends DocumentReader{
	//CHANGE EXCEPTION TYPE
	
	String separator;
	public CsvReader(String pathToCsv,String Separator) throws Exception {
		this.path=pathToCsv;
		this.separator = Separator;
		
	}
	/**
	 * If we want to read all the file and load it to RAM
	 * @return
	 * @throws IOException
	 */
	public ArrayList<String[]> readAllFile() throws IOException {
		//Not Yet implemented
		return null;

	}
	/**
	 * LOAD SPECIFIC NUBER OF LINE
	 * @param nb
	 * @return
	 * @throws IOException
	 */
	public ArrayList<String[]> readMultipleLine(int nb) throws IOException {
		//Not Yet implemented
		return null;
	}

}

