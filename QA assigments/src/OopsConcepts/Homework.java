package OopsConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        /* Homework
         #10 - ArrayLists
         * 1.) Create an ArrayList of Integers #1 and add the values: -2, -3,
               6 and 3
            *  Sample syntax: List<Integer> arrayList1 = new ArrayList<>();
         * 2.) Create another ArrayList of Integers #2 and add the values: -2,
               -4, 5 and -3
         * 3.) Create a new ArrayList for Integers #3
         * 4.) Add both ArrayLists #1 and #2 that we created earlier into  ArrayList #3
         * 5.) Find the minimum value within the combined (ArrayList #3) and print it to the console
         */

    // Write the missing part here
    List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(-2);
           arrayList1.add(-3);
           arrayList1.add(6);
           arrayList1.add(3);
           System.out.println(arrayList1);
    List<Integer> arrayList2 = new ArrayList<>();
           arrayList2.add(-2);
           arrayList2.add(-4);
           arrayList2.add(5);
           arrayList2.add(-3);
           System.out.println(arrayList2);

    List<Integer> mergedList = new ArrayList<>();

        mergedList.addAll(arrayList1);
        mergedList.addAll(arrayList2);
        System.out.println(mergedList);
    int minElement = Collections.min(mergedList);
        System.out.println("The minimun value is "+minElement);


}
}