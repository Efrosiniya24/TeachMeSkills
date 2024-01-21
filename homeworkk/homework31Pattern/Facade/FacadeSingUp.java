package homework31Pattern.Facade;

public class FacadeSingUp {
    private SignUp signUp;

    public FacadeSingUp() {
        signUp = new SignUp();
    }

    public void singUpp(){
        signUp.fio();
        signUp.email();
        signUp.phone();
        signUp.login();
        signUp.password();
        signUp.check();
    }
}
