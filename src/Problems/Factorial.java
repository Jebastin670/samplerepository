package Problems;

public class Factorial {

	public static void main(String[] args) {
		int i , fact;
		fact = 1;
		
		for( i = 1; i<=10; i++)
			
		{
			fact*=i; //fact = fact*i
		}
		System.out.println(fact);

	}

}
