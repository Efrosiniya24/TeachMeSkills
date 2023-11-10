package homework19.Task2;

import java.util.Arrays;

public class InsertionSort implements Runnable {
    private int array[];

    public InsertionSort(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "InsertionSort{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public void run() {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else
                    break;
            }
            array[i + 1] = value;
        }
    }
}
