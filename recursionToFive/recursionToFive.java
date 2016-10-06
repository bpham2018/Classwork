public class recursionToFive
{

	public static void main(String[] args)
	{
	
		printNum(6);
		
	
	}	
	
	public static void printNum(int n)
	{
	
		if ( n == 0)
		{
			System.out.println(n);
			
		}
			
		else
		{
		
			printNum(n-1);
			System.out.println( n );
			

		}
	
	
	
	
	}
	
	
	
	
}