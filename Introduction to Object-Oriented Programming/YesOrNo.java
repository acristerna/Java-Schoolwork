import java.util.Scanner;

public class YesOrNo {
	
	public static void main (String[] args) {
		
		String answer; 
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter Yes or No: ");
		answer = keyboard.nextLine();
		
		// while the answer is not one of the correct words
		while ( !(answer.equals("Yes") || answer.equals("No")) ) {
			
				System.out.print("Please try again, Yes or No: ");
				answer = keyboard.nextLine();
		}
		System.out.println("Thanks!");
		
	
	}
}
