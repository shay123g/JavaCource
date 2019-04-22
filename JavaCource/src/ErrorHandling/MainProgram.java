package ErrorHandling;

public class MainProgram {

	public static void main(String[] args) 
	{
		Integer Arr[]= {1,2};
		try 
		{
			System.out.println(Arr[5]);
		}
		catch (IndexOutOfBoundsException ex)
		{
			System.out.println("User tried to print non-exist index of the array");
		}
		finally
		{
			System.exit(0);
		}
	}

}
