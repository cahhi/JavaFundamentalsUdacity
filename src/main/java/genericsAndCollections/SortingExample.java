package genericsAndCollections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {

    public static void main (String[] args){

        //Created an array list
        ArrayList<String> names = new ArrayList<String>();

        //Added names into Array List
        names.add("Chrissy");
        names.add("Jamal");
        names.add("Chuck");

        //Sorted variables using the sort() method
        Collections.sort(names);

        //Created a for-each loop to iterate values and print them to console
        for (String people : names) {
            System.out.println(people);
        }
    }
}
