package Problems;

public class Sum_of_array {

	public static void main(String[] args) {
		// sum of values in a array
		
		int a[] = {10, 20, 30, 40, 50};
		int Sum = 0;
		
		for (int i = 0; i<a.length; i++)
		{
			
			Sum +=a[i];
			
		}
		System.out.println(Sum);
		

	}

}
