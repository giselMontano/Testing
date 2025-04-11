package OopsConcepts;

import com.sun.xml.internal.bind.util.Which;
import org.omg.CORBA.INITIALIZE;

import java.util.*;

public class ArrayListAndSetsH {
    public static void main(String[] args){
        /*
        1)INITIALIZE A HashSet<Integer> FROM 1-10
        2)REMOVE ALL ODD NUMBERS FROM THE HashSet
        3)TRY TO CREATE SET WITH DUPLICATE VALUES
        4)CREATE A HashSet<Integer> ADD SOME INTEGERS AND PRINT THE HashSet.
        Are the printed values always in order they were added?
        Which Set collection would maintain the order?/*

         */
        System.out.println("Tests case 1");
        HashSet<Integer> oneToTen = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            oneToTen.add(i);
        }
        System.out.println(oneToTen);

        //LOOPING THROUGH WITH Iterator
        Iterator<Integer> it = oneToTen.iterator();
        while (it.hasNext()) {
            int tempNum = it.next();
            //this part of code works for odd numbers if the values is not even remove
            if (tempNum % 2 != 0) {
                it.remove();
            }
        }
        System.out.println(oneToTen);

        //LOOPING THROUGH WITH for loop
        System.out.println("Tests case 2");
        HashSet<Integer> one2Ten = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            one2Ten.add(i);
        }
        System.out.println(one2Ten);
        for (int i = 1; i <= one2Ten.size(); i++) {
            if (one2Ten.contains(i)) {
                if (i % 2 != 0) {
                    one2Ten.remove(i);

                }
            }

        }
        System.out.println(one2Ten);


        System.out.println("Tests case 3");
        HashSet<String> duplicate =new HashSet<>();
        duplicate.add("dup 1");
        duplicate.add("dup 2");
        duplicate.add("dup 3");
        duplicate.add("dup 1");
        System.out.println(duplicate);


        System.out.println("Tests case 4");
        //TreeSet maintain order
        Set<Integer> order = new TreeSet<>();
        order.add(1);
        order.add(2);
        order.add(3);
        order.add(1);
        order.add(6);
        System.out.println(order);
    }
}

