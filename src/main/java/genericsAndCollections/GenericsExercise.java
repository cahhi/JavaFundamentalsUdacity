package genericsAndCollections;

import java.util.ArrayList;

public class GenericsExercise {

    public static void main (String[] args){

        //Adding an ArrayList
        ArrayList<Object> variables = new ArrayList<Object>();

        //Defining variables here
        Double doubleNumber = 1.5;
        String name = "Sally";
        Integer intNum = 1;
        Character letter = 'a';

        //Adding variable into the ArrayList
        variables.add(doubleNumber);
        variables.add(name);
        variables.add(intNum);
        variables.add(letter);

        //Looping through the variables list calling an object in the array ( : means "from")
        for (Object variable : variables){
            GenericsExercise.displayClassName(variable);
        }

        }
    //Creating a generic method to display the class type for each type by using a Java Type ensure
    //"T" is a type
    //Make sure that
    static <T> void displayClassName(T variable) {
        System.out.println(variable.getClass().getName());

    }
}
