package Statements;

public class Ex5 {

	public static void main(String[] args)
	{
		//create 2D array and initialize
		String[][] General2DArr=new String[2][3];
		General2DArr[0][0]="Moshe";
		General2DArr[0][1]="22";
		General2DArr[0][2]="Jerusalem";
		General2DArr[1][0]="Joseph";
		General2DArr[1][1]="45";
		General2DArr[1][2]="London";
		
		//print all array values
		for (int i=0;i<2;i++)
			for (int j=0;j<3;j++)
				System.out.println(General2DArr[i][j]);
	System.exit(0);
	}

}
