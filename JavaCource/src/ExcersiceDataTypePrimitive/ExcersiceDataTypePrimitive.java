package ExcersiceDataTypePrimitive;

public class ExcersiceDataTypePrimitive
{
	
	public static void main(String[] args) 
	{
		
		//variables declaration
		int age=34;
		char FirstNameLetter='S';
		double SatScore=88.5;
		boolean Gender=false; 	//true=female false=male
		
		System.out.println("My Age is" +" " + age);
		System.out.println("First letter in my name is" +" " + FirstNameLetter);
		System.out.println("My SAT score is" +" " + SatScore);
		if (Gender==false)  //print the right string according to Gender
			System.out.println("My Gender is male");
		else
			System.out.println("My Gender is female");
	
		System.out.println("now casting double into int and display SAT score...");
		System.out.println("My SAT score after cast is" +" " + (int)SatScore);
	}
}
