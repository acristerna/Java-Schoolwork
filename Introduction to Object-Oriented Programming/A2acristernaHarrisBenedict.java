/*The purpose of this program is to calculate the number of 230 calorie chocolate bars a person can consume to maintain their body weight (BMR). 
 *I will be prompting user to enter age, weight, and height to use in given formula for male and female users. 
 */
import java.util.Scanner;
public class A2acristernaHarrisBenedict {
	public static void main (String[] args) {
		
		//BMR = 655 + (4.3 x weight in pounds) + (4.7 x height in inches) - (4.7 x age in years) for a woman to maintain weight. 
		//BMR = 66 + (6.3 x weight in pounds) + (12.9 x height in inches) - (6.8 x age in years) for a man to maintain weight. 		
				
		int age;
		int weight;
		int height;
		double caloriesMale;
		double caloriesFemale;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user for age, weight, and height. 
		System.out.println("Hello! This program will tell you the number of chocolate bars with 230 calories that should be consumed to maintain your weight.");
		System.out.println("What is your age in years? ");
		age = keyboard.nextInt();
		
		System.out.println("What is your weight in pounds? ");
		weight = keyboard.nextInt();
		
		System.out.println("What is your height in inches? ");
		height = keyboard.nextInt();
		
		//Apply measurements to formulas.
		caloriesFemale = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		caloriesMale = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		
		//Print results
		System.out.println("A female with those measurements should eat " + (caloriesFemale / 230) + " candy bars per day to maintain her weight.");
		System.out.println("A male with those measurements should eat " + (caloriesMale / 230) + " candy bars per day to maintain his weight.");
		
		keyboard.close();	
		
	}
}