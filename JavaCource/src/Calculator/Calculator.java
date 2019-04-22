package Calculator;
public class Calculator 
{
	static Integer first=new Integer(-1);    //this variable will be parsed into integer later on
	static Integer second=new Integer(-1);   //this variable will be parsed into integer later on
	public void CalculateAndPrint(String arr[])
	// This method gets array of strings, convert into integer and do arithmetic calculations
	{
		try  
		{
			first=Integer.parseInt(arr[0]);   //take the first element in the array, and convert to integer
			second=Integer.parseInt(arr[2]);  // take the third element in the array, and convert to integer
		}
		catch (NumberFormatException e)    //in case first or third element not integers, print error message
		{
			System.out.println("first input and third input must be whole numbers. Program will now terminate");
			System.exit(1);
		}
				
		switch (arr[1])  //check arithmetic operator type and perform the calculation accordingly
		{
			case "+":
			{
				System.out.println(arr[0]+"+"+arr[2]+"="+(first+second));
				break;
			}
			case "-":
			{
				System.out.println(arr[0]+"-"+arr[2]+"="+(first-second));
				break;
			}
			case "*":
			{
				System.out.println(arr[0]+"*"+arr[2]+"="+(first*second));
				break;
			}
			case "/":
			{
				int whole=first/second;
				double fraction=first%second;
				double result,resedue=fraction/second;
				result=whole+resedue;
				System.out.println(arr[0]+"/"+arr[2]+"="+result);
				break;
			}
			default:
			{
				System.out.println("operator from user is not valid. program will now terminate");
				System.exit(1);
			}
			
		}
	}
}
