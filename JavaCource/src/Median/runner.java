package Median;

import static Median.Median.*;
import static Median.OddArrayException.*;

public class runner
{
    public static void main(String[] args)
    {
        int numbersArr[]={1,2,3,4,5,6,7,67,70,73,90,92,100,102};
        Median Med=new Median(numbersArr,numbersArr.length);
        System.out.println("The median is "+numbersArr[Med.medianIndex]);
    }
}
