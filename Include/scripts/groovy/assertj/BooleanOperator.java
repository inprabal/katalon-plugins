package assertj;

import java.util.ArrayList;
import java.util.List;

public enum BooleanOperator {
	
	IS_TRUE, 
	IS_FALSE;

	public static String[] valueString() {
		List<String> valueStrings = new ArrayList<String>();
		for (BooleanOperator operator : values()) {
			valueStrings.add(operator.name());
		}

		return valueStrings.toArray(new String[0]);
	}

}