package OopsConcepts;

import java.util.*;

public class SetsTreeSetsMaps {
    public static void main(String[] args) {
    /*
     * Homework #11 - Sets & Maps
     *
     * Assignment #1 Sets
     * 1.) We had the students from the following countries in the
     *     cohort #1 of the bootcamp: United States, United States,
     *     Ukraine, Mexico
     * 2.) In the cohort #2 we had the following countries: United States,
     *     Canada, United States, Mexico
     * 3.) Print out the list of all unique countries of every cohort
     *     separately (order doesn't matter)
     *     Format: "Cohort 1 Unique Set: [list of unique countries]"
     *     Format: "Cohort 2 Unique Set: [list of unique countries]"
     * 4.) Print out all unique countries from all cohorts in one
     *     line (order doesn't matter)
     *     Format: "All Unique Countries: [list of unique countries]"
     * 5.) Print out all unique countries from all cohorts in alphabetical order
     *     Format: "All Unique Countries in Alphabetical Order: [list of unique countries]"
     * 6.) Print out the common countries from both cohorts
     *     Format: "Common Countries: [list of common countries]"
     */

    // Write the missing part here
    Set<String> cohort1 = new HashSet<>();
        cohort1.add("United States");
        cohort1.add("United States");
        cohort1.add("Ukraine");
        cohort1.add("Mexico");
    Set<String> cohort2 = new HashSet<>();
        cohort2.add("United States");
        cohort2.add("Canada");
        cohort2.add("United States");
        cohort2.add("Mexico");
        System.out.println("Cohort 1 Unique Set: " + cohort1);
        System.out.println("Cohort 2 Unique Set: " + cohort2);


        Set<String> merge = new HashSet<>(cohort1);
        merge.addAll(cohort2);
        System.out.println("All Unique Countries: " + merge);

        System.out.println("-----alphabetical order-----");
        Set<String> mergeOrder = new TreeSet<>(cohort1);
        mergeOrder.addAll(cohort2);
        System.out.println("All Unique Countries in Alphabetical Order: " + mergeOrder);

        System.out.println("-----common countries-----");
        Set<String> mergeCommon = new HashSet<>(cohort1);
        mergeCommon.retainAll(cohort2);
        System.out.println("Common Countries:: " + mergeCommon);


        System.out.println("=============NEW TEST==============");

        /*
         * Homework #11 - Sets & Maps
         *
         * Assignment #2 Maps
         * 1.) Declare a HashMap with Integer values for Street Numbers
         *     & String values for Names:
         * 2.) Initialize the HashMap with the following entries:
         *     (1000, Liam), (1001, Noah), (1002, Olivia), (1003, Emma),
         *     (1004, Benjamin), (1005, Evelyn), (1006, Lucas)
         * 3.) Find the name of the person who lives at 1004
         *     based on the street number
         * 4.) Print out all the odd number streets
         *     and their corresponding names
         *     Format: "Street Number: [number] | Name: [name]"
         */

        // Write the missing part here
        HashMap<Integer,String> street = new HashMap<>();
        street.put (1000, "Liam");
        street.put (1001, "Noah");
        street.put (1002, "Olivia");
        street.put (1003, "Emma");
        street.put (1004, "Benjamin");
        street.put (1005, "Evelyn");
        street.put (1006, "Lucas");
        System.out.println(street.get(1004));

        for (int oddNumbers: street.keySet()){

            if (oddNumbers % 2 != 0) {
                System.out.println("Street Number: " + oddNumbers + " | Name: " + street.get(oddNumbers));
            }
        }

    }
}
