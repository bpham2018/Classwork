/**
 * This is a chatbot that talks back to you
 * until you type in bye or Bye
 * @author Ms. Thuzar
 * @version 1.0
 */
import java.util.Scanner;

public class ChatBotMsThuzar
{
	/** 
	 * This is the main method <br>
	 * Takes input of user's name and returns string with user's name inside
	 * @param args This is a command line argument
	 */
	public static void main(String[] args)
	{
		//creating a Scanner object to get the input from
		// the keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = keyboard.nextLine();
		System.out.println("Hi " + name + "!");
		
		String input = "";
		
		while (!input.equals("bye") && !input.equals("Bye")){
		
			System.out.println("So, what do you want to talk about?");
			input = keyboard.nextLine();
			if (!input.equals("bye") && !input.equals("Bye")){
			
				System.out.println("I like " + input + "!");
			}
			
		}	
			
		System.out.println("Bye!");
			
			//int age = keyboard.nextInt();
			// get rid of the new line char from the Scanner object
			//keyboard.nextLine()
			
	}
	
}	