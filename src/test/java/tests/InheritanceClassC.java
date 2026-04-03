package tests;

public class InheritanceClassC extends InheritanceClassB {

    int c;

    InheritanceClassC(int c)
    {
        this.c=c;
    }

    int addingThreenum()
    {
        return(a+b+c);
    }

    public static void main(String[] args) {
        InheritanceClassB icb = new InheritanceClassB();
        icb.addition();
        icb.greeting();

        InheritanceClassC inc = new InheritanceClassC(200);
        System.out.println(inc.addingThreenum());

    }

}
