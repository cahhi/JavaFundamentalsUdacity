package exceptionExample;

public class Phone {

    public String phoneType;
    public String phoneNumber;

    //Creating the constructor
    public Phone (String phoneType, String phoneNumber){

        //added a conditional statement to make sure that phoneNumber and phoneType are not null
        if (phoneNumber == null | phoneType == null){
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
}
