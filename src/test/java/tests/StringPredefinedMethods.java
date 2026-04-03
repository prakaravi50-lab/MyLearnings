package tests;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.testng.reporters.XMLConstants;

import java.util.Arrays;

public class StringPredefinedMethods {
   public static void main(String[] args)
    {
        String s1 = "Welcome";
        //length() method
        System.out.println("String Count:"+s1.length());

        //concat() - Join the two strings
        String s2 = " Java Tutorial  ";
        System.out.println(s1.concat(s2));

        //Trim() - Remove the space right and left side of strings
        System.out.println(s2.trim());

        //charAt() - To retrieve  the provided index character
        System.out.println(s1.charAt(0));

        //contains() - To retrieve the part of main string
        String s3 = "welcome";
        boolean b1 = s1.contains(s3);
        System.out.println(b1);

        //equals() - Match the given string with expected string value
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

        //replace() - To replace the give string or characters in actual string value
        s1 ="Welcome to Selenium tutorial";
        System.out.println(s1.replace('e','x'));
        System.out.println(s1.replace("Welcome","Come "));

        //toUpperCase and tolowerCase conversion of given string
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        //split() method - split the string based on delimiter
        s1 = "testing@gmail.com";
        String a[] = s1.split("@");
        System.out.println(a[0]+" "+a[1]);
        System.out.println(Arrays.toString(a));

        //Ex1
        s1 ="$45,85,89";
        System.out.println(s1.replace('$',' ').trim().replace(",",""));

        //Substring method will retrieve the values based on index
        s1="Welcome To Java";

        System.out.println(s1.substring(0,3));




    }
}
