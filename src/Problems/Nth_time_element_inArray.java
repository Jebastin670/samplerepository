package Problems;

public class Nth_time_element_inArray {

	public static void main(String[] args) {

		int arr[] = {10, 11, 10, 12, 13};
		
		for(int i = 0; i<arr.length; i++)
		{
		 for(int j = 1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]+"Appeared multiple times");
					
				}
				
				
		}
			
		}
	}

}
