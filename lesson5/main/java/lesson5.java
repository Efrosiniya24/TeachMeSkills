import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class lesson5 {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        while(true){
            System.out.println("\nВыберите задание:\n 1)\n 2)\n 3)\n 4)\n 5)\n 6)\n 7)\n8)");
            int operstion = sc.nextInt();
            switch(operstion){
                case 1 ->{
                    task1();
                }
                case 2 ->{
                    task2();
                }
                case 3 ->{
                    task3();
                }
                case 4 ->{
                    task4();
                }
                case 5 ->{
                    task5();
                }
                case 6 ->{
                    task6();
                }
                case 7 ->{
                    task7();
                }
                case 8 ->{
                    task8();
                }
            }
        }
    }
    static void task1(){
//        Задача 1:
//        1.1 Создайте двумерный массив и заполните его псевдослучайными числами с помощью
//        класса Random.
//        1.2 Найдите максимальное значение в созданном 2-мерном массиве

        int i = 0;
        while(true) {
            System.out.println("Введите количество строк массива: ");
            try {
                i = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("Введите корректное значение(");
                sc.next();
            }
        }

        int j = 0;
        while(true) {
            System.out.println("Введите количество стобцов массива: ");
            try {
                j = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("Введите корректное значение(");
                sc.next();
            }
        }

        int [][] array = new int[i][j];




       for(int i1 = 0; i1< i; i1++){
           for(int j1 = 0; j1 <j; j1++) {
               array[i1][j1] = random.nextInt(-20, 20);
               System.out.print(array[i1][j1] + " ");
           }
           System.out.println();
       }

        int max  = array[0][0];
        int min  = array[0][0];

        for(int i1 = 0; i1< i; i1++)
            for(int j1 = 0; j1 <j; j1++) {
                if( array[i1][j1] > max)
                    max = array[i1][j1];
                if(array[i1][j1] < min)
                    min = array[i1][j1];
            }

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
    }
    static void task2(){
//        Задача 2:
//        Создать зубчатый n-мерный массив(от 3 уровней). Посчитать количество ячеек в нём.

        int i = 0;
        while(true) {
            System.out.println("Введите количество строк массива: ");
            try {
                i = sc.nextInt();
                if(i<4) {
                    System.out.print("Количество строк должно быть больше 3( ПОвторите ввод:");
                    sc.next();
                }
                else break;
            }catch(InputMismatchException e){
                System.out.println("Введите корректное значение(");
                sc.next();
            }
        }

        int [][] array = new int[i][];
        for(int i1 = 0 ; i1<i; i1++ ) {
            array[i1] = new int[i1 + 1];
            for (int j = 0; j < i1 + 1; j++) {
                array[i1][j] = random.nextInt(-20, 20);
                System.out.print(array[i1][j] + " ");
            }
            System.out.println();
        }

}

    static void task3(){
//        Задача 3:
//        Найдите сумму элементов на главной диагонали:

        int size = 0;
        int sum = 0;
        while(true) {
            System.out.println("Введите количество строк и столбцов квадратной матрицы: ");
            try {
                size = sc.nextInt();
                if(size<3) {
                    System.out.print("Количество строк и столбцов должно быть больше 2( ПОвторите ввод:");
                    sc.next();
                }
                else break;
            }catch(InputMismatchException e){
                System.out.println("Введите корректное значение(");
                sc.next();
            }
        }

        int [][] array = new int [size][size];
        System.out.println("Матрица: ");
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(-20, 20);
                if (i == j)
                    sum += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Сумма элементов на главной диагонали равна "  + sum);

    }
    static void task4(){
//        Вывести на экран матрицу m*n вида:
//
//        4, 3, 2, 1
//        8, 7, 6, 5,
//        12,11,10, 9


        int [][] array = new int[3][4];
        int i =3;
        int j = 4;
        int counter = 1;
        for(int i1 = 0; i1 < i; i1++) {
            for (int j1 = j-1; j1 > -1; j1--) {
                array[i1][j1] = counter;
                counter++;
            }
            System.out.println();
        }

        for(int i1 = 0; i1 <i; i1++) {
            for (int j1 = 0; j1 < j; j1++)
                System.out.print(array[i1][j1]+" ");
            System.out.println();
        }
    }
    static void task5(){
//        Вывести на экран матрицу m*n вида:
//        1, 4, 7
//        2, 5, 8
//        3, 6, 9

        int i =3;
        int j = 3;
        int [][] array = new int[i][j];
        int counter = 1;

        for (int j1 = 0; j1 < j; j1++){
             for(int i1 = 0; i1 < i; i1++) {
                array[i1][j1] = counter;
                counter++;
            }
            System.out.println();
        }

        for(int i1 = 0; i1 <i; i1++) {
            for (int j1 = 0; j1 < j; j1++)
                System.out.print(array[i1][j1]+" ");
            System.out.println();
        }
    }
    static void task6(){
//        Дан массив из символов и пробелов. Заменить все пробелы на последовательность символов '%', '2', '0' .
//        Порядок сохранить, в массиве достаточно места, чтобы все вместилось. Вернуть конечную длину
//        массива и сам массив изменить, не делать новый.

        char[] array =new char[11];
        array[0] = 'c';
        array[1] = '1';
        array[2] = ' ';
        array[3] = 'g';
        array[4] = ' ';
        array[5] =  '3';

        for()
//        int counter= 0;

//        for(int i = array.length; array[i] == ' '; i++) counter++;
//        System.out.println(counter);
//
//        for(int i = array.length -1; i >-1; i--){
//            if(array[i] == ' ') {
//                for (int j = i, u = counter - 1; u != i; j++, u--)
//                    array[u + 3] = array[u];
//                array[i] = '%';
//                array[i++] = '2';
//                array[i+2] = '0';
//                i+=3;
//            }
//        }
//        for (char c : array) System.out.print(c + " ");





    }
    static void task7(){

    }
    static void task8(){

    }

}



