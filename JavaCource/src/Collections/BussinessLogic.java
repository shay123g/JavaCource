package Collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BussinessLogic
{
    public static List<String> Countries=new ArrayList<>();
    public  static void InitializeCountryList()
    {
        Scanner inputStream=new Scanner(System.in);
        System.out.println("Enter the countries you been visited, seperated by Enter. when you finish type Done");
        String tmpstr = inputStream.nextLine();
        while (!tmpstr.equalsIgnoreCase("done"))
        {
            Countries.add(tmpstr);
            tmpstr = inputStream.nextLine();
        }

             inputStream.close();
    }
}
