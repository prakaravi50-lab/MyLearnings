package collectiontest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args)
    {

        List<Object> mylist = new ArrayList<Object>();
        //Add the values into the Array List
        mylist.add(10);
        mylist.add("Welcome");
        mylist.add("10.20");
        mylist.add('A');
        mylist.add(true);
        //Size of Array List
        System.out.println(mylist.size());
        //Print the value of Array List
        System.out.println(mylist);
        //Print the specific value of ArrayList
        System.out.println(mylist.get(2));
        //Remove the values from Array list
        mylist.remove(1);
        System.out.println(mylist);
        //Insert the value in Array list
        mylist.add(1,"Welcome");
        System.out.println(mylist);
        //Modify the values in the Array List
        mylist.set(1,"Java");
        System.out.println(mylist);
        mylist.add("selenium");
        System.out.println(mylist);
        mylist.add(2,"c#");
        System.out.println(mylist);
        System.out.println(mylist.get(3));

       /* //Simple for loop to reading the values from ArrayList
        for(int i=0;i<mylist.size();i++)
        {
            System.out.println(mylist.get(i));
        }

        //Enhanced for loop
        for( Object my:mylist)
        {
            System.out.print(my+" ");
        }
        */
        //Get the values in reverse order from Array List
        for(int i= mylist.size()-1;i>=0;i--)
        {
            System.out.println(mylist.get(i));
        }

        //Using Iterator
        Iterator<Object> it =mylist.iterator();
        while(it.hasNext())
        {
            System.out.println("This is Iterator Class:"+it.next());
        }
        //to check the ArrayList is empty or not
        System.out.println(mylist.isEmpty());

        ArrayList mylist2 = new ArrayList();

        mylist2.add(10);
        mylist2.add('A');

        System.out.println("ArrayList2"+mylist2);
        mylist.removeAll(mylist2);
        System.out.println(mylist2.get(0));
        System.out.println("ArrayList2"+mylist);
        // Clear the array list
        mylist.clear();
        System.out.println(mylist.isEmpty());
        System.out.println(mylist);


        ArrayList al = new ArrayList();

        al.add(1);
        al.add(1);
        al.add(null);
        al.add(null);
        System.out.println(al);
        System.out.println(al.get(0);
        
    }
}
