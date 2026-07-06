package advancedCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercise {

    public static void main(String[] args){

        //Instantiating a queue object
        Queue<String> queuedCustomer = new LinkedList<>();

        //Added waiting customers to the queue
        queuedCustomer.add("1234");
        queuedCustomer.add("5678");
        queuedCustomer.add("9101");
        queuedCustomer.add("5689");
        queuedCustomer.add("0000");

        //Printing out a while loop to print out the queue
        while(!queuedCustomer.isEmpty()) {
            System.out.println("Customer: " +queuedCustomer.poll() + " is getting helped");
        }
    }
}
