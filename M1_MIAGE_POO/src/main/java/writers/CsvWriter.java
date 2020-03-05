package writers;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import IO_handling_utils.StringUtils;
import Launcher.MainPg;
/**
 * 
 *
 *
 */
class CsvWriter extends Writer{
	/**
	 * 
	 */
	//CHANGE EXCEPTION TYPE
	int iter=1;
	
	public CsvWriter(String pathToCsv,String separator)  {
		path=pathToCsv;
		this.separator=separator;
	}


	/** Write a String tab into a CSV file
	 * It calls StringUtils to get full a String with the requested separator 
	 *@param String tab giving the String we want to write
	 *@throws IOException
	 */
	public void writeFileFromList(List<String[]> beforWrite) {
		FileWriter writer;
		try {
		if (iter==1) {
			
				writer = new FileWriter(this.path) ;
			} 
		
		else {
			writer = new FileWriter(this.path,true) ;
		}

		BufferedWriter bw;
		bw = new BufferedWriter(writer);
		for(String[] line: beforWrite) {
			bw.write(StringUtils.arrayToStr(line,this.separator));
		}
		bw.close();
		writer.close();
		iter ++;
		}
		catch (IOException e) {
			MainPg.logger.error("write pah invalid check admin right");
			e.printStackTrace();
		}
	}



}

