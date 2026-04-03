package tests;

public class MethodsExamples {

    //No param No return value
   Void m1()
    {
        System.out.println("Hello..!!");
        return null;
    }
    //No param Return value
    String m2()
    {
        return("Hi..!!");
    }

    //Param and No Return value
    Void m3(String name)
    {
        System.out.println("Hello.."+name);
        return null;
    }

    //param and return value
    String m4(String name)
    {
        return("Hello.."+name);
    }


}
