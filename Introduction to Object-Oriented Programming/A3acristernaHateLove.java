/*P This program will change the word "hate" to "love" from a user keyboard input. 
 * The variable declared to be initialized is userSentence. 
 *I The user is prompted to input a sentence containing the word hate. 
 *P Using the users inputed data, the variable userSentence will replace any "hate" with "love".
 *O The resulting sentence is printed out showing the replacement of the word "hate" with "love".
 */
import java.util.Scanner;
	
public class A3acristernaHateLove {
	
	public static void main (String[] args) {
		
		//Declare variables
		String userSentence; 
		
		//Import Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user
		System.out.println("Enter a sentence that includes the word \"hate\":");
		userSentence = keyboard.nextLine();
		
		//Tells user what program will do and does it.
		System.out.println("There is too much hate in this world. I have changed that sentence for you to replace the word \"hate\" with \"love\", like so:");
		userSentence = userSentence.replace("hate", "love");
		
		//Prints new changed sentence in quotes
		System.out.println("\"" + userSentence + "\"");
		
		//Close keyboard
		keyboard.close();
		
		}
}
