package homework19.Task2;

import java.util.Arrays;

public class BubbleSort implements Runnable{
    private int array[];

    public BubbleSort(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "BubbleSort{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public void run() {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int tmp = array[i];
                array[i] = array[i-1];
                array[i-1] = tmp;
            }
        }
    }
}
