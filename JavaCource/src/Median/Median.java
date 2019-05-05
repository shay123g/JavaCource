package Median;
/* input: Array of integers (int). array is already sorted from small to big
*  output: array median*/
class Median
{

    private int arrayLength;
    Median(int [] numArr, int len)
    /* Constructor input: numbers array from user and its length
       copy the elements to the class array if array have odd number of elements, otherwise throw exception
     */
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
        else
            {
            int [] numbersArr=new int[arrayLength];   //create new class member: int array
            for (int i = 0; i < numArr.length; i++)   //copy elements to the array
                numbersArr[i] = numArr[i];
            int medianIndex=MedianCheck(numbersArr);   //call to function for median check
            System.out.println("The median is "+numbersArr[medianIndex]);
        }
        }

    private int MedianCheck(int[] sortarr)
    /*
        input: array of int's
        return the index of the median in the array
     */
    {
        arrayLength=sortarr.length;
        return arrayLength/2;

    }
}
