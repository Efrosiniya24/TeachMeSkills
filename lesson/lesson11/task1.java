package lesson11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
//        Задача 1:
//        1.1 Написать код, который выбросит ArrayIndexOutOfBoundException. Обработать
//        используя try-catch конструкцию.
//        1.2 Добавить обработку арифметического исключения к предыдущему блоку try-catch
//        используя множественные операторы.
//        1.3 Преобразовать множественные try-catch в мульти обработчик

        Scanner sc = new Scanner(System.in);
        int p = 0;
        int[] array = new int[3];
        for (int i = 0; i < 3; i++)
            array[i] = i;
        while (true) {
            System.out.print("Выберите элемент массива, который Вы желаете приравнять к 1: ");
            try {
                p = sc.nextInt();
                array[p] = 1;
                System.out.println("разделим этот элемент на 0");
                System.out.println(array[p] / 0);
                break;
            } catch (ArrayIndexOutOfBoundsException | InputMismatchException | ArithmeticException e) {
                System.out.print("\nОшибка \n");

//            }
//            }catch (ArrayIndexOutOfBoundsException  e) {
//                System.out.print("\nВы вышли за пределы массива. Введите исло от 0 до 3");
//            }catch (InputMismatchException e) {
//                System.out.println("Введите целое число");
//                sc.next();
//            } catch(ArithmeticException e){
//                System.out.println("Арифмическая ошибка");
//                sc.next();
//                break;
//            }
            }
            for (int i = 0; i < 3; i++)
                System.out.println(array[i]);
        }

    }
}
