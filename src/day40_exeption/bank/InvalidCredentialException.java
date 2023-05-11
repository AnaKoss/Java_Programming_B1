package day40_exeption.bank;

public class InvalidCredentialException extends Exception {
public InvalidCredentialException (String msg){
    super(msg);
}
}
