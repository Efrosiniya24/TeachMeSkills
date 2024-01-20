package homework30Pattern.Singleton;

public class main {
    public static void main(String[] args) {
        Earth earth = new Earth();
        Mars mars = new Mars();
        System.out.println("И Земля, и Марс находятся в Солнечной системе?");
        if (earth.getMySun().equals(mars.getMySun())) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
