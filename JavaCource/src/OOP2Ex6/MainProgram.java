package OOP2Ex6;

public class MainProgram
{
    public static void main(String[] args) {

        Israel il=new Israel();
        USA us=new USA();
        China ca=new China();
        System.out.println(il.myTraditionalFood()+","+il.myTraditionalLanguage()+","+il.myTraditionalVacation());
        System.out.println(us.myTraditionalFood()+","+us.myTraditionalLanguage()+","+us.myTraditionalVacation());
        System.out.println(ca.myTraditionalFood()+","+ca.myTraditionalLanguage()+","+ca.myTraditionalVacation());

    }


}
