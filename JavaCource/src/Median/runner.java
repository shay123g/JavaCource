package Median;

import static Median.Median.*;
import static Median.OddArrayException.*;

public class runner
{
    public static void main(String[] args)
    {
        int numbersArr[]={1,2,3,4,5,6,7,67,70,73,90,92,100,102,104};
        int index = -1;
        try
        {
            index = Median(numbersArr);
        }
        catch (OddArrayException e)
        {
          e.printStackTrace();
        }
        System.out.println("The median is "+numbersArr[index]);
    }
}
