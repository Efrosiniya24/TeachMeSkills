package homework11;

public class Regestration {
    private String login;
    private String password;
    private String confirmPassword;

    static void regestration(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean t= true;
        if(login.length()>20 || login.contains(" ")) {
            t = false;
            throw new WrongLoginException("Неверно введен логин");
        }

        if(password.length()>20 || password.contains(" ") || !passwordIsDigit(password) || !password.equals(confirmPassword)) {
            t = false;
            throw new WrongPasswordException("Неверно введен пароль");
        }

        System.out.println("Логин и пароль были введены верно)");
    }

    static public boolean passwordIsDigit(String password){
        for(char c: password.toCharArray())
            if(Character.isDigit(c))
                return true;
        return false;
    }
}
