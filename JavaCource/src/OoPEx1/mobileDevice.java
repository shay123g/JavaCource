package OoPEx1;

public class mobileDevice 
{
	String model;
	char OS;
	int OSVersion;
	boolean hasFlash;
	double price;
	int screenWidth;
	int screenHeight;

	public void printParameters()
	{
		System.out.println("Phone Model is: "+ model);
		System.out.println("Phone OS is: "+ OS);
		System.out.println("OS Version is: "+ OSVersion);
		System.out.println("does phone has flash? : "+ hasFlash);
		System.out.println("phone price is: "+ price);
	}
	
	//this function calculate the screen Area
	int calculateArea(int Width, int Height)
	{
		return Width*Height;
	}

	//the following function checking if the phone has flash or not. 
	//in case flash present the function print "good quality" otherwise print "bad quality"
	public void pictureQuality()
	{
		if (this.hasFlash==true)
			System.out.println("Good Quality");
		else
			System.out.println("Bad Quality");
	}

}
