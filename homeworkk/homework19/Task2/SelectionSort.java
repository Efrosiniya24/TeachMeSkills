package homework19.Task2;

import java.util.Arrays;

public class SelectionSort implements Runnable{
    private int array[];

    public SelectionSort(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "SelectionSort{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public void run() {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            int tmp = array[left];
            array[left] = array[minInd];
            array[minInd] = tmp;
        }
    }
}
