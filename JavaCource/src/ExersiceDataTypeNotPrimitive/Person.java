package ExersiceDataTypeNotPrimitive;

public class Person 
{
	String FirstName;
	String FamilyName;
	Double Age;
	
	
	public String ConvertAgeToString()
	{
		return Double.toString(Age);
	}
	
	public String ConcateNames()
	{
		return FirstName.concat(FamilyName);
	}
}
