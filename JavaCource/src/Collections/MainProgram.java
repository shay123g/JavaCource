package Collections;

public class MainProgram
{
    public static void main(String[] args)
    {
        BussinessLogic.InitializeCountryList();
        System.out.println("Country list: ");
        for (String value : BussinessLogic.Countries)
            System.out.println(value);
        System.out.print("number of countries in list:"+BussinessLogic.Countries.size());

    }
}
