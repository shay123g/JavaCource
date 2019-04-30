package Collections;

public class MainProgram
{
    public static void main(String[] args)
    {
        BussinessLogic.InitializeCountryList();
        System.out.println("Country list: ");
        for (String value : BussinessLogic.Countries)
            System.out.println(value);
        System.out.println("number of countries in list:"+BussinessLogic.Countries.size());
        if (BussinessLogic.Countries.size()==2)
            System.out.println("Two middle countries in list: "+BussinessLogic.Countries.get(BussinessLogic.Countries.size()/2)+" Indexes:"+(BussinessLogic.Countries.size()/2));
        else if (BussinessLogic.Countries.size()%2==0)
            System.out.println("Two middle countries in list: "+BussinessLogic.Countries.get(BussinessLogic.Countries.size()/2)+","+BussinessLogic.Countries.get(BussinessLogic.Countries.size()/2+1)+" Indexes:"+(BussinessLogic.Countries.size()/2)+","+((BussinessLogic.Countries.size()/2)+1));
        else
            System.out.println("Country in the middle is: "+BussinessLogic.Countries.get(BussinessLogic.Countries.size()/2)+" index:"+(BussinessLogic.Countries.size()/2));
        if (BussinessLogic.Countries.contains("A"))
        {
            System.out.println("Now changing country name 'A...'");
            BussinessLogic.Countries.set(BussinessLogic.Countries.indexOf("A"),"NewChangedCountry");
            System.out.println("New country list");
            for (String value : BussinessLogic.Countries)
                System.out.println(value);
        }



    }

}
