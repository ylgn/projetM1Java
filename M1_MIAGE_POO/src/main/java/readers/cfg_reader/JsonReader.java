package readers.cfg_reader;


import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import meta_data.LineMetaData;
/**
 * TO DO :
 * Create new Structure
 * 
 *
 */

 class JsonReader extends CfgReader
{
	JSONParser jsonParser;
	ArrayList<JSONObject> jsonElemnts ;
	
	public  JsonReader(String path)
	{
		//Not Yet implemented

	}
	public void initElement() throws IOException, ParseException {
		//Not Yet implemented
	}
	public LineMetaData initMetaData() throws IOException, ParseException {
		//Not Yet implemented
		return null;
	}
	public LineMetaData initRuleMetaData(LineMetaData ref) throws IOException, ParseException {
		//Not Yet implemented
		return null;
	}
	public LineMetaData initAnonymisationMetaData(LineMetaData ref) throws IOException, ParseException {
		//Not Yet implemented
		return null;
	}


}