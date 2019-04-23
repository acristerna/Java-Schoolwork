/* P This program will compound interest annually, monthly, and daily. Double variables to be declared by user;  initialBalance and interest.
 * 		Other variables used are Double newBalance, for new variable of balance after loop is complete, char answer, for continuing the loop, 
 * 		and int i for loop iterations.
 * I Using the users keyboard input, the program will initialize declared variables to be used in 3 different for loops.
 * P Using a for loop, variables will be compounded annually, monthly, and daily according to compound interest formula.
 * O  Once complete, the program will print rounded sum of the compounded amounts and prompt user to select if they would like to continue 
 * 		and try new variables. If they select yes, program will run again. Otherwise, it will not. 
 */
import java.util.Scanner;

public class A5acristernaInterest {

	public static void main (String[] args) {
		
		double initialBalance;
		double interest; 
		double newBalance; //after 10 years
		char answer;
		int i; //for loop
	
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello, this program will tell you your compounded interest annually, monthly, and daily for ten years.");
		System.out.println("");
		
	do //Will run once and then continue to run again if user input is "y" for yes after loop is complete
	{ 
		//Prompt user for initial balance in dollars.cents format and interest rate as a percentage
		System.out.println("Please enter your initial balance in a dollars.cents format:");
		initialBalance = keyboard.nextDouble();
		
		System.out.println("Please enter your interest rate as a percentage. For example, 5.5% would be 5.5: ");
		interest = keyboard.nextDouble();
		
		System.out.println("In ten years your initial balance of " + initialBalance + " at an interest rate of " 
				+ interest + "%, will be worth:");

		//compounded amount yearly
		newBalance = initialBalance; 
		for (i = 1; i <= 10; i++)
		{
			newBalance = newBalance + (newBalance * (interest/100));
		}
			newBalance = Math.round(newBalance * 100) / 100.0;
			System.out.println((newBalance) + " compounded annually");
		
		
		//compounded amount monthly
        newBalance = initialBalance;
        for (i = 1; i <= 120; i++)
        {
            newBalance = newBalance + (newBalance/100 * (interest/12));   			
        }
        	newBalance = Math.round(newBalance * 100) / 100.0;
        	System.out.println( newBalance + " compounded monthly");  
        
        //compounded amount daily
        newBalance = initialBalance;
        for (i=1; i <= 3650; i++)
        {
        	newBalance = newBalance + (newBalance/100 * (interest/365));
        }
        	newBalance = Math.round(newBalance * 100) / 100.0;
        	System.out.println(newBalance + " compounded daily");
        
        //Prompt user to select if they want to try different values. 
		System.out.println();
        System.out.println("Do you want check a different balance and interest rate?");
        System.out.println("Enter y for yes or n for no.");
        answer = keyboard.next().charAt(0);
    }
	
    //If  user selects yes, loop repeats. If no, it does not.
	while ((answer == 'y') || (answer == 'Y'));
	
	keyboard.close();
	
	}
	
}