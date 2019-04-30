package OoPEx1;

public class mainProgram 
{

	public static void main(String[] args)
	{
		//create object
		mobileDevice phone1=new mobileDevice(10,10);
		//initializing 
		phone1.hasFlash=false;
		phone1.model="PocoPhone F1";
		phone1.OS='A';
		phone1.OSVersion=8;
		phone1.price=815.23;;
		
		//print all the params
		phone1.printParameters();
		
		//print the screen area
		System.out.println("Phone Area is "+ phone1.calculateArea (phone1.getScreenWidth(), phone1.getScreenHeight()));
	
		//check for flash and print accordingly
		phone1.pictureQuality();
	}

}
