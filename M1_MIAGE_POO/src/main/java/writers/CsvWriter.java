package writers;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import IO_handling_utils.StringUtils;
/**
 * 
 * @author Nad Desktop
 *
 */
class CsvWriter extends Writer{
	/**
	 * 
	 */
	//CHANGE EXCEPTION TYPE
	int iter=1;
	
	public CsvWriter(String pathToCsv,String separator) throws Exception {
		path=pathToCsv;
		this.separator=separator;
	}


	public void writeFileFromList(List<String[]> beforWrite) throws IOException {
		//Not Yet implemented

	}



}

