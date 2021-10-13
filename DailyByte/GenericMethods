import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenericValidation {

	// 1 Generic method for datatype validation
	// Numeric includes (Byte, Short, Integer, Long, Float, Double)
	public <E> boolean dataTypeValidation(E inputValue, String dataType) {
		if (inputValue == null) {
			return false;
		}
		if (dataType.equalsIgnoreCase("Numeric")) {
			return (inputValue instanceof Byte || inputValue instanceof Integer || inputValue instanceof Short
					|| inputValue instanceof Long || inputValue instanceof Float || inputValue instanceof Double);
		} else if (dataType.equalsIgnoreCase("Character") || dataType.equalsIgnoreCase("Char")) {
			return (inputValue instanceof Character);
		} else if (dataType.equalsIgnoreCase("String")) {
			return (inputValue instanceof String);
		} else if (dataType.equalsIgnoreCase("Boolean")) {
			return (inputValue instanceof Boolean);
		} else {
			return false;
		}
	}

	/*
	 * 2. return true if the data length is less than or equal to the maximum length
	 * passed in the function else the function will return false.
	 */
	public <E> boolean dataLength(E inputValue, int maxlength) {
		if (inputValue == null) {
			return false;
		}
		return (inputValue.toString().length() <= maxlength);
	}

	/*
	 * 3. The function will return true if the restricted characters are not present
	 * in the data passed else the function will return false.
	 */
	public <E, T> boolean specialCharCheck(E inputData, T restricted) {
		if (inputData == null || restricted == null) {
			return false;
		}
		String inputStr = inputData.toString();
		String resStr = restricted.toString();
		for (int i = 0; i < resStr.length(); i++) {
			char ch = resStr.charAt(i);
			if (inputStr.indexOf(ch) > -1) {
				return false;
			}
		}
		return true;
	}

	/*
	 * 4. The function will return true if the field value passed is in the domain
	 * list else it will return false.
	 */
	public <E> boolean domainValueCheck(E inputData, List<E> domainList) {
		if (inputData == null || domainList.isEmpty()) {
			return false;
		}
		if (domainList.contains(inputData)) {
			return true;
		}
		return false;
	}
  }
