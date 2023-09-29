package homework11;

public class Regestration {
    private String login;
    private String password;
    private String confirmPassword;

    static boolean regestration(String login, String password, String confirmPassword) throws WrongLoginException {
    if(login.length()>20 && login.contains(" "))
        throw new WrongLoginException();

    if(password.length()>20 && password.contains(" ") && )
    return true;
    }
}
