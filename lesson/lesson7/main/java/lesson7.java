import java.util.Scanner;

public class lesson7 {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("\nВыберите задание:\n 1)\n 2)\n 3)Выход");
            int operstion = sc.nextInt();
            switch(operstion) {
                case 1 -> {
                    task1();
                }
                case 2 -> {
                    task2();
                }
                case 3 ->{
                    return ;
                }
            }
        }
    }

    static public void task1(){
//        Задача 1:
//        1.1 Создать классы Dog, Cat, Main и интерфейс Voice c методом doVoice().
//        1.2 В Dog и Cat имплементировать данный интерфейс и реализовать метод doVoice().
//        1.3 В классе Main создать объекты Dog, Cat и вызвать метод doVoice()

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.doVoice();
        dog.doVoice();
    }
    static public void task2(){
//        Задача 2:
//        Создать абстрактный класс Computer и абстрактный метод getClassName(). Создать
//        классы Hp и Mac и отнаследоваться от Computer. Переопределить метод getClassName()
//        в классах-наследниках так, чтобы они выводили сообщения «I’m HP» или «I’m Mac». В
//        методе main класса Main создать объекты классов Hp Mac и вызвать методы для каждого
//        из этих объектов

        Hp hp = new Hp();
        Mac mac = new Mac();

        hp.getClassName();
        mac.getClassName();
    }

}
