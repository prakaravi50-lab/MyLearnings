package tests;

public class StringComparison {
    public static void main(String[] args) {

        String s1 = "Welcome";
        // String created with object
        String s2 = new String("Welcome");
        String s3=s2;
        // == always compare the objects are equal
        System.out.println(s1==s2);
        //equals always compare the value of object
        System.out.println(s1.equals(s2));

        System.out.println(s3==s2);
        System.out.println((s2.equals(s3)));

        String pal1 = "Welcome to java course 1";
        String pal = "";
        int count=0;

        String a[] = pal1.split(" ");
        System.out.println(a.length);
        for(int i =0;i<a.length;i++)
        {
            count=count+1;
        }
        System.out.println("Number of Word in String is:"+count);


        for(int i = pal1.length()-1;i>=0;i--)
        {
            pal = pal+pal1.charAt(i);
        }
        System.out.println(pal);

        if(pal1.equals(pal))
        {
            System.out.println("The provided value is palindrome:"+pal);
        }else
        {
            System.out.println("Not Palindrome:"+pal);
        }


    }
}
