/*
 * The objective of this program is to determine the eligibility to become a part of the US Senate or the US House of Representatives.
 * The variables that were declared are age and citizenYear.
 * The user is prompted to enter in their age and the number of year they had a US citizenship. Those numbers are then used to determine their eligibility. 
 * At the end of the program, the eligibility of the user is printed out and then the user is again prompted to enter their age and number of years they had their citizenship.
 * The program is then looped until the user is finished and decides to enter 0 for the age.
 */
package practice;

import java.util.Scanner;

public class CongressStarter 
{
	public static void main(String[] args)
	{
		//declare variables
		int age;
		int citizenYear;
		Scanner inputAge = new Scanner(System.in); 
		Scanner inputCitizenYear = new Scanner(System.in); 

		//initialize variables
		System.out.println("I will determine if you are eligible to run for either the US Senate and/or the US House of Representatives.");
		System.out.println("Please enter your age in years: ");
		age = inputAge.nextInt();
				
		System.out.println("Please enter the amount of years you have been a citizen: ");
		citizenYear = inputCitizenYear.nextInt();
		
		while(age>0)
		{
			if(age >= 30 && citizenYear >= 9)
			{
				System.out.print("You are eligible to run for the US Senate");
			}
			else
			{
				System.out.print("You are not eligible to run for the US Senate");
			}
				
			if((age >= 30 && citizenYear >= 9) && (age >= 25 && citizenYear >= 7)||(age < 25 || citizenYear < 7))
			{
				System.out.print(" and ");
			}
			else
			{
				System.out.print(" but ");
			}
		
			if(age >= 25 && citizenYear >= 7)
			{
				System.out.println("you are eligible to run for the US House of Representatives.");
			}
			else
			{
				System.out.println("you are not eligible to run for the US House of Representatives.");
			}
			System.out.println("If you are done with the program, please enter a 0 when you are prompted to enter the age.");
			System.out.println("Please enter your age in years: ");
			age = inputAge.nextInt();
					
			System.out.println("Please enter the amount of years you have been a citizen: ");
			citizenYear = inputCitizenYear.nextInt();
		}
		inputAge.close();
		inputCitizenYear.close();
	}
}
	

