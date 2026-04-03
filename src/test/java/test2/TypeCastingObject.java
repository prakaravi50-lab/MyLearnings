package test2;

class parent{
    String name = "Prakash";
    void m1()
    {
        System.out.println(name);
    }
}

class child extends parent{
    int id = 101;
    void m2()
    {
        System.out.println(id);
    }
}

public class TypeCastingObject {
    public static void main(String[] args) {
       /* child c = new child();
        c.m2();
        c.m1();

        parent p = new child();
        //p.m2();
        p.m1();
        System.out.println(p.name);
        */

        parent p = new child();
        child c = (child)p;
        c.m2();
        c.m1();

    }
}
