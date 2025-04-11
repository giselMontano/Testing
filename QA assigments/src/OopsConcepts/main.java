package OopsConcepts;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        System.out.println("----ArrayList----");
        ArrayList<String> songList = new ArrayList<>();
        //Add items into ArrayList
        songList.add("alice");
        songList.add("bing");
        songList.add("candy shop");
        songList.add("dido");
        System.out.println(songList);

        //REEMPLAZAR/ UPDATE
        songList.set(0, "zoe");
        System.out.println(songList);

        //ELIMINAR/ REMOVE
        songList.remove(2);
        System.out.println(songList);

        //GET specific VALUES by index (always index starts from 0)
        System.out.println(songList.get(0));

        //Size is the exact number of characters we have inside the arraylist and INDEX starts from 0
        System.out.println(songList.size());


        System.out.println("-----LOOP ARRAY-----");
        //Loop in Array
        for (int i = 0; i < songList.size(); i++) {
            System.out.println(songList.get(i));
        }
        for (String song : songList) {
            System.out.println(song);
        }

        System.out.println("-----COLLECTIONS-----");
        //COLLECTIONS IS ANOTHER CLASS
        //Sort things up alphabetically a,b,c etc
        Collections.sort(songList);
        System.out.println(songList);
        //reverse the order from last to the first one
        Collections.reverse(songList);
        System.out.println(songList);


        System.out.println("-------ArrayList of integers-----");
        //when we use collections we need to use wrapper classes which mens to use
        // Integer/String for primitive types/Double for double/Boolean for boolean Character for char
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("----EXERCISES----");
        //Write a java program to iterate through all elements in arraylist and print them
        ArrayList<Double> decimals = new ArrayList<>();
        decimals.add(22.2);
        decimals.add(33.2);
        decimals.add(44.2);
        decimals.add(55.2);
        for (Double deci : decimals) {
            System.out.println(deci);
        }
        //Insert(not update) an element into an  Array at the first position
        decimals.add(1, 100.0);
        System.out.println(decimals);

        //Retrieve an element at a specific index in a given ArrayList
        System.out.println(decimals.get(1));

        //the array grows on size
        System.out.println(decimals.size());

        System.out.println("-----SECOND EXERCISE-----");
        //Using a for loop initialize an ArrayList 1-10
        ArrayList<Integer> oneToTen = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            oneToTen.add(i);
        }
        System.out.print(oneToTen + " ");

        System.out.println("--------");

        //Create an ArrayList [1,2,3,6,7,3,2,1] remove all numbers divisible by 2's from the list
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(6);
        num.add(7);
        num.add(3);
        num.add(2);
        num.add(1);
        for (int i = 0; i < num.size(); i++) {
            int temp = num.get(i);
            if (temp % 2 == 0) {
                num.remove(i);
            }
        }
        System.out.println(num);
        //Create an ArrayList [1,2,3,6,7,3,2,1] remove all odd numbers
        ArrayList<Integer> numOdd = new ArrayList<>();
        numOdd.add(1);
        numOdd.add(2);
        numOdd.add(3);
        numOdd.add(6);
        numOdd.add(7);
        numOdd.add(3);
        numOdd.add(2);
        numOdd.add(1);
        for (int i = 0; i < numOdd.size(); i++) {
            int temp = numOdd.get(i);
            if (temp % 2 != 0) {
                numOdd.remove(i);
            }
        }
        System.out.println(numOdd);
        System.out.println("-----THIRD EXERCISE-----");
        //Write a java program to update specific elements by given elements
        ArrayList<String> names = new ArrayList<>();
        //Add items into ArrayList
        names.add("Ale");
        names.add("Benjamin");
        names.add("Camil");
        names.add("Dough");
        System.out.println(names);

        //REEMPLAZAR/ UPDATE
        names.set(0, "Zulet");
        System.out.println(names);

        //Remove the 3 element
        names.remove(3);
        System.out.println(names);


        System.out.println("-----FOURTH  EXERCISE-----");
        //Write a method with an ArrayList<Integer> parameter that removes all occurrences of the number 3
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(10);
        randomNumbers.add(3);
        randomNumbers.add(90);
        randomNumbers.add(3);
        randomNumbers.add(78);
        randomNumbers.add(88);
        randomNumbers.add(3);


        System.out.println(randomNumbers);
        removeNum3(randomNumbers);
        System.out.println(randomNumbers);

    }


//THIS METHOD ONLY REMOVES 3 AS LONG AS IS NOT ONE AFTER ANOTHER
// IF THE ARRAY LOOKS LIKE [23,3,3,56]
    //IT WILL REMOVE ONLY ONE 3 AND SKIP THE OTHER ONE
    public static void removeNum3(ArrayList<Integer> list) {
        for (int a = 0; a < list.size(); a++) {
            int tempNumber = list.get(a);
            if (tempNumber == 3) {
                list.remove(a);
            }
        }
    }

}


