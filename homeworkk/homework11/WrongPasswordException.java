package homework11;
public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message){
        super(message);
    }

    public WrongPasswordException() {
    }
}
