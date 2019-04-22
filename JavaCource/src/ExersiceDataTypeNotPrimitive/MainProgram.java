package ExersiceDataTypeNotPrimitive;

public class MainProgram {

	public static void main(String[] args) 
	{
		Person Me=new Person();
		Me.FirstName="Shay";
		Me.FamilyName="Gazit";
		Me.Age=34.5;
		
		String[] Phrase= {"Java","is","a","general","purpose","computer","programming","language"};
		String[][] General2DArr=new String[2][3];
		String StringAge=Me.ConvertAgeToString();
		String ConcateNames=Me.ConcateNames();
		General2DArr[0][0]="Moshe";
		General2DArr[0][1]="22";
		General2DArr[0][2]="Jerusalem";
		General2DArr[1][0]="Joseph";
		General2DArr[1][1]="45";
		General2DArr[1][2]="London";
	
		
		
		System.out.println("Age as string: "+ StringAge);
		System.out.println("My Concated name in Uppercase: "+ConcateNames.toUpperCase());
		System.out.println("Number of characters in the variable is: "+ConcateNames.length());
		System.out.println(ConcateNames.equals(StringAge));
		
		System.out.println(Phrase[Phrase.length-3]);
		System.out.println(Phrase[Phrase.length-2]);
		System.out.println(Phrase[Phrase.length-1]);
		System.out.println(General2DArr[0][2]);
		
	
		
	}

}
