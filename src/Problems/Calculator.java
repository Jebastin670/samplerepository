package Problems;



public class Calculator {

	public static void main(String[] args) {
		addition(4.5478f, 56.7865f);
		double sub = subtract(36.567d, 21.456d);
		System.out.println("Subtract---> "+sub);
	}
	static void addition(float a, float b)
	{
		float sum = a+b;
		System.out.println("Addition--> "+sum);
	}
	static double subtract(double a, double b)
	{
		return a-b;
	}
	}
	


		


