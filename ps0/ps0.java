/**
* < A compilation of methods that perform various functions >
*
* @Author Bao Pham
* 
* @version 1.0 
*
* 10/23/16
**/


public class ps0
{
	
	/**
	* This method returns a reversed version of the given string
	* @param String to be reversed
	* @return reversed String
	**/
	public static String reversal( String a )
	{
	
		if (a.length() == 1)
		
			return a;
			
		else
		
			return a.substring( a.length()-1 ) + reversal( a.substring(0, a.length()-1 ) );
			
	}
	
	/**
	* This method returns the binary version of the given decimal number
	* @param int decimal number to be converted
	* @return string of the binary number
	**/
	public static String toBinary ( int decimalNumber )
	{
	
		if ( decimalNumber == 0 )
		
			return "0";
			
		String binaryNumber = "";
			
		while ( decimalNumber != 0)
		{
		
			int remainder = decimalNumber % 2;
			
			binaryNumber += remainder;
			
			decimalNumber = decimalNumber/2;
			
		}
		
		return reversal(binaryNumber);


	}
	
	/**
	* This methods returns the result of rolling a dice with n(parameter) sides
	* @param int sides
	* @return String result
	**/
	
	public static String rollDie(int sides)
	{
	
		if (sides <= 0)
		
			return "You cannot roll a dice with 0 or negative sides";

		else
		{
		
			int result = (int)(Math.random() * sides + 1);
	
			return "" + result;
			
		}
		
	}
	
	/**
	* This method prints out a stair of multiples according to the given dimensions(parameter)
	* @param int dimensions
	* @return void
	**/
	
	public static void multiples( int dimensions )
	{
		
		if (dimensions <= 0)
		{
			
			System.out.println( "You cannot have a table with 0 or a negative number for dimensions" );
			
		}
			
		else
		{
			for (int row = 1; row < dimensions + 1; row++ )
			{
				for (int column = 1; column < row + 1; column++ )
				{
				
					System.out.print( column*row + " " );
			
				}
			
				System.out.println("");
		
		
			}
		}
		
	
	}	
	
	//public static int swap( int n )
	//{
	
		
	
	
	
	
	
	
	//}
	
	//xor- i dont understand what you want for this one
	
	/**
	* This method prints "*" n(parameter) times
	* @param int number of stars to print
	* @return void
	**/
	
	public static void printStars( int numStars )
	{
	
		if ( numStars < 0 )
		{
			
			System.out.println( "" );
			
		}
		
		else
		{
	
			for (int i = 0; i < numStars; i++)
			
				System.out.print("*");
			
			
		}
		
	}
	
	/**
	* This method prints a right triangle with n(parameter) base and height using the printStars method
	* @param int dimensions
	* @return void
	**/
	
	public static void printTriangle( int dimensions )
	{
	
		if ( dimensions < 0 )
		{
		
			System.out.println( "" );
			
		}
	
		else
		{
		
			for (int i = 1; i < dimensions+1; i++ )
			{
		
				printStars( i );
				System.out.println("");
			
			}
		
		}
			
	}
	
	/**
	* This method prints a right triangle with n(parameter) base and height using the printStars method- recursive
	* @param int dimensions
	* @return void
	**/
	
	public static void printRecursive( int measurements )
	{ 
	
		if ( measurements < 0 )
		{
		
			System.out.println( "" );
		
		}
		
		else
		{
			
			printRecursive( measurements - 1 );
			printStars( measurements );
			System.out.println( "" );
			
		}
		

	}
	
	/**
	* This method prints an upside-down right triangle with n(parameter) base and height using the printStars method- recursive
	* @param int dimensions
	* @return void
	**/
	
	public static void printRecursive2( int size )
	{
		if (size < 0)
		
			System.out.print( "" );
		
		else
		{
		
			printStars( size );
			System.out.println( "" );
			printRecursive2( size - 1 );
			
		}
		
	}
	
	/**
	* this method takes an integer as a parameter and returns the sum of its digits
	* @param int integer whose digits are to be added
	* @return int sum of digits
	**/
	
	public static int sumDigits( int g )
	{
	
		int sum = 0;
		
		while ( g > 0 )
		{
		
			sum += g % 10;
			g = g/10;
			
		}

		return sum;
	
	
	}
	
	/**
	* this method takes an int parameter and returns true if the int is evenly divisible by 3 false if it is not
	* @param int to see if divisible by 3 evenly
	* @return boolean true if int is divisible by 3 evenly and false if not
	**/
	
	public static boolean isDivisible( int h )
	{
	
		while ( h > 9)
		{
		
			h = sumDigits( h );
			
		}
		
		System.out.print( h ); //test
		
		if (h == 0 || h == 3 || h == 6 || h == 9)
		{
		
			return true;
			
		}
		
		else
		{
		
			return false;
			
		}
	
	
	}
	
	public static void printMoreStars( int n )//2x+1
	{
	
		int numberStarsMiddle = ( 2*n - 1 );
		
		for ( int numberStars = 1; numberStars <= numberStarsMiddle; numberStars+=2 )
		{
		
			for ( int m = 1; m <= (numberStarsMiddle - numberStars)/2 ; m++ )
				
				System.out.print( " " );
				
			printStars( numberStars );
			
			for ( int m = 1; m <= (numberStarsMiddle - numberStars)/2 ; m++ )
				
				System.out.print( " " );
				
			System.out.println("");
				
		}
		
		for ( int p = numberStarsMiddle-2; p >= 1; p-= 2 )
		{
			for ( int m = 1; m <= (numberStarsMiddle - p)/2 ; m++ )
				
				System.out.print( " " );
				
			printStars( p );
			
			for ( int m = 1; m <= (numberStarsMiddle - p)/2 ; m++ )
				
				System.out.print( " " );
				
			System.out.println("");
				
		}
	
	
	
	}
		
}





