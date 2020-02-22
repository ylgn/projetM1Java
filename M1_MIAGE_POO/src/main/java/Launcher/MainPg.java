package Launcher;

import anonymisation.Anonymisation;
import verification.Verification;

public class MainPg {
	public static int blockSize=2;
	public static String InSeparator=";";
	public static String OutSeparator=";";
	public static void main(String[] args) throws Exception {
		//init env Variables

		String in="testCSv.csv";
		String out="testCSv2.csv";
		String descFilePath="desc.json";
		String checkFilePath="check.json";
		String anonFilePath="anon.json";
		String choice = "anonymisation";		
		if (choice.equals("anonymisation")) {
			Anonymisation anonymisation = new Anonymisation(in,out,descFilePath,anonFilePath);
			anonymisation.doAnonymisation();
		}
		else {
			Verification verification = new Verification(in,out,descFilePath,checkFilePath);
			verification.doVerification();
		}
		
	}


}
