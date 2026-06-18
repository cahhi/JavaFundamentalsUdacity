package regExample;

import java.util.regex.Pattern;

public class RegExTester {

    public static void main (String[] args){
        String emailRegex = "^(.+)@(.+).(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        String email = "jeff@gmail.com";

        //will check if the string email matches the emailRegex pattern
        System.out.println(pattern.matcher(email).matches());
    }
}
