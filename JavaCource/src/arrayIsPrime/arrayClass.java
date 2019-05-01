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
    public void addToArray(Integer num)
    {
            if (num>0)
                numbersArray.add(num);
    }
    public void checkPrimeAndPrint()
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

