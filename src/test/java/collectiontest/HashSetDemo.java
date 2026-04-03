package collectiontest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        //Declaration
        HashSet<Object> hset = new HashSet<Object>();
        //Set hs = new HashSet();//Using Parent Interface
        //HashSet<Integer> hs = new HashSet<Integer>();//Declare for specific value

        //Add the values into the hashset
        hset.add(100);
        hset.add("Prakash");
        hset.add('A');
        hset.add(23.4);
        hset.add(true);
        hset.add("Prakash");
        hset.add(null);
        hset.add(null);

        //Print the values is hset
        System.out.println(hset);

        //Remove the value from hashset
        hset.remove("Prakash");
        hset.remove(null);
        System.out.println(hset);

        //Covert Hashset  into ArrayList
        ArrayList al = new ArrayList(hset);

        System.out.println("Array List: "+al.get(0));

       // al.remove(0);
        System.out.println("Array List: "+al);
       hset.add("Prakash");
        System.out.println("Hashset Value:"+hset);

        //Read the all the element using enhanced for loop
        for(Object h :hset)
        {
            System.out.println("The Value of Hset:"+h);
        }

        //Iterator
        Iterator<Object> it =hset.iterator();
        while(it.hasNext())
        {
            System.out.println("The Iterator:"+it.next());
        }

        //To check the HashSet size
        System.out.println(hset.size());

        //To check the HashSet Value is empty
        System.out.println(hset.isEmpty());

        //To clear the values
        hset.clear();
        System.out.println(hset);
        System.out.println(hset.isEmpty());

    }
}
