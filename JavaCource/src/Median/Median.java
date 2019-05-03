package Median;
/* input: Array of integers (int). array is already sorted from small to big
*  output: array mediation*/
public class Median
{

    int medianIndex,arrayLength;

    Median(int numArr[], int len)
    {
        arrayLength=len;
        if (numArr.length%2==0)
            try
            {
                throw new OddArrayException("Array has even number of elements. program will now exit");
            }
            catch (OddArrayException e)
            {
                e.printStackTrace();
            }
        else {
            int numbersArr[]=new int[arrayLength];
            for (int i = 0; i < numArr.length; i++)
                numbersArr[i] = numArr[i];
            MedianCheck(numbersArr);
        }
        }

    int MedianCheck(int sortarr[])
    {
        arrayLength=sortarr.length;
        medianIndex=arrayLength/2;
        return medianIndex;
    }
}
