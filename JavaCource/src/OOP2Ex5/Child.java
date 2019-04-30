package OOP2Ex5;

public class Child extends Father
{
    String Childword=" World";
    String FullString;
    Child()
    {
       FullString=FatherString.concat(Childword);
    }

    public void Print() {
        System.out.println(FullString);
    }
    }
