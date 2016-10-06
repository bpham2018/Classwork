/**
* < Can simulates multiple Monty Hall games and return the percentage of winning if you switch and winning if you stay>
* 
*/
public class MontyHallSimulation
{	
	
	/**
	* main method
	* @param args This is a command line argument
	*/
	public static void main(String[] args)
	{
		int numSwitchWins = 0;
		//System.out.println(args[0]);
		// args[0] is the first argument to main
		int numSimulations = Integer.parseInt(args[0]);
		//System.out.println(numSimulations);
		
		for(int i = 0; i < numSimulations; i++)
			numSwitchWins += game();
		
		double percentSwitchWin = (double) numSwitchWins/numSimulations * 100;
		
		percentSwitchWin = format(percentSwitchWin);
		
		//printing the results
		System.out.println("Switch win: " + (double) numSwitchWins/numSimulations*100 + "%" );
		System.out.println("Stay win: " + (100 - percentSwitchWin) + "%" );
	}
	
	/**
	* this method takes in the result( most likely decimal ) and formats it
	* @param double result
	*/
	public static double format(double d)
	{
		int x = (int) (d * 100);
		return (double) x/ 100;
	}
	
	/**
	* 
	* @param none
	* < generates the user choice of doors and which car the door is in using Math.random ...>
	* @return int return 1 if switch win and 0 if staying wins
	*/
	public static int game()
	{
		int car = (int) (Math.random() * 3 + 1);
		int userPick = (int) (Math.random() * 3 + 1);
		
		if ( car == userPick )
			return 0;
		else
			return 1;
	}
	
	
	
}