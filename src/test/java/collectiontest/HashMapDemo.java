package collectiontest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
       //Declaration
        //HashMap hm = new HashMap();
        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        //Add the Key and Values in HashMap Table
        hm.put(101,"Prakash");
        hm.put(102,"Jana");
        hm.put(101,"Hari");

        // Print the values in Hashmap
        System.out.println("The Value of HashMap:"+hm);
        //The Size of HashMap
        System.out.println(hm.size());
        hm.put(103,"Dinesh");
        System.out.println(hm);
        //Remove the pair
        hm.remove(101);
        System.out.println(hm);

        //Access the value of Key
        System.out.println(hm.get(103));
        //Access the all the value in the hashmap
        System.out.println(hm.keySet()); // Retrieve  the Key only
        System.out.println(hm.values()); // Retrieve the values only
        System.out.println(hm.entrySet());//Retrieve the all the Key and Values

        hm.put(101,"Jana");
        //For Each loop
        for(Object k:hm.keySet())
        {
            System.out.println("The Key:"+k +" and Value is:"+hm.get(k));
        }
        //Iterator
        Iterator<Map.Entry<Integer,String>> it =hm.entrySet().iterator();
        while(it.hasNext())
        {
            System.out.println("The Value is:"+it.next());
        }

        hm.clear();
        System.out.println(hm.isEmpty());






    }
}
