/**
*
*
*/
public class LoopExamples
{

	/**
	* @param args NA
	*/
	public static void main(String[] args)
	{
		// call to method whileLoop(int n)
		whileLoop(5);
		
		System.out.println("------------------");
		
		// call to method forLoop(int n)
		forLoop(5);
		
		printStarGrid(5);
		
		printStaircase(5);
		
		printStaircaseUpsideDown(5);
		
		dice(6);
		
	}
	
	/**
	* @param n NA
	*/
	
	public static void whileLoop(int n)
	{
		int x = 1;
		while( x<n)
		{
			System.out.println(x);
			x++;
			// x = x + 1
			// x += 1
		}
	}
	
	/**
	* @param n NA
	*/
	public static void forLoop(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			System.out.println(i);
		}
	}
	
	/**
	* @param n NA
	*
	*/
	public static void printStarGrid(int n)
	{
	
		for( int q = 1; q<=n; q++)
		{
			
			for( int f = 1; f<=n; f++)
			{
			
				System.out.print("%");
			
				
			}
			
			System.out.println("");
			

			
		}	
				
	}
	
	
	/**
	* This algorithm prints out an n by n staircase
	* @param n dimensions of staircase
	*/
	public static void printStaircase(int n)
	{
		
		for( int row = 0; row < n; row++ )
		{
		
			for( int col = 0; col < row+1; col++ )
			{
			
				System.out.print( "*");
			
			}
			
			System.out.println("");
			
			
		}
		
	}
	
	/**
	* This algorithm prints out an upside-down n by n staircase
	* @param n dimensions of staircase
	*/
	
	public static void printStaircaseUpsideDown(int n)
	{
	
		for( int row = 0; row < n; row++ )
		{
		
			for( int col = 0; col < n-row; col++ )
			{
			
				System.out.print( "*");
			
			}
			
			System.out.println("");
			
			
		}
		
	}
	
	public static void dice( int n )
	{
	
		int i = (int)(Math.random()*n+1);
		System.out.print(i);
	
	}
		
}