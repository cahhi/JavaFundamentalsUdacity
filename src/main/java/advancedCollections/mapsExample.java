package advancedCollections;

public class mapsExample {

    //Declaring the variables
    String name;
    String email;

    //Creating the constructor
    public mapsExample (String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Initializing the getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Overriding the toString method
    @Override
    public String toString() {
        return "The customer's name is " + name + " and the email is " + email;
    }
}
