package OoPEx1;

public class mobileDevice 
{
	String model;
	char OS;
	int OSVersion;
	boolean hasFlash;
	double price;
	private int screenWidth;
	private int screenHeight;

	mobileDevice(int width, int height)
	{
		if (width<0 || width>10 || height<0 || height>20)
		{
			System.out.println("Width And/Or Height not in range");
			System.exit(0);
		}
		else
		{
			this.screenWidth=width;
			this.screenHeight=height;
		}
	}
	public int getScreenWidth() {
		return screenWidth;
	}

	public int getScreenHeight() {
		return screenHeight;
	}



//	public void SetArea(int w, int h)
//	{
//		if (w<0 || w>10 || h<0 || h>20)
//		{
//			System.out.println("Width And/Or Height not in range");
//			System.exit(0);
//		}
//		else
//		{
//			screenWidth=w;
//			screenHeight=h;
//		}
//	}
	
	public void printParameters()
	{
		System.out.println("Phone Model is: "+ model);
		System.out.println("Phone OS is: "+ OS);
		System.out.println("OS Version is: "+ OSVersion);
		System.out.println("does phone has flash? : "+ hasFlash);
		System.out.println("phone price is: "+ price);
	}
	
	//this function calculate the screen Area
	public int calculateArea(int Width, int Height)
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
