package Statements;

public class Ex7 {

	public static void main(String[] args) 
	{
		//initialize array of strings
		String sentence[]= {"L","o","r","e","m"," ","I","p","s","u","m"};
		int PhraseLength=sentence.length-1;   //store array length
	
		//loop from the ent of the array to the beggining, printing each character
		do
		{
			System.out.print(sentence[PhraseLength]);
			PhraseLength-=1;
		}
		while (PhraseLength!=-1);

	System.exit(0);
	}

	
}
