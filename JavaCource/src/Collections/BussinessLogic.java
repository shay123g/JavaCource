package Collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BussinessLogic
{
    public static List<String> Countries=new ArrayList<>();

    public static void printCountries()
    {
        for (String value : Countries)
            System.out.println(value);
    }
    public  static void addToCountryList(Scanner scan)
    {

        String tmpstr = scan.nextLine();
        while (!tmpstr.equalsIgnoreCase("done"))
        {
            Countries.add(tmpstr);
            tmpstr = scan.nextLine();
        }
    }
    public  static void addFromMiddle(int index, Scanner scan)
    {
        String tmpstr = scan.nextLine();
        while (!tmpstr.equalsIgnoreCase("done"))
        {
            Countries.add(index, tmpstr);
            tmpstr = scan.nextLine();
        }
    }
}
