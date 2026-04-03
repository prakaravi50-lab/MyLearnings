package tests;

public class ConversionOfValues {

    public static void main(String[] args) {
        //String to int,double and boolean
        //String s1 = "true";
       // String s2 = "56";

       // System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

        //System.out.println(Double.parseDouble(s1));

        //System.out.println(Boolean.parseBoolean(s1));

        //int,double,boolean and char to String

        int a = 10;
        int b = 20;
        double d=23.7;
        boolean b1 = true;
        char c = 'A';

        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
        System.out.println(s+s1);

        s = String.valueOf(d);
        System.out.println(s);

        s = String.valueOf(b1);
        System.out.println(s);

        s=String.valueOf(c);
        System.out.println(s);

    }




}
