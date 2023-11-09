package lesson19.Task4;

import java.util.concurrent.TransferQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Задача 4:
//        Создать класс Counter с полем count и методом increase() который увеличивает count на
//        1. Создать второй класс CounterThread с интерфейсом Runnable, полем Counter и
//        конструктором, который инициализирует поле Counter. Метод run() должен иметь
//        следующую логику:
//        @Override
//        public void run() {
//            counter.setCount(1);
//            for (int i = 0; i < 4; i++) {
//                System.out.println(counter.getCount());
//                counter.increase();
//            }
//        }
//        В main методе создать объект Counter. Создать 5 потоков которые будут использовать в
//        конструкторе объект Counter. Запустить все 5 потоков и посмотреть результат. Исправить
//        код чтобы он выводил ожидаемый результат(1,2,3,4,1,2,3,4,1 и тд)

        Counter counter = new Counter();
        CounterThread counterThread = new CounterThread(counter);
        Thread thread1 = new Thread(counterThread);
        Thread thread2 = new Thread(counterThread);
        Thread thread3 = new Thread(counterThread);
        Thread thread4 = new Thread(counterThread);
        Thread thread5 = new Thread(counterThread);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();

    }
}
