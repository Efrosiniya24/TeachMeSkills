import java.util.InputMismatchException;
import java.util.Scanner;

public class homework5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int operation = 0;
        while (true) {
            System.out.println("\nВыберите задание:\n 1)\n 2)\n 3)");

            try {
                operation = sc.nextInt();
            } catch (InputMismatchException e) {
            }
            switch (operation) {
                case 1 -> {
                    task1();
                }
                case 2 -> {
                    task2();
                }
                case 3 -> {
                    task3();
                }
            }
        }
    }

    static void task1(){
//        Задача 1:
//        1.1 Создать двумерный массив, заполнить его случайными числами.
//        1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
//        1.3 Найти сумму всех получившихся элементов и вывести в консоль.

        int i = 0;
        System.out.print("Введите количество строк:");
        try{
            i = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.print("Некорректный ввод данных( Повторите ввод:");
            sc.next();
        }

        int j = 0;
        System.out.print("Введите количество столбцов:");
        try{
            j = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.print("Некорректный ввод данных( Повторите ввод:");
            sc.next();
        }


        System.out.print("На сколько желаете увеличить размер массива: ");
        int add = 0;
        try{
            add = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.print("Некорректный ввод данных( Повторите ввод:");
            sc.next();
        }

        int sum = 0;
        int[][] array = new int[i][j];

        System.out.println("Исходный массив: ");
        for (int i1 = 0;i1 <i; i1++){
            for(int j1 = 0; j1< j; j1++) {
                array[i1][j1] = (int) (Math.random() * 20);
                System.out.print(array[i1][j1] + " ");
            }
            System.out.println();
        }

        System.out.println("\nИзмененный массив: ");
        for (int i1 = 0;i1 <i; i1++){
            for(int j1 = 0; j1< j; j1++) {
                array[i1][j1]+=add;
                sum+=array[i1][j1];
                System.out.print(array[i1][j1] + " ");
            }
            System.out.println();
        }


        System.out.print("\nСумма получившехся элементов массива:" + sum);
    }
    static void task2(){
//        Задача 2:
//        Создать программу для раскраски шахматной доски с помощью цикла. Создать
//        двумерный массив String 8х8. С помощью циклов задать элементам массива значения
//        B(Black) или W(White). При выводе результат работы программы должен быть следующим:
//        W B W B W B W B
//        B W B W B W B W
//        W B W B W B W B
//        B W B W B W B W
//        W B W B W B W B
//        B W B W B W B W
//        W B W B W B W B
//        B W B W B W B W

       String[][]array = new String[8][8];

        for(int i = 0; i<8; i++){
            for(int j =0; j<8; j++)
                if((i+j) %2 ==0)
                    System.out.print("W"+ " ");
                else
                    System.out.print("B" + " ");
            System.out.println();
        }
    }
    static void task3(){
//        Задача *:
//        Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
//                Формат входных данных:
//        Программа получает на вход два числа n и m.
//                Формат выходных данных:
//        Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
//        символа

        int n = 0;
        System.out.print("Введите количество строк:");
        try{
            n = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.print("Некорректный ввод данных( Повторите ввод:");
            sc.next();
        }

        int m = 0;
        System.out.print("Введите количество столбцов:");
        try{
            m = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.print("Некорректный ввод данных( Повторите ввод:");
            sc.next();
        }

        int[][] A = new int[n][m];
        int counter = 0;
        for(int i =0; i <n; i++){
            for(int j = 0; j<m; j++) {
                if(i %2 == 0) {
                    A[i][j] = counter;
                    counter++;
                }
                else
                    A[i][j] = (counter-1)+m-j;
                System.out.print(A[i][j]+" ");
            }
            if(i %2 != 0)
                counter = A[i][0]+1;
            System.out.println();
        }
    }
}
