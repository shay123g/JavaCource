package NumberBackwards;

import java.util.Scanner;

public class Runner 
{
	static Scanner Stream=new Scanner(System.in);
	static String InputFromUser;
	public static void main(String[] args) 
	{
			
		System.out.print("enter positive number: ");	
		InputFromUser=Stream.nextLine();		
		Backwards.setInputNum(InputFromUser);
	}
}


