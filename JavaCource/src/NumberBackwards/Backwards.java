package NumberBackwards;
public class Backwards
{
    static int Digit, tmpNum;
    private static int inputNum = -1;
    private static String doubleNum = "-1";
    private static int numLength;

    public static void setInputNum(String input)
    {
        try
        {
            if (input.contains("."))             /* handling decimal number */
                Backwards.doubleNum = input;
            else   /* handling int number*/
            {
                Backwards.inputNum = Integer.parseInt(input);
                tmpNum = Backwards.inputNum;
            }
            SetBackwardsAndPrint();
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid Input. you should enter number between 0-32767 program will now terminate");
            System.exit(1);
        }
    }

    public static void SetBackwardsAndPrint()
    {
        if (inputNum > 0)   //integer valid - can continue
        {
            numLength = Integer.toString(inputNum).length();
            int[] Backwardnumber = new int[numLength];
            numLength = 0;
            while (tmpNum > 0)
            {
                Digit = tmpNum % 10; // take the most right digit from the input
                Backwardnumber[numLength] = Digit;//insert the digit from step 1 to arr[numlength]  numlength=0
                numLength++;
                tmpNum = tmpNum / 10;//tmpnum is the original number without the last digit
            }
            System.out.println("the Backward number is: ");
            for (int i = 0; i < Backwardnumber.length; i++)
                System.out.print(Backwardnumber[i]);
        }
        else        /*input is decimal*/
        {
            numLength = doubleNum.length();  //numLength=number of Digit in the decimal number
            char[] Backwardnumber = new char[numLength]; //array to store the number in reverse order
            int dot = doubleNum.indexOf('.');  //dot=the position of the dot in the decimal number
            int i = 0;
            int j = dot + 1;
            for (j = dot + 1; (i < dot) && (j < numLength); i++, j++)    //insert right part of the decimal (after the decimal "." to the left side of the array
                Backwardnumber[i] = doubleNum.charAt(j);
            Backwardnumber[i] = doubleNum.charAt(dot); //insert the dot
            i++;
            j = 0;
            for (; i < Backwardnumber.length && j < dot; i++, j++) //insert left part of the decimal (before the decimal "." to the right side of the array
                Backwardnumber[i] = doubleNum.charAt(j);
            System.out.println("the Backward number is: ");
            for (i = 0; i < Backwardnumber.length; i++)
                System.out.print(Backwardnumber[i]);
        }
    }
}

	


