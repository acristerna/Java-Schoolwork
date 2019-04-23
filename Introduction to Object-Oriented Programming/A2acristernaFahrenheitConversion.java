//The objective of this program is to convert degrees from Fahrenheit to Celsius using a given formula.
import java.util.Scanner;

public class A2acristernaFahrenheitConversion {
	public static void main(String[] args) {
		
		//Formula is DegreesC = 5 (DegreesF - 32) / 9
		double degreesC, degreesF;
					
		//Prompt user
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a temperature in whole degrees Fahrenheit: ");
		degreesF = keyboard.nextInt();
						
		//Apply equation and round to two decimals	
		degreesC =  5 * (degreesF - 32) / 9;
		degreesC = Math.round(degreesC * 100);
		degreesC = degreesC / 100;
					
		//Print conversion 
		System.out.println((int) degreesF + " degrees Fahrenheit is " + degreesC + " degrees Celsius");
							
		keyboard.close();
					
	}	
}
