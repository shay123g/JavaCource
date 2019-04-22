package Statements;

import java.util.Scanner;

public class Ex3 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int Age=-1;
		System.out.print("enter number between 0 to 120: ");
		Age=input.nextInt();
		if (Age>=0&&Age<=5)
			System.out.println("Go to Kindergarten");
		else if (Age>=6&&Age<=18)
			System.out.println("Go to School");
		else if (Age>=19&&Age<=66)
			System.out.println("Go to Work");
		else if (Age>=67)
			System.out.println("Collecting Pesion");
		input.close();
		System.exit(0);
		
			

	}

}
