package practicefiles;

public class StaticandThisKeyword {

    int accno;
     String accname;
    double accbal;
    static String phno;

    void printDetails1(int accno, String accname, double accbal )
    {
        this.accno=accno;
        this.accname=accname;
        this.accbal=accbal;
    }

    int printDetails()
    {

        return(accno);
    }

    static String acbal()
    {
        return(phno);

    }

    public static void main(String[] args) {
        StaticandThisKeyword stk = new StaticandThisKeyword();
       stk.printDetails1(1235,"Praaksh",5623.25);
        System.out.println(stk.printDetails());
        phno="9876543210";
        System.out.println(acbal());


    }

}
