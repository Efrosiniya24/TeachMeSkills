package homework19.Task2;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Задача 2:
//        Сортировка массива цифр в нескольких потоках различными алгоритмами:
//    - сортировка вставками;
//    -сортировка выбором;
//    -сортировка пузырьком.
//        Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
//        результат отсортированных массивов в консоль.

        int array[] = {5,8,9,2,4,1,3,6,7,0};

        BubbleSort bubbleSort = new BubbleSort(array);
        Thread bubble = new Thread(bubbleSort);

        InsertionSort insertionSort = new InsertionSort(array);
        Thread insertion = new Thread(insertionSort);

        SelectionSort selectionSort = new SelectionSort(array);
        Thread selection = new Thread(selectionSort);

        bubble.start();
        insertion.start();
        selection.start();

        bubble.join();
        insertion.join();
        selection.join();

        System.out.println("Сортировка пузырьком: "+ bubbleSort);
        System.out.println("Сортировка выбором: "+ selectionSort );
        System.out.println("Сортировка вставкой: "+ insertionSort);
    }
}
