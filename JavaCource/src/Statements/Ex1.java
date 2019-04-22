package Statements;

public class Ex1
{

	public static void main(String[] args) 
	{
		String[] countries= {"Spain","India","China","Israel","US","Africa","Nepal"};
		for (String nameInPosion:countries)   //prints all elements in the array
			System.out.println(nameInPosion);
		for (int i=0;i<countries.length-1;i++)  //find "Israel" and print it and the location in the array
		{
			if (countries[i].equalsIgnoreCase("israel"))
			{
				switch (i)
				{
				case 1:
				{
					System.out.println("Israel is located at the 1st place in the array");
					break;
				}
				case 2:
				{
					System.out.println("Israel is located at the 2nd place in the array");
					break;
				}
				case 3:
				{
					System.out.println("Israel is located at the 3th place in the array");
					break;
				}
				case 4:
				{
					System.out.println("Israel is located at the 4th place in the array");
					break;
				}	
				case 5:
				{
					System.out.println("Israel is located at the 5th place in the array");
					break;
				}
				case 6:
				{
					System.out.println("Israel is located at the 6th place in the array");
					break;
				}
				case 7:
				{
					System.out.println("Israel is located at the 7th place in the array");
					break;
				}
				case 8:
				{
					System.out.println("Israel is located at the 8th place in the array");	
					break;
				}
				}
			}
		};
		if (countries[2].equalsIgnoreCase("china")==true)  //check if the third country is China
			System.out.println("Yes, it is there");
		else System.out.println("No, sorry");
		System.out.println("number of characters in countries[0] is: "+countries[0].length());  //prints the number of characters of the first country Spain
		System.exit(0);
	}

}
