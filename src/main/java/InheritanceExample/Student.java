package InheritanceExample;

//We are extending the properties of the person class to the student class
public class Student extends Person {

    private String studentId;

    public Student (String studentId, String firstName, String lastName) {
        //Super is calling the Parent class variables and must go first as shown below
        super(firstName, lastName);
        this.studentId = studentId;
    }

    //Inputting my getters and setters for studentID
    public String getStudentId(){
        return studentId;
    }

    public void setStudentId() {
        this.studentId = studentId;
    }

    //Overriding toString() method
    @Override
    public String toString() {
        return super.toString() + " student ID: " + studentId;
    }
}
