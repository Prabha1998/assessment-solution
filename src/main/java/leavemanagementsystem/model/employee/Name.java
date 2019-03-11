package leavemanagementsystem.model.employee;

import leavemanagementsystem.exceptions.NameNotValidException;
import leavemanagementsystem.services.NameValidator;
import leavemanagementsystem.services.ValidityCheck;

public class Name implements ValidityCheck {


    private String name;


    Name(String name) throws NameNotValidException{
        if(NameValidator.getInstance().isValid(name)){
            this.name=name;
        }
        else{
            throw  new NameNotValidException();
        }
    }

}
