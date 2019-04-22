package Statements;

public class Ex6 {

	public static void main(String[] args) 
	{
		//initialize array
		int numbers[]= {1,5,8,3,24,74,9,31,36,7,10};
		for (int element:numbers)   //if number is even print it
			if (element%2==0)
				System.out.println(element);
			
		System.exit(0);
	}

}
