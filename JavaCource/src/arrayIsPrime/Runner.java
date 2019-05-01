package arrayIsPrime;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        arrayClass newNumArray=new arrayClass();
        Scanner stream=new Scanner(System.in);
        Integer userInput=0;
        System.out.println("start enter numbers to the array. enter integers only, seperated by Enter. when done, enter 999");
        while (userInput!=999)
        {
            try {
                userInput = stream.nextInt();
                newNumArray.addToArray(userInput);
            } catch (InputMismatchException e)
            {
                System.out.println("user didn't enter an integer value. terminating program");
                System.exit(1);
            }
        }
        stream.close();
        System.out.println("now print only primes");
        newNumArray.checkPrimeAndPrint();

    }
}
