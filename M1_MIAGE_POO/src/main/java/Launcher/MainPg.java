package Launcher;

import anonymisation.Anonymisation;
import verification.Verification;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MainPg {
	public static int blockSize=2;
	public static String InSeparator=";";
	public static String OutSeparator=";";
	public static final Logger logger = Logger.getLogger(MainPg.class);
	
	public static void main(String[] args) throws Exception {
		//init env Variables
		String propertiesFolder="properties";
		PropertyConfigurator.configure(propertiesFolder+"//log4j.properties");
		String jsonCfgPath="JsonCfg//";
		String in="testCSv.csv";
		String out="testCSv2.csv";
		String descFilePath=jsonCfgPath+"desc.json";
		String checkFilePath=jsonCfgPath+"check.json";
		String anonFilePath=jsonCfgPath+"anon.json";
		String choice = "anonymisation";	
		if (choice.equals("anonymisation")) {
			Anonymisation anonymisation = new Anonymisation(in,out,descFilePath,anonFilePath);
			anonymisation.doAnonymisation();
			System.out.println("out: "+out);
		}
		else {
			Verification verification = new Verification(in,out,descFilePath,checkFilePath);
			verification.doVerification();
			System.out.println("out: "+out);
		}
		
	}


}
