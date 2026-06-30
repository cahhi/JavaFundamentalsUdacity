package genericsAndCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExercise {

    public static void main (String[] args){

        //Creating a list
        List<String> names = new LinkedList<String>();

        //adding in variables
        names.add("Mike");
        names.add("Bob");
        names.add("Alice");

        //using the iterator interface to traverse over all the values
        Iterator<String> iterator = names.iterator();

        //loop over the values using a while loop
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
