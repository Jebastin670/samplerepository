package operators;

public class do_while {

	public static void main(String[] args) {
		
		
		System.out.println("in tables format");
		//In tables format
		int i = 10;
		do
		{
			System.out.println(i +"x5="+(i*5));
			i--;
		}while(i>=1);
		
		System.out.println("---------------------");
		System.out.println("descending order of even numbers");	
		
		//descending order of even numbers
		
				int j = 10;
				do {
					if((j%2)==0)
					{
					System.out.println(j);
					}
					j--;
				}while(j>=1);
				
		System.out.println("---------------");
		System.out.println("Descending order of Numbers");

		//descending order of numbers
		
			int k = 10;
				do {
					System.out.println(k);
					k--;
				}while(k>=1);
				
	}

}
