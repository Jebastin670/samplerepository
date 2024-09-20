package operators;

public class While {

	public static void main(String[] args) {
		
		//table format
		System.out.println("Table format");
		int i = 1;
		while(i<=5)
		{
			System.out.println(i+"x5="+(i*5));
			i++;
		}
		
		System.out.println("--------");
		System.out.println("Numbers in descending order");
		
		//numbers in descending order
		int j = 10;
		while(j>=1)
		{
			System.out.println(j);
			j--;
		}
		
		System.out.println("--------");
		System.out.println("Even numbers in descending order");
		
		//Even numbers in descending order
		int k = 10;
		while(k>=1)
		{
			if((k%2)==0)
			{
				System.out.println(k);
			}
			k--;
		}
		
		
	}

}
