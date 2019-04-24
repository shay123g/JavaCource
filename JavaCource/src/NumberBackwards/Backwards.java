package NumberBackwards;

public class Backwards
{
	private static int inputNum=-1;
	private static String doubleNum=new String("-1");
	private static int numLength;
	static int Digit,tmpNum;

	public static int getInputNum()
	{
		return inputNum;
	}

	public static void setInputNum(String input)
	{
		try 
		{
			if (input.contains(".")==true)
				Backwards.doubleNum=input;
			else
			{
				Backwards.inputNum =Integer.parseInt(input);
				tmpNum=Backwards.inputNum;
			}
			SetBackwardsAndPrint();
		}
		catch (NumberFormatException e)
		{
			System.out.println("Invalid Input. you should enter number between 0-32767 program will now terminate");
			System.exit(1);
		}
	}
	public static void SetBackwardsAndPrint()
	{
		if (inputNum>0)   //integer valid - can continue 
		{
			numLength=Integer.toString(inputNum).length();
			int[] Backwardnumber=new int[numLength];
			numLength=0;
		while (tmpNum>0)
		{
			Digit=tmpNum%10;
			Backwardnumber[numLength]=Digit;
			numLength++;
			tmpNum=tmpNum/10;
		}
		System.out.println("the Backward number is: ");
		for (int i=0;i<Backwardnumber.length;i++)
		{
			System.out.print(Backwardnumber[i]);
		}
		}
		else
			{
			
			
			if((doubleNum.contentEquals("-1")||doubleNum.contains("-"))) //double not valid - stops
			}
				{
						System.out.println("you entered negative number - program will now terminate");
						System.exit(1);
				}
				else
				{}
	
		else
		{
			System.out.println("you entered negative number - program will now terminate");
			System.exit(1);
		}
					
		if (inputNum!=-1)
		{
			numLength=Integer.toString(inputNum).length();
			int[] Backwardnumber=new int[numLength];
			numLength=0;
		while (tmpNum>0)
		{
			Digit=tmpNum%10;
			Backwardnumber[numLength]=Digit;
			numLength++;
			tmpNum=tmpNum/10;
		}
		System.out.println("the Backward number is: ");
		for (int i=0;i<Backwardnumber.length;i++)
		{
			System.out.print(Backwardnumber[i]);
		}	
		}
		else 
		{
			{
				numLength=doubleNum.length()-1;
				char[] Backwardnumber=new char[numLength+1];
				int i=0;
				while (numLength>=0)
				{
				  	Backwardnumber[i]=doubleNum.charAt(numLength);
				  	i++;
				  	numLength--;
				}
				System.out.println("the Backward number is: ");
				for (int j=0;j<Backwardnumber.length;j++)
					System.out.print(Backwardnumber[j]);	
			}
		}
		
			
		}
	}
	


