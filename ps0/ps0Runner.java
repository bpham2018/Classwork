public class ps0Runner
{

	public static void main(String[] args)
	{
		
		System.out.println( "toBinary Example ( 0 )" );
		System.out.println( ps0.toBinary( 0 ) );
		System.out.println( "toBinary Example ( 21 )" );
		System.out.println( ps0.toBinary( 21 ) );
		System.out.println( "toBinary Example ( 420 )" );
		System.out.println( ps0.toBinary( 420 ) );
		
		System.out.println( "rolldie Example ( -65 )" );
		System.out.println( ps0.rollDie( -65 ) );
		System.out.println( "rolldie Example ( 0 )" );
		System.out.println( ps0.rollDie( 0 ) );
		System.out.println( "rolldie Example ( 9 )" );
		System.out.println( ps0.rollDie( 9 ) );
		System.out.println( "rolldie Example ( 500 )" );
		System.out.println( ps0.rollDie( 500 ) );
		
		System.out.println( "multiples Example ( -21 )" );
		ps0.multiples( -21 );
		System.out.println( "multiples Example ( 0 )" );
		ps0.multiples( 0 );
		System.out.println( "multiples Example ( 7 )" );
		ps0.multiples( 7 );
		System.out.println( "multiples Example ( 25 )" );
		ps0.multiples( 25 );
		
		//ps0.swap
		
		//ps0.xor
		
		System.out.print( "printStars Example ( -4 )" );
		ps0.printStars( -4 );
		System.out.println( "printStars Example ( 0 )" );
		ps0.printStars( 0 );
		System.out.println( "printStars Example ( 1 )" );
		ps0.printStars( 1 );
		System.out.println("");
		System.out.println( "printStars Example ( 23 )" );
		ps0.printStars( 23 );
		System.out.println("");
		
		System.out.println( "printTriangle Example ( -2 )" );
		ps0.printTriangle( -2 );
		System.out.println( "printTriangle Example ( 0 )" );
		ps0.printTriangle( 0 );
		System.out.println( "printTriangle Example ( 1 )" );
		ps0.printTriangle( 1 );
		System.out.println( "printTriangle Example ( 43 )" );
		ps0.printTriangle( 43 );
		
		System.out.println( "printRecursive Example ( -15 )" );
		ps0.printRecursive( -15 );
		System.out.println( "printRecursive Example ( 0 )" );
		ps0.printRecursive( 0 );
		System.out.println( "printRecursive Example ( 1 )" );
		ps0.printRecursive( 1 );
		System.out.println( "printRecursive Example ( 37 )" );
		ps0.printRecursive( 37 );
		
		System.out.println( "printRecursive2 Example ( -15 )" );
		ps0.printRecursive2( -56 );
		System.out.println( "printRecursive2 Example ( 0 )" );
		ps0.printRecursive2( 0 );
		System.out.println( "printRecursive2 Example ( 1 )" );
		ps0.printRecursive2( 1 );
		System.out.println( "printRecursive2 Example ( 37 )" );
		ps0.printRecursive2( 5 );
		
		System.out.println( "sumDigits Example ( 0 )" );
		System.out.println( ps0.sumDigits( 0 ) );
		System.out.println( "sumDigits Example ( 99 )" );
		System.out.println( ps0.sumDigits( 99 ) );
		System.out.println( "sumDigits Example ( 54321 )" );
		System.out.println( ps0.sumDigits( 54321 ) );
		
		System.out.println( "isDivisible Example ( 0 )" );
		System.out.println( ps0.isDivisible( 0 ) );
		System.out.println( "isDivisible Example ( 3 )" );
		System.out.println( ps0.isDivisible( 3 ) );
		System.out.println( "isDivisible Example ( 56 )" );
		System.out.println( ps0.isDivisible( 56 ) );
		System.out.println( "isDivisible Example ( 77 )" );
		System.out.println( ps0.isDivisible( 77 ) );
		System.out.println( "isDivisible Example ( 99 )" );
		System.out.println( ps0.isDivisible( 99 ) );
		System.out.println( "isDivisible Example ( 54321 )" );
		System.out.println( ps0.isDivisible( 54321 ) );
		
		ps0.printMoreStars( 4 );
	
	}

}