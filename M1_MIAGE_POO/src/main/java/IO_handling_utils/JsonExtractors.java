package IO_handling_utils;

import org.json.simple.JSONObject;

import meta_data.Column;
/**
 * 
 * Contains all functions that help us to extract String from JSon Object
 *
 */
public class JsonExtractors {
	public static Column initCol(JSONObject jsonObject,String ruleName) 
	{
		return null;
	}
	public static void parseRuleObject(Column tempCOl,JSONObject jsonObject,String ruleName) 
	{
		
	}
	//

	public static String extractNameFromJsObject(JSONObject jsonObject) {
		return null;
	}
	public static String extractByNameFromJsObject(String str,JSONObject jsonObject) {
		//Not Yet implemented
		return null;
	}
	public static void extractVerificationRuleFromJsObject(Column tempCOl,JSONObject jsonObject,String ruleName) {
		//Not Yet implemented
	}
	public static String extractAnonymisationRuleFromJsObject(JSONObject jsonObject,String ruleName) {
		return null;
		//Not Yet implemented
	}
	
	public static void extractNameAndTypeFromJsObj(Column tempCOl,JSONObject jsonObject,String ruleName) {  
		//Not Yet implemented
	}
}