package assertj;

import java.util.ArrayList;
import java.util.List;

public enum StringOperator {
	IS_EQUAL, 
	IS_NOT_EQUAL, 
	CONTAINS, 
	NOT_CONTAINS;
 
	public static String[] valueString() {
		List<String> valueStrings = new ArrayList<String>();
		for (StringOperator operator : values()) {
			valueStrings.add(operator.name());
		}

		return valueStrings.toArray(new String[0]);
	}

} 