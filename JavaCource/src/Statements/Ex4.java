package Statements;

import java.util.Scanner;

public class Ex4 
{

	public static void main(String[] args)
	{
		System.out.print("please enter occupation: ");
		Scanner InputStream=new Scanner(System.in);  //new inputStream to store the user input
		String Occupation=InputStream.nextLine();  //read user input
		int salary=0;  //to store the salary according to occupation
		InputStream.close();   //close the input stream
		switch (Occupation)
		{
		case ("Teacher"):
			salary=5000;
			System.out.println("Average salary for Teacher is "+salary+" NIS");
			break;
		case ("QA"):
			salary=15000;
			System.out.println("Average salary for QA is "+salary+" NIS");
			break;
		case ("Bank Teller"):
			salary=9000;
			System.out.println("Average salary for Bank Teller is "+salary+" NIS");
			break;
		default: 
			salary=9100;
			System.out.println("Average Salary is "+salary+" NIS");
		}
		System.exit(0);
	}

}
