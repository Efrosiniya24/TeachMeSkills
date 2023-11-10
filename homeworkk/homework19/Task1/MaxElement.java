package homework19.Task1;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxElement implements Runnable{
    private int[] array;
    private int max;

    public MaxElement(int[] array) {
        this.array = array;
    }
    public int getMax() {
        return max;
    }
    @Override
    public void run() {
      max = Arrays.stream(array).max().orElse(Integer.MAX_VALUE);
    }

}
