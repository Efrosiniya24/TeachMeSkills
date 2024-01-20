package homework30Pattern.Singleton;

public class Earth {
    private SunSingleton mySun;

    public SunSingleton getMySun() {
        return SunSingleton.getSun();
    }
}
