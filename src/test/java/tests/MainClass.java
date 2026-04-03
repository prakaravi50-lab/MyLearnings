package tests;

public class MainClass {
    public static void main(String[] args) {

       /* MethodsExamples me = new MethodsExamples();
        me.m1();
        String s = me.m2();
        System.out.println(s);
        me.m3("prakash");
        String s2 = me.m4("jana");
        System.out.println(s2);
        */
/*
        ConstructorExample ce = new ConstructorExample(103,"Hari",'A');
        //Initialize the values using object
        /*ce.sid=101;
        ce.sname="Hari";
        ce.grade='A';
        //Initialize the values using method
       // ce.setValues(102,"Jhon",'a');
        ce.printValues();

 */
        //Method Over loading
        PolymorphismOverloading pol = new PolymorphismOverloading();
        pol.sum();
        pol.sum(10,56);
        pol.sum(10,20.3);
        pol.sum(10.2,8);
    }
}
