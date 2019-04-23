/*Holy digits Batman! The Riddler is planning his next caper
*somewhere on Pennsylvania Avenue. In his usual sporting fashion,
* he has left the address in the form of a puzzle. The address on
* Pennsylvania is a four-digit number where:
*     All four digits are different
*     The digit in the thousands place is three times the digit in the tens place
*     The number is odd
*     The sum of the digits is 27
* Write a program that uses a loop (or loops) to find the address where the
* Riddler plans to strike.package practice;
*/
public class A5acristernaHolyNumbers {
	public static void main (String[] args) {

	//Declare variables. We know we will need 4 different integers.
    int thousandsPlace;
    int hundredsPlace;
    int tensPlace;
    int onesPlace;

    //We know that each integer will be need to be between 0 and 9. We will run a loop for each number.
    for (thousandsPlace = 0; thousandsPlace <=9; thousandsPlace++)
    {
        for (hundredsPlace = 0; hundredsPlace <=9; hundredsPlace++)
        {
            for (tensPlace = 0; tensPlace <=9; tensPlace++)
            {
                for (onesPlace = 0; onesPlace <=9; onesPlace++)
                {
                    
                	//Now we must run through the requirements based on the Jokers qualifications
                   
                	//The sum of the digits is 27
                	if(thousandsPlace + hundredsPlace + tensPlace + onesPlace == 27)
                	{ 
                		//The number is odd
                        if (onesPlace % 2 != 0)
                        	
                        	//All four digits are different
                            if((thousandsPlace != hundredsPlace) && (hundredsPlace != tensPlace) && 
                            		(tensPlace != onesPlace ) && (hundredsPlace != onesPlace) &&
                            		(thousandsPlace != onesPlace))
                            
                            {
                            	//The digit in the thousands place is three times the digit in the tens place.
                                if (thousandsPlace == (3*tensPlace))
                                
                                {
                                    System.out.println("The address is " + thousandsPlace + hundredsPlace + 
                                    		tensPlace + onesPlace + " Pennsylvania Avenue." );
                                }
                            }
                    }
                }
            }

        }
        
     }
	
  } 

}
