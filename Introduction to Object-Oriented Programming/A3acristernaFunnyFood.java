/* P This program will ask the user to input string variables, favColor, favFood, favAnimal, and firstName. These variables will be used with a string variable dream, sort of like MadLibs!
 * I Using the users keyboard input, the program will initialize all declared variables except dream. 
 * P Then the program will uses all the declared variables in a sentence which is held in the string variable dream.
 * O Finally, the program will print the string dream with added inputed variable to create a silly sentence regarding food. 
 */
import java.util.Scanner;

public class A3acristernaFunnyFood {
	
	public static void main(String[] args) {
		
		//Declare variables
		String favColor, favFood, favAnimal, firstName, dream; 
		
		//Import scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user to play game and answer prompts
		System.out.println("Hello, we are going to play a silly word game. To start, I will ask you some questions.");
		System.out.println("What is your favorite color?");
		favColor = keyboard.nextLine();
		
		System.out.println("What is your favorite food?");
		favFood = keyboard.nextLine();
		
		System.out.println("Now, what is your favorite animal?");
		favAnimal = keyboard.nextLine();
		System.out.println("Last one, what is the first name of one of your friends or family members?");
		firstName = keyboard.nextLine();
		
		//Tell user the purpose of prompts and what program will do
		System.out.println("Great! I'm now going to use your answers to come up with a silly sentence, sort of like Mad Libs! See below:");
	
		//Add variables to silly sentence
		dream = "I had a dream that " + firstName + " ate a " + favColor + " " + favAnimal +
		     " and said it tasted like " + favFood + "!";
		
		//Print new silly sentence
		System.out.println(dream);
		
		keyboard.close();

	

	}
}
