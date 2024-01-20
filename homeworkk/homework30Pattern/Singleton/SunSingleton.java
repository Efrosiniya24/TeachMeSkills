package homework30Pattern.Singleton;

public class SunSingleton {
    private static SunSingleton sun;

    private SunSingleton() {
    }

    public static SunSingleton getSun() {
        if(sun == null)
            sun =  new SunSingleton();
        return sun;
    }
}
