package scannerExample;

import java.util.Scanner;

public class userInputTester {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a string: ");
            String userInput = scanner.nextLine();
            System.out.println("User input: " +userInput);
        } catch(Exception ex){
            ex.getLocalizedMessage();
            //guaranteed to close the scanner so that there are no issues
        }finally {
            scanner.close();
        }
    }
}
