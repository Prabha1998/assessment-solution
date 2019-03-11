package leavemanagementsystem.model.employee;

import leavemanagementsystem.services.EmailValidator;
import leavemanagementsystem.services.ValidityCheck;
import leavemanagementsystem.exceptions.EmailNotValidException;

import java.util.regex.Pattern;

public class EmailId implements ValidityCheck {
    String emailId;


    EmailId(String emailId) throws EmailNotValidException {
        if(EmailValidator.getInstance().isValid(emailId)){
            this.emailId=emailId;
        }
        else{
            throw new EmailNotValidException();
        }
    }

}
