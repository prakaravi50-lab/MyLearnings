package tests;

interface Shape
{
    int length=20;
    double height=23.2;

    void circle();

    default void square()
    {
        System.out.println("This is square method default");
    }

    static void rectangle()
    {
        System.out.println("This is rectangle method");
    }
}

public class InterfaceDemo implements Shape
{
    public void circle()
    {
        System.out.println("This is circle method in abstract implementation");
    }

    public static void main(String[] args) {
        /*InterfaceDemo ifd = new InterfaceDemo();
        ifd.circle();
        ifd.square();
        Shape.rectangle();
        System.out.println(Shape.length);
         */
        Shape sh = new InterfaceDemo();
        sh.circle();
        sh.square();
        Shape.rectangle();
        System.out.println(Shape.height+" "+Shape.length);

    }
}
