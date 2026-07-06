package advancedCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExercise {

    public static void main(String[] args) {

        //Created a list of numbers
        List<String> numbers = new ArrayList<String>();

        //add numbers to the list and made sure to add duplicates
        numbers.add("1");
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("4");
        numbers.add("5");
        numbers.add("5");

        //Creating a set and adding the list to its constructor
        Set<String> uniqueNumbers = new HashSet<String>(numbers);

        //Creating a for-each loop to display the items in a set
        for (String number : uniqueNumbers) {
            System.out.println(number);
        }

    }
}
