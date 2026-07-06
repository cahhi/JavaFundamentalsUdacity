package advancedCollections;

import advancedCollections.Person;

import java.util.HashMap;
import java.util.Map;

public class mapExercise {

    public static void main (String[] args) {

        //Creating a hashmap object to store the person object and key value pairs
        Map<String, Person> mapOfPeople = new HashMap<String, Person>();

        //Declaring the variables
        Person mike = new Person("Mike", "mike@example.com");
        Person sally = new Person("Sally", "sally@example.com");
        Person chuck = new Person("Chuck", "chuck@email.com");

        //add persons to map using the put method
        mapOfPeople.put(mike.getEmail(), mike);
        mapOfPeople.put(sally.getEmail(), sally);
        mapOfPeople.put(chuck.getEmail(), chuck);

        //prints out the email
        for( String email : mapOfPeople.keySet()) {
            System.out.println("Key: " + email);
        }
    }
}
