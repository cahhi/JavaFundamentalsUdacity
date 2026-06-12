package InheritanceExample;

public class Person {

    private String firstName;
    private String lastName;

    //This is a constructor that is setting the name variables
    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Creating getters and setters below

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Overriding the toString() method
    @Override
    public String toString() {
        return "The name of the person is: " + firstName + " " + lastName;
    }
}
