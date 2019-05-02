package Median;

import static Median.Median.*;

public class runner
{
    public static void main(String[] args) throws OddArrayException
    {
        int numbersArr[]={1,2,3,4,5,6,7,67,70,73,90,92,100};
        int index = Median(numbersArr);
        System.out.println("The median is "+numbersArr[index]);
    }
}
