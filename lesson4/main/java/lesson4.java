import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class lesson4 {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("Выберите задание:");
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
            }
        }
    }

    static void task1(){
//        Задача 1:
//        Сгенерировать 5 случайных чисел. Каждое возвести в квадрат и вывести в консоль.

        double[] num = new double[5];
        for(int i = 0; i<5; i++){
            num[i] = Math.random() *10;
            System.out.println((int) (Math.pow((num[i]),2)) + " ");
        }
    }

    static void task2(){
//        Задача 2:
//        2.1 Создать массив fruits и заполнить его 4 произвольными фруктами.
//        2.2 вывести в консоль второй и четвертый.
//        2.3 вывести в консоль длину массива.
//        2.4 третий фрукт заменить на иной.
//        2.5 проверить результат в консоли.
        //2.1
        String[] fruits  = new String[4];
        String nameOfFruit;
        sc.nextLine();
        System.out.println("Введите название фрукта: ");
        for(int i = 0; i< 4; i++){
            System.out.print((i+1) +") ");
            nameOfFruit = sc.nextLine();
            fruits[i] = nameOfFruit;
       }
        //2.2
        System.out.println("Фрукт под номером 2 -- " + (fruits[1]) + "\nФрукт под номером 4 -- " + fruits[3]);
        //2.3
        System.out.println("Длина массива равна " + fruits.length);
        //2.4
        System.out.print("Поменяйте название фрукта, стоящего под номером 4\n Иной фрукт: ");
        fruits[3] = sc.next();
        System.out.println("\n\n ВЫ успешно поменялии фрукт) Вот все Ваши фрукты:");

        for(int i = 0; i < 4; i++)
            System.out.println((i+1) + ") " + fruits[i]);
    }
    static void task3(){
//        Задача 3:
//        3.1 Создать пустой массив типа double с названием masDouble такого размера, который
//        пользователь вводит с клавиатуры.
//        3.2 Заполнить masDouble рандомными числами, используя Math.random() и вывести его в
//        консоль.
//        3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом и
//        обратном порядке.

        System.out.print("Введите размер массива:");
        int size = sc.nextInt();

        double[] masDouble = new double[size];

        System.out.println("Сформировавшийся массив:");
        for(int i = 0 ; i < size ; i++) {
            masDouble[i] = Math.random() * 10;
            System.out.print(masDouble[i] + " ");
        }

        System.out.println("\nВозведем элементы, стоящие под четным номером в квадрат и выведем массив в прямом порядке:");
        for(int i = 0; i < size; i++) {
            if((i+1) %2 ==0)
                masDouble[i]*= masDouble[i];
            System.out.println(masDouble[i] + " ");

        }

    }
    static void task4(){
//        Посчитайте среднее арифметическое массива
        int[]array = new int[4];
        int sum = 0;

        System.out.print("Массив: ");
        for(int ar: array){
            ar = (int)(Math.random()*10);
            System.out.print(ar  +" ");
            sum+=ar;
        }
        System.out.println("\nСреднее арифметическое массива: "+ (sum/4));


    }
    static void task5(){
//        Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его
//        последнего вхождения в массив.

        int[] array = new int[12];
        System.out.print("Массив: ");

        for(int i = 0; i < 12 ; i++) {
            array[i] = (int) ((Math.random()*30) - 15);
            System.out.print(array[i] + " ");
        }
            int max = array[0];
        for(int i = 1 ; i < 12 ; i++)
            if(array[i] > max)
                max = array[i];
        System.out.println("Максимальный элемент массива: " + max);

    }

    static void task6() {
//        Для проверки остаточных знаний учеников после летних каникул,
//        учитель младших классов решил начинать каждый урок с того, чтобы
//        задавать каждому ученику пример из таблицы умножения, но в классе 15 человек,
//        а примеры среди них не должны повторяться. В помощь учителю напишите программу,
//        которая будет выводить на экран 15 случайных примеров из таблицы умножения
//        (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).
//        При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им
//        подобные пары считать повторяющимися)
        int a;
        int b;
        System.out.println("Примеры из таблицы умножения:");
        boolean [][] num = new boolean[9][9];
        for (int i = 0; i < 15; i++)
            while(true) {
                a = (int) ((Math.random() * 7)+2);
                b = (int) ((Math.random() * 7) + 2);
                if (!num[a][b] && !num[b][a]) {
                    num[a][b] = true;
                    num[b][a] = true;
                    System.out.println(a + "*" + b);
                    break;
                }
            }
    }

    static void task7(){
//        Напишите программу на Java для вставки элемента на выбранную позицию в массив. Выведите итоговый массив

        System.out.print("Введите размер массива:");
        int size= sc.nextInt();

        int[] array = new int[size];
        while(true){
            System.out.print("Введите индекс массива:");
            int index = sc.nextInt();
            System.out.print("Введите элемент: ");
            array[index] = sc.nextInt();

            
        }

    }
}
