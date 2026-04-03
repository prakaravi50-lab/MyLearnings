package tests;

public class HierarchyInheritance {

    int a = 100;

    void display()
    {
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        childb b = new childb();
        System.out.println(b.addition());
        childc c = new childc();
        System.out.println(c.print());
        b.display();
        c.display();


    }
}

class childb extends HierarchyInheritance
{
    int b = 200;

    int addition()
    {
        return(a+b);
    }
}

class childc extends HierarchyInheritance
{
    int c=500;

    int print()
    {
        return(a+c);
    }
}

