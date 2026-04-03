package tests;

public class StringMethods {

    public static void main (String[] args)
    {
        //String Reverse Approach 1
        String s = "Welcome";
        String rev = " ";
        /*for(int i=s.length()-1;i>=0;i--)
        {
            rev = rev+s.charAt(i);
        }
        System.out.println(rev);
        */

        //Approach 2
       /* char a[] = s.toCharArray();
        for(int i = a.length-1;i>=0;i--)
        {
            rev = rev+a[i];
        }
        System.out.println(rev);
        */


        //Approach 3
        StringBuffer s1 = new StringBuffer("Welcome");
        System.out.println("The Reverse String Value is:"+s1.reverse());

        //Approach 4
        StringBuilder s2 = new StringBuilder("Selenium");
        System.out.println(s2.reverse());

    }
}
