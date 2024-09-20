package operators;

/**
 * 
 */
public class for_loop {

	public static void main(String[] args) {

		System.out.println("1 to 100 even numbers without using modulo");
		for(int i =0; i<=100; i=i+2)
		{
			//1 to 100 even numbers without using modulo
			System.out.println(i);
			//
		}
		System.out.println("--------------------");
		System.out.println("1 to 100 odd numbers without using modulo");
		
		//1 to 100 odd numbers without using modulo
				for(int x =1; x<=100; x=x+2)
				{
					System.out.println(x);
				}
				
		System.out.println("----------------");		
		System.out.println("Table format");
		//----In table format
		for(int j = 1; j<=5; j++)
		{
			System.out.println(j +"x5="+(j*5));
			
		}
		
		System.out.println("--------------------");
		System.out.println("1 to 100 odd numbers with using modulo");
		
		//1 to 100 odd numbers with using modulo
		for(int y = 1; y<=100; y++)
		{
			if((y%2)!=0)
			{
				System.out.println(y);
			}
		}
		
		System.out.println("--------------------");
		System.out.println("1 to 100 even numbers with using modulo");
		
		
		//1 to 100 even numbers with using modulo
		for(int z = 1; z<=100; z++)
		{
			if((z%2)==0)
			{
				System.out.println(z);
			}
		}
		
		
		
		
		
}
}
