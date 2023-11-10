package homework19.Task1;

import com.sun.nio.sctp.SctpMultiChannel;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //    Задача 1:
//    Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
//    потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
//    вычислений возвращаются в метод main().
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Введите элементы массива");
        for (int i = 0; i <array.length; i++){
            System.out.print((i+1)+" элемент: ");
            try {
                array[i] = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Введите число");
            }
        }

        MaxElement maxElement = new MaxElement(array);
        Thread max = new Thread(maxElement);

        MinElement minElement = new MinElement(array);
        Thread min = new Thread(minElement);

        max.start();
        min.start();

        max.join();
        min.join();

        System.out.println("Максимальный элемент массива: " + maxElement.getMax());
        System.out.println("Минимальный элемент массива: " + minElement.getMin());
    }
}
