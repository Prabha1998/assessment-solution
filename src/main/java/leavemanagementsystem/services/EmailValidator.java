package leavemanagementsystem.services;

import java.util.regex.Pattern;

public class EmailValidator implements ValidityCheck{
    private static EmailValidator ourInstance = new EmailValidator();

    public static EmailValidator getInstance() {
        return ourInstance;
    }

    private EmailValidator() {
    }

    public boolean isValid(String emailId){

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (emailId == null)
            return false;
        return pat.matcher(emailId).matches();
    }

}
