 package Java_Basic_Concepts;

public class VariableRules {

	public static void main(String[] args) {
		
		/**
		 * -----VARIABLES----
		 * 	--->Name of memory location and  stores a piece of data
		 * -------Variable Declaring Rules------
		 * 1. Space and special characters are not allowed. Only _ and $ are allowed
		 * 2. Variable should not start with number
		 * 3. Identifiers can have alphabets, numbers, _ and $
		 * 4. Upper-case and lower-case are distinct
		 * 5. Variable name can be any length
		 */
		int ASD = 256; // upper-case
		int asd = 256; //lower-casse
		
		int _asl = 345;// started with _
		int $asl =21;// started with $
		
		int 1asdd = 45; // this is an error, variable should not start with numbers
		int 1as dd = 45; // this one also an error. space between variable names yield errors

	}

}
