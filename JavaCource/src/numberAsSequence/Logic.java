package numberAsSequence;

public class Logic 
{
	static String[] OneDigit= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	static String[] TentoNinteen= {"","Eleven","Tweleve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	static String[] Asarot= {"","","Twenty","thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	static String NumberAsWord=null;
	static int numLength=0;
	
	public static void ConvertNumber(Integer num)
	{
		String NumberAsString=num.toString();
		numLength=num.toString().length();
		if (numLength>=4)
		{
			System.out.println("supported range of numbers 1-999");
			System.exit(0);
		}
		else
			if (numLength==3)
			{
			
			}
		
	}
}
