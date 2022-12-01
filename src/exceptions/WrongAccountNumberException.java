package exceptions;

public class WrongAccountNumberException extends RuntimeException {
    public WrongAccountNumberException(String s) {
        System.out.println(s);
    }
}
