package Median;

/* input: Array of integers (int). array is already sorted from small to big
*  output: array mediation*/
public class Median
{
    static int medianIndex,arrayLength=-1;
    static int Median(int sortarr[]) throws OddArrayException
    {
        arrayLength=sortarr.length;
        if (arrayLength%2==0)
            throw new OddArrayException();
        medianIndex=arrayLength/2;
        return medianIndex;
    }
}
