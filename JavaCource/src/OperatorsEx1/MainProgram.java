package OperatorsEx1;

import java.util.Scanner;

public class MainProgram 
{

	public static void main(String[] args) 
	{
		Scanner ReadFromUser=new Scanner(System.in);  //new variable to read input from user (reads to stream)
		System.out.println("please enter a whole number: ");
		Integer k=-1,Number=ReadFromUser.nextInt();   //read the user chosen number
		ReadFromUser.close(); //close the stream
		//if "Number" is even, result= first string, else "result"= second string
		String result=(Number%2)==0 ? "Number is Even. its value is: "+Number.toString(): "number is odd. system prints "+k.toString();
		System.out.print(result);
	}
	

}

//Answer for Exercise 2 is 4
