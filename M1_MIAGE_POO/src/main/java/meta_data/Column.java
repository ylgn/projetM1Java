package meta_data;
import java.util.ArrayList;

import mappers.DescTypeMapper;
import mappers.VerificationRuleMapper;


public class Column {
	public String name ;
	public String type;
	public ArrayList<String> Rules ;
	public String AnonymisationType;
	public boolean withCheck=false;

	public Column() {

	}
	public boolean doAllCHeck(String toCHeck) {
		//Not Yet implemented
		return false;
	}
	public boolean doDescCHeck(String toCheckDesc) {
		//Not Yet implemented
		return false;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	//TO BE IMPLEMENTED
	public void setRule(String rule) {
		//Not Yet implemented
		
	}
	public ArrayList<String> getRules() {
		return Rules;
	}
	public String getAnonymisationType() {
		return AnonymisationType;
	}
	public void setAnonymisationType(String anonymisationType) {
		AnonymisationType = anonymisationType;
	}

}