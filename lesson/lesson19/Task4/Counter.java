package lesson19.Task4;

public class Counter {
    private static int count;
    public void increase(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Counter.count = count;
    }
}
