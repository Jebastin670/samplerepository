package operators;


public class Ternary_operator {

	public static void main(String[] args) {
		//Finding greatest among three numbers using ternary operator
	
		int num1 = 12, num2 = 13, num3 = 15;
		String res = (num1>num2) ? "num1 is greater" :(num2>num3) ? "num2 is greater" :"num3 is greater" ;
		System.out.println(res);
		
		// using numbers
		
		int res1 = (num1>num2) ? num1: (num2>num3) ? num2: num3 ;
		System.out.println(res1);
		
	
}
	}