package code;

/**
 * This is my first JavaDoc
 * @author Chrissy
 */
public class FirstClass {

    public static void main(String [] args) {
        System.out.println("My first Java application");
        System.out.println(FirstClass.helloAll());

    }

    /**
     * This method prints Hello User when it is run!
     * @return
     */
    public static String helloAll() {
        return "Hello user!";
    }




}
