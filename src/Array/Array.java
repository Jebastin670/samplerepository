package Array;

public class Array {

	public static void main(String[] args) {
		// -------ARRAY--------
		
		int a[] = {10,20,30,40};
		
		for(int i=0; i<=3; i++)
		{
			System.out.println(a[i]);
		}
		
		//length of array is 4
		System.out.println("Printing values in reverse");
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}

	}

}
