package OopsConcepts;

import java.util.*;

public class MapsTests {
    public static void main(String[] args) {
        /*
        1)Write a Java program to test if a map contains a mapping for the specific key
        2)Write a Java program to copy all of the mapping from the specific map to another map
        3)Remove a value from HshMap based on Key
         */
        System.out.println("map 1");
        HashMap<String,Integer> hashmap1 = new HashMap<>();
        hashmap1.put("red",1);
        hashmap1.put("green",2);
        hashmap1.put("black",3);
        hashmap1.put("blue",4);
        System.out.println(hashmap1.containsKey("red"));
        System.out.println(hashmap1);

        System.out.println("map 2");
        HashMap<String,Integer> hashmap2 = new HashMap<>();
        hashmap2.put("pink",7);
        hashmap2.put("lightpink",8);
        System.out.println(hashmap2);
        //adding all the values from hashmap1
        hashmap2.putAll(hashmap1);
        //removing an element by the key
        hashmap2.remove("pink");



        System.out.println(hashmap2);
    }
}