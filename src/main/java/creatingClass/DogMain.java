package creatingClass;

public class DogMain {

    public static void main(String [] args) {

        Dog myDog = new Dog("Maltipoo", "Chuck Norris", "Cream", 12);

        System.out.println(myDog.getDogType());
        System.out.println(myDog.getDogName());
        System.out.println(myDog.getDogColor());
        System.out.println(myDog.getDogAge());

        //Can also just use the toString method that was created in the Dog class
        System.out.println(myDog);
    }
}
