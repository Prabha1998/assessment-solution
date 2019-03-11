package leavemanagementsystem.exceptions;

public class NameNotValidException extends Exception {
    public NameNotValidException() {
        System.out.println("Name more than 50 characters not valid");
    }
}
