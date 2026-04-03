package tests;

public class PolymorphismOverloading {

    int  a= 10;
    int b=20;
    //Normal Method
    void sum()
    {
        System.out.println(a+b);
    }
    //Method Overloading with different parameter
    void sum(int x, int y)
    {
        System.out.println(x+y);
    }
    //Method overloading with different data type of parameter
    void sum (int x, double y)
    {
        System.out.println(x+y);
    }
    //Method overloading with order change in parameter

    void sum(double x, int y)
    {
        System.out.println(x+y);
    }


}
