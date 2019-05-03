package Median;
/* input: Array of integers (int). array is already sorted from small to big
*  output: array mediation*/
class Median
{

    private int arrayLength;
    Median(int [] numArr, int len)
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
            int [] numbersArr=new int[arrayLength];
            for (int i = 0; i < numArr.length; i++)
                numbersArr[i] = numArr[i];
            int medianIndex=MedianCheck(numbersArr);
            System.out.println("The median is "+numbersArr[medianIndex]);
        }
        }

    private int MedianCheck(int[] sortarr)
    {
        arrayLength=sortarr.length;
        return arrayLength/2;

    }
}
