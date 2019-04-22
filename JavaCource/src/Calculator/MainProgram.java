//this program is a simple calculator supporting four basic arithmetic operations: +,-,*,/
//it uses the Calculator class for arithmetic calculations

package Calculator;

import java.util.Scanner;

public class MainProgram 
{
	static String fromUser[]=new String[3];     //Array of strings to hold user input
	static Scanner input=new Scanner(System.in);  // create new inputstream 
	public static void main(String[] args) 
	{
		Calculator Calc=new Calculator(); // creates new Calculator object
		System.out.println("enter input in following format:<FirstNumber><AritmethicOperator><SecondNumber>");
			fromUser[0]=input.nextLine();  //read the user input into the array in the [i] position   i=0,1,2
			fromUser[1]=input.nextLine();
			fromUser[2]=input.nextLine();
			input.close();  //close the stream
		Calc.CalculateAndPrint(fromUser);  //send the values to the function
		System.exit(0);
	}
	

}
