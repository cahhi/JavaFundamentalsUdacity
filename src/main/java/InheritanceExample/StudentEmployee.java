package InheritanceExample;

public class StudentEmployee extends Student {

    private double rateOfPayPerHour;
    private String employeeId;

    //Constructor that sets the variables and super class variables
    public StudentEmployee(double rateOfPayPerHour, String employeeId, String studentId, String firstName, String lastName) {
        super(studentId, firstName, lastName);
        this.rateOfPayPerHour = rateOfPayPerHour;
        this.employeeId = employeeId;
    }

    //Created getters and setters below
    public double getRateOfPayPerHour() {
        return rateOfPayPerHour;
    }

    public void setRateOfPayPerHour(double rateOfPayPerHour) {
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    //Override the toString
    public String toString() {
        return super.toString() + " employee ID: " + employeeId + " Pay Rate: " + rateOfPayPerHour;
    }
}
