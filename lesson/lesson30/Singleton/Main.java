package lesson30.Singleton;

public class Main {
    public static void main(String[] args) {
        Sun sun = Sun.shine();
        Sun.setDate("12/12/2023");
        System.out.println(Sun.getDate());
        Sun newSun = Sun.shine();

    }
}
