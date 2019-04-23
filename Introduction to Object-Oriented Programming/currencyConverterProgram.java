/*
 * Prepare: The objective of this program is to allow the user to enter an amount in USD and covert it to either euros, yen, pesos, kronas, or francs, with a
 * 			continuous loop so the user can keep converting new amounts to different currencies.
 * Input: Import scanner for user input. Declare variables. There will be two scanners, one called amount and one called convert. There will be six variables of type double; 
 * 			usd, euro, yen,peso, krona, and franc. Finally, there will be two variables of type String; conversion and again.
 * Process: Start do-while loop and prompt user to input an amount in USD then what the user would like to convert it to. Nested if-else statements for each conversion to
 * 			euro, yen, peso, krona, or franc.
 * Output: Print conversion for user in selected currency. Prompt user to see if they would like to convert another amount to a different currency. While part of do-while loop; 
 * 			if user types y then loop will start over from Process, if the user types n the program will terminate.
 */

import java.util.Scanner;
public class currencyConverterProgram
{
	public static void main(String[] args)
	{
		//declare variables
		Scanner amount;
		Scanner convert;
		double usd;
		double euro;
		double yen;
		double peso;
		double krona;
		double franc;
		String conversion;
		String again;
		
		amount = new Scanner(System.in);
		convert = new Scanner(System.in);
		
		//start of do-while loop
		do
		{
			//prompt user to enter an amount
			System.out.println("Please enter an amount in USD you wish to convert in dollars.cents:");
			usd = amount.nextDouble();
			
			//prompt user to enter what currency they would like to convert to
			System.out.println("What would you like to convert it to?");
			System.out.println("Please enter either 'Euro', 'Yen', 'Peso', 'Krona', or 'Franc'");
			conversion = convert.nextLine();
			
			//if statement for the conversion to euros
			if(conversion.equalsIgnoreCase("euro"))
			{
				euro = usd * 0.8675;
				euro = Math.round(euro * 100.0) / 100.0;
				System.out.println("$" + usd + " is " + euro + " Euros.");
			}
		
			//else if statement for the conversion to yen
			else if(conversion.equalsIgnoreCase("yen"))
			{
				yen = usd * 113.79;
				yen = Math.round(yen * 100.0) / 100.0;
				System.out.println("$" + usd + " is " + yen + " Japanese Yen.");
			}
			
			//else if statement for the conversion to pesos
			else if(conversion.equalsIgnoreCase("peso"))
			{
				peso = usd * 18.82;
				peso = Math.round(peso * 100.0) / 100.0;
				System.out.println("$" + usd + " is " + peso + " Mexican Pesos.");
			}
			
			//else if statement for the conversion to kronas
			else if(conversion.equalsIgnoreCase("krona"))
			{
				krona = usd * 9.06;
				krona = Math.round(krona * 100.0) / 100.0;
				System.out.println("$" + usd + " is " + krona + " Swedish Kronas.");
			}
			
			//else if statement for the conversion to francs
			else if(conversion.equalsIgnoreCase("franc"))
			{
				franc = usd * 0.99;
				franc = Math.round(franc * 100.0) / 100.0;
				System.out.println("$" + usd + " is " + franc + " Swiss Francs.");
			}
			
			//prompt user to start the program over again or not
			System.out.println("Would you like to convert a new amount to a different currency?\nPlease type either 'y' or 'n'");
			again = convert.nextLine();
		}
		//end of do-while loop
		while(again.equalsIgnoreCase("y"));
		
		amount.close();
		convert.close();
	}
}
