package InheritanceExample;

public class PersonTester {

    public static void main (String[] args) {

        //Instantiating a new person
        Person skip = new Person("Skip", "Marley");
        System.out.println(skip);

        //Instantiating a new Student
        Student toni = new Student ("1234", "Toni", "Morrison");
        System.out.println(toni);

        //Instantiating a new StudentEmployee
        StudentEmployee george = new StudentEmployee(21.30, "6789", "2323", "George", "Washington");
        System.out.println(george);

    }
}
