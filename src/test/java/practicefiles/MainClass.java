package practicefiles;

import test2.*;

public class MainClass {

    void main(int x, int y)
    {
        System.out.println(x+y);
    }
    String main(String name)
    {
        return(name);
    }

    public static void main(String[] args)
    {
        MainClass mc = new MainClass();
        mc.main(10,12);
        /*
        ConstructorOverloading col = new ConstructorOverloading();
        System.out.println(col.vol());
        ConstructorOverloading col1 = new ConstructorOverloading(10.2,20.2,30.2);
        System.out.println(col1.vol());
        ConstructorOverloading col2 = new ConstructorOverloading(40.5);
        System.out.println(col2.vol());
        */
        //Encapsulation
        EncapsulationDemo ed = new EncapsulationDemo();
        ed.setAccno(23253);
        System.out.println(ed.getAccno());
        ed.setAccname("Prakash");
        System.out.println(ed.getAccname());
        ed.setAccbal(25635.2);
        System.out.println(ed.getAccbal());

        DemoPublicClass DPC1 = new DemoPublicClass();
        DPC1.printValue();
        System.out.println(DPC1.value1);



    }


}
