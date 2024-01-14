package assertj;

import java.util.ArrayList;
import java.util.List;

public enum DateOperator {
	
	IS_AFTER, 
	IS_AFTER_EQUALS,
	IS_BEFORE, 
	IS_BEFORE_EQUALS,
	IS_NOT_EQUAL, 
	IS_EQUAL;
 
	public static String[] valueString() {
		List<String> valueStrings = new ArrayList<String>();
		for (DateOperator operator : values()) {
			valueStrings.add(operator.name());
		}

		return valueStrings.toArray(new String[0]);
	}

}