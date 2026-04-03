package tests;
public class OverridingDemo {
    double d;
    double roi(double d1)
    {
        d=d1;
        return(d);
    }

    public static void main(String[] args) {

        OverridingDemo ord = new OverridingDemo();
        System.out.println(ord.roi(23.2));
        ClassB B = new ClassB();
        System.out.println(B.roi());


    }
}
class ClassB extends OverridingDemo
{
    int roi()
    {
        return(50);
    }
}

class ClassC extends OverridingDemo
{
    double roi()
    {
        return(56.3);
    }
}

