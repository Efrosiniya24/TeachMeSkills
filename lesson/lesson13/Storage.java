package lesson13;

public class Storage <T> {
    private T num;

    public Storage() {
    }

    public Storage(T num) {
        this.num = num;
    }

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "num=" + num +
                '}';
    }
}
