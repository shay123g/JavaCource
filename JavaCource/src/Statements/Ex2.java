package Statements;


public class Ex2 {

	public static void main(String[] args) 
	{
		int[] numbers= {15,76,23,63,28,11,-5,663,987,1001};
		int sum=0,bigger=-1;      //initialize variables
		if (numbers[0]>numbers[1])  // check if first number bigger than second one
			System.out.println("First one is bigger");
		System.out.println("Second one is bigger");
		
		for (int i=0;i<10;i++)
		{
			sum+=numbers[i];   //summing the array elements
			bigger=numbers[i]>bigger?numbers[i]:bigger;	   //store the highest number in the array
		}
		
		System.out.println("array sum is: "+sum);
		System.out.println("the high number in the array is: "+bigger);
		System.exit(0);
		

	}

}
