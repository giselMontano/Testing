package OopsConcepts;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class ArrayListAndSets {
    public static void main(String [] args){
        System.out.println("Sets/unique values");

        //SETS helps us maintain unique elements in the collection (UNIQUE VALUES NOT IN ORDER)
        Set<String> unique = new HashSet<>();
        unique.add("Song 1");
        unique.add("Song 2");
        unique.add("Song 3");
        unique.add("Song 4");
        unique.add("Song 1");//won't be printed because it is a duplicate value

        System.out.println(unique);

        System.out.println("TreeSet/organize");
        //TREESET helps us sort the values in order (UNIQUE VALUES  IN ORDER)
        Set<String>  sorted = new TreeSet<>();
        sorted.add("Song 1");
        sorted.add("Song 2");
        sorted.add("Song 3");
        sorted.add("Song 4");
        sorted.add("Song 1");

        System.out.println(sorted);//it will print elements sorted and will not repeat duplicates

        System.out.println("HashMap/key,value");
        //HASHMAP helps us with key, value pairs, and it doesn't repeat duplicates if a value contains the same key it overrides
        HashMap<String,String> usernameEmail=new HashMap<String,String>();
        usernameEmail.put("muhammad23","muhammad@testpro.io");
        usernameEmail.put("robert22","robert@testpro.io");
        usernameEmail.put("raul34","raul@testpro.io");
        usernameEmail.put("luis66","luis@testpro.io");
        usernameEmail.put("rene","rene@testpro.io");
        usernameEmail.put("rene","rene77777@testpro.io");//VALUE CONTAINS THE SAME KEY IT GETS OVERRIDE

        System.out.println(usernameEmail);

        System.out.println("GETTING THE VALUE BY CALLING THE KEY");
        //we can also obtain the value from the key
        System.out.println(usernameEmail.get("luis66"));

        //REMOVE an element by key
        System.out.println("REMOVE");
        usernameEmail.remove("raul34");
        System.out.println(usernameEmail);

//printing the size BEFORE DELETING EVERYTHING
        System.out.println(usernameEmail.size());
        System.out.println("REMOVE EVERYTHING FROM THE ENTIRE COLLECTION");
        usernameEmail.clear();
        System.out.println(usernameEmail);


        //printing the size AFTER DELETING EVERYTHING FROM THE COLLECTION
        System.out.println(usernameEmail.size());


        System.out.println("NEW EXAMPLE FOR LOOPS");
        HashMap<String,String> namePet=new HashMap<String,String>();
        namePet.put("ale","susi");
        namePet.put("bruno","kit");
        namePet.put("catherin","lola");
        namePet.put("denis","taco");
        namePet.put("elinis","pelusa");
        namePet.put("elinis","pelusa");

        //LOOP THROUGH THE HASHMAP
        System.out.println("PRINTING THE KEYS FROM THE COLLECTION");
        for (String i:namePet.keySet()){
            System.out.println(i);
        }
        System.out.println("PRINTING THE VALUES FROM THE COLLECTION");
        for (String i:namePet.values()) {
            System.out.println(i);
        }
        System.out.println("PRINTING THE KEY AND VALUES AT THE SAME TIME");
        for (String i:namePet.keySet()) {

            System.out.println("Key: " + i+ " values:" +namePet.get(i));//get-->gives you all the values

        }

    }
}
