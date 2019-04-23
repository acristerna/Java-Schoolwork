package practice;

import java.util.Scanner;

public class Date {
	  public static void main(String[] args) {
		  
		  int month;
		  int day; 
		  int year;
		  String date;
		  
		  Scanner keyboard = new Scanner(System.in);

	        System.out.println("Please enter a date containing the format mm/dd/yyyy: ");
	        date = keyboard.nextLine();

	        month = Integer.parseInt(date.substring(0,2));
	        day = Integer.parseInt(date.substring(3,5));
	        year = Integer.parseInt(date.substring(6,10));
	       
	                
	        if ((month == 2 && (year % 4 == 0 && year % 100 != 0)) && (day == 29))
	        {
	        	System.out.println(date + " is a valid date! It is a leap year.");
	        }
	        else if ((month == 2 && (day >= 1 && day <= 28 )))
	        {
	        	System.out.println(date + " is a valid date!");
	        }
	        else if ((month == 1 || month == 3 || month == 5 || month == 7 || 
	        		month == 8 || month == 10 || month == 12 && (day != 00 && day >= 1 && day <= 31 )))
	        {
	        	System.out.println(date + " is a valid date!");
	        }
	        else if ((month == 4 || month == 6 || month == 9 || month == 11	&& (day >= 1 && day <= 30)))
	        {
	        	System.out.println(date + " is a valid date!");
	        }
	        else if ((month == 0 || month > 12))
	        {
	        	System.out.println(date + " is not a valid date because that is not a valid month!");
	        }
	        else if ((day == 0 || day > 31))
	        {
	        	System.out.println(date + " is not a valid date because that is not a valid day!");
	        }
	        else
	        {
	        	System.out.println(date + " is not a valid date!");
	        }
	        
	        keyboard.close();
	    }
}


