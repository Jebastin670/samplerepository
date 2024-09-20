package Java_Basic_Concepts;

public class DataTypes {

	public static void main(DataType_String[] args) {
		/**------Data types in java
		 * ----------------Primitive  data types-------------
		 * 1. Integer----> Stores whole numbers without decimals
		 * 		1. byte ---8bit of memory
		 * 			--> Range from -128 to 127
		 * 		2. short---16 bit of memory
		 * 			--> Range from -32,768 to 32,767
		 * 		3. int---32 bit of memory
		 * 			--> Range from -2,147,483,648 to 2,147,483,647
		 * 		2. long---64 bit of memory
		 * 			--> Range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		 * 
		 * 2. floating point----> numbers with decimal point
		 * 		1. float---decimal numbers, it can stores upto 7 decimal digits
		 * 			-->32 bit of memory
		 * 		2.double---it can stores upto 15 deimal digits
		 * 			-->64 bit of memory
		 * 
		 * 3. char-----stores single character or letter
		 * 			-->16 bit of memory
		 * 
		 * 4. boolean------stores true or false vaules
		 * 			-->1 bit of memory
		 * 
		 */
		
		// Here some examples for each primitive data types
	
		// INTEGER TYPES
		byte exp2 = 18;
		short exp3 = 34;
		int exp1 = 456778; 
		long exp4 = 4366363733637l;// should end the value with "l" or "L" for avoiding unnecessary errors
		
		// FLOATING POINT TYPES
		
		float expp = 4.567899f; // we should include "f" or "F" at the end of the value
		double expp2 = 7.90897878788d; // we should include "D" or "d" at the end of the value
		
		// CHARACTERS
		char letter = 'j'; // character should be surrounded by single quotes
		
		// BOOLEAN
		boolean j = false;
		boolean i = true;// it only takes true or false values
		
		/**
		 *---------------Non-primitive data types----------
		 *--->Non-primitive data types are derived from primitive data types
		 *--->Starts with upper case letters
		 *1. Strings--->collection of characters
		 *2. Arrays--->store multiple values in a single variable
		 *3. Classes,...etc
		 */

	}

}
