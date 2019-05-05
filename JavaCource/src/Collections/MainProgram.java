package Collections;

import java.util.Scanner;

public class MainProgram
{

    public static void main(String[] args)
    {
        int middleCountry = -1;
        Scanner Input=new Scanner(System.in);
        // Sections 1&2
        System.out.println("Enter the countries you been visited, separated by Enter. when you finish type Done");
        BussinessLogic.addToCountryList(Input);
        System.out.println("Country list contain the following countries: ");
        BussinessLogic.printCountries();
        //section 3
        System.out.println("number of countries in list:" + BussinessLogic.Countries.size());
        //section 4
        if (BussinessLogic.Countries.size() == 2)
            System.out.println("the two middle countries in list: " + BussinessLogic.Countries.get(BussinessLogic.Countries.size() / 2) + " Indexes:" + (BussinessLogic.Countries.size() / 2));
        else if (BussinessLogic.Countries.size() % 2 == 0)
        {
            System.out.println("the two middle countries in list: " + BussinessLogic.Countries.get(BussinessLogic.Countries.size() / 2) + "," + BussinessLogic.Countries.get(BussinessLogic.Countries.size() / 2 + 1) + " Indexes:" + (BussinessLogic.Countries.size() / 2) + "," + ((BussinessLogic.Countries.size() / 2) + 1));
            middleCountry = (BussinessLogic.Countries.size() / 2) + 1;
        } else
        {
            System.out.println("the country in the middle of the list is: " + BussinessLogic.Countries.get(BussinessLogic.Countries.size() / 2) + " index:" + (BussinessLogic.Countries.size() / 2));
            middleCountry = BussinessLogic.Countries.size() / 2;
    }
        //section 5
        System.out.println("Now checking if Madrid exists and change the country name...");
        if (BussinessLogic.Countries.contains("Madrid"))
        {
            System.out.println("Now changing country name...");
            BussinessLogic.Countries.set(BussinessLogic.Countries.indexOf("Madrid"), "New Zeland");
            System.out.println("New country list");
            BussinessLogic.printCountries();
        }
        else System.out.println("Madrid not in the List. Do nothing");
        //section 6
        System.out.println("Now Check if Germany exists...");
        if (BussinessLogic.Countries.contains("Germany"))
                System.out.println("Index of Germany in List is "+BussinessLogic.Countries.indexOf("Germany"));
            else
                System.out.println("Germany not in the List");
        //section 7
       System.out.println("Last country in List is "+BussinessLogic.Countries.get(BussinessLogic.Countries.size()-1));
       //section 8
        System.out.println("Deleting Last country and print the new list...");
        BussinessLogic.Countries.remove(BussinessLogic.Countries.size()-1);
        BussinessLogic.printCountries();
       //section 9
        System.out.println("Now please enter new countries to the existing list. when finish - type done and press enter");
        BussinessLogic.addToCountryList(Input);
        System.out.println("Print the new list:");
       BussinessLogic.printCountries();
       //section 10
      System.out.println("Now please enter even more new countries to the existing list. when finish - type done and press enter");
      BussinessLogic.addFromMiddle(middleCountry,Input);
        Input.close();
        BussinessLogic.printCountries();


        }



    }


