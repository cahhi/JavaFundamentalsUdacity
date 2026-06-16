package exceptionExample;

public class PhoneExceptionTester {

    public static void main (String[] args){
        //Creating an array of phone numbers in o
        String[] numbers = new String[]{"123-789-4561", null, "123-654-9879", "123-478-5698"};

        for(int i = 0; i < numbers.length; i++){

            //adding a try catch in order to inform what to do if null error is triggered
            try {
                //this is taking each number in the numbers array and creating an iPhone object for the phone type for each object
                System.out.println(new Phone("iPhone", numbers[i]));
            //need to generate an illegal argument exception
            }catch (IllegalArgumentException ex) {
                //Printing out the LocalizedMessage when the Illegal Argument Exception is triggered
                System.out.println(ex.getLocalizedMessage());
            }

        }
    }

}
