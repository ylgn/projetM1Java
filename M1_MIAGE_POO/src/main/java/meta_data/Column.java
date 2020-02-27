package meta_data;

import java.util.ArrayList;

import mappers.DescTypeMapper;
import mappers.VerificationRuleMapper;

/**
 * The class where data are stocked in ram, and where principal function are
 * called such as Verification or Anonymisation.
 * 
 * @version 1.0
 * @author Nadir Omega
 * @author ylgn
 */

public class Column {
	public String name;
	public String type;
	public ArrayList<String> Rules;
	public String AnonymisationType;
	public boolean withCheck = false;
	// enumeration type of this column

	public Column() {

	}

	/**
	 * Return a boolean if a data comply or not with a rule.
	 * Weather all the test are done & Comply the method return true
	 * Weather not we return false.
	 * 
	 * @param String giving the name of the checked data
	 * @return A boolean
	 */
	public boolean doAllCHeck(String toCHeck) {
		boolean temp = true;
		if (!withCheck) {
			return true;
		}
		for (String rule : Rules) {
			temp = temp && VerificationRuleMapper.doMap(rule, toCHeck);
		}
		return temp;
	}
	public boolean doDescCHeck(String toCheckDesc) {
		// TODO Auto-generated method stub
		return DescTypeMapper.doMap(this.type, toCheckDesc);
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

	public void setRule(String rule) {
		if (!withCheck) {
			this.Rules = new ArrayList<String>();
			this.withCheck = true;
		}
		this.Rules.add(rule);
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