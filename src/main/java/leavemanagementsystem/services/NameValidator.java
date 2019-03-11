package leavemanagementsystem.services;

public class NameValidator implements ValidityCheck {
    private static NameValidator ourInstance = new NameValidator();

    public static NameValidator getInstance() {
        return ourInstance;
    }

    private NameValidator() {
    }


    public boolean isValid(String name){
        return name.length()>50?false:true;
    }
}
