package homework30Pattern.Singleton;

public class Mars {
    private SunSingleton mySun;

    public SunSingleton getMySun() {
        return SunSingleton.getSun();
    }
}
