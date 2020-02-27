package meta_data;

import java.util.ArrayList;

/**
 * Creation of an extension class of ArrayList<Column> This class helps us to
 * stock our column once read
 * 
 * @version 1.0
 * @author Nadir Omega
 * @author ylgn
 */
public class LineMetaData extends ArrayList<Column> {

	private static final long serialVersionUID = 1L;

	/**
	 * Return a specific Column given by its name. Prior giving the column, the
	 * algorithm brows all the list till it finds the seek column.
	 * 
	 * @param String giving the name of the column to reach.
	 * @return A column
	 */
	public Column getColByName(String colName) {
		for (Column c : this) {
			if (c.getName().equals(colName))
				return c;
		}
		return null;
	}

}
