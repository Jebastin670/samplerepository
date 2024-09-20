package operators;

public class Conditional_Statements_if {

	public static void main(String[] args) {
// Greatest among three numbers using conditional statement if
		
		/**int num1, num2, num3;
		num1 = 15;
		num2 = 15;
		num3 = 16;
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("num1 is greater");
		}
		else if(num2 > num3 && num2 > num1)
		{
			System.out.println("num2 is greater");
		}
		else
		{
			System.out.println("num3 is greater");
		} */
		
		int num1, num2, num3;
		num1 = 15;
		num2 = 15;
		num3 = 16;
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("num1 is greater");
		}
		else
		{
			if(num2 > num3)
			{
				System.out.println("num2 is greater");
			}
			else
			{
				System.out.println("num3 is greater");	
			}
				
		}
	}

}

		
		
		
