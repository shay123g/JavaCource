package arrayIsPrime;

import java.util.ArrayList;
import java.util.List;

public class arrayClass
{
    List<Integer> numbersArray;
    boolean isPrime;
    arrayClass()
    {
        numbersArray=new ArrayList<Integer>();
    }
    public void addToArray(Integer num)   //insert the number got from the user to the array
    {
            if (num>0)
                numbersArray.add(num);
    }
    public void checkPrimeAndPrint()   //iterate on each element in the array. if the number is prime, print it
    {

        for (Integer n : this.numbersArray)
        {
            isPrime=true;
            for (int i=2;i<n;i++)
                if (n%i==0)
                    isPrime=false;
            if (isPrime==true && n!=2 && n!=0)
                System.out.println(n+",");
        }
    }
}

