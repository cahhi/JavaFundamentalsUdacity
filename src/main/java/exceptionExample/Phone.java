package exceptionExample;

public class Phone {

    public String phoneType;
    public String phoneNumber;

    //Creating the constructor
    public Phone (String phoneType, String phoneNumber){

        //added a conditional statement to make sure that phoneNumber and phoneType are not null
        if (phoneNumber == null | phoneType == null){
            //This is where the "getLocalizedMessage" is coming for when it is called in PhoneExceptionTester file
         throw new IllegalArgumentException("The type and number can not be null");
        }
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    //Setting getters

    public String getPhoneType() {
        return phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Overriding the toString method
    @Override
    public String toString() {
        return "The phone type is " +phoneType + ". The phone number is " +phoneNumber + ".";
    }
}
