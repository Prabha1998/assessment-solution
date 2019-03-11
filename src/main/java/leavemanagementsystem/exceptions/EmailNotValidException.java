package leavemanagementsystem.exceptions;

public class EmailNotValidException extends Exception {
    public EmailNotValidException() {
        System.out.println("Not a valid email");
    }
}
