package tests;

import java.util.Scanner;

public class ExceptionClassDemo {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value:");

        Thread.sleep(2310);

        try {
            String s = sc.next();
            System.out.println(s.length());
        }
        catch(Exception e)
        {
            System.out.println("Enter a valid input");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Executed Successfully..");
        }


    }

}
