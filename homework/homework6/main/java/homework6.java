import java.util.InputMismatchException;
import java.util.Scanner;

public class homework6 {
//    Задача 1:
//    Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
//    метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
//    который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
//    выводит текущую информацию о карточке. Напишите программу, которая создает три
//    объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//    Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
//    третьей. Выведите на экран текущее состояние всех трех карточек.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation1 = 0;
        int operation2 = 0;

        CreditCard[] creditCard = new CreditCard[3];
        creditCard[0] = new CreditCard(37462782, 365);
        creditCard[1] = new CreditCard(39746328, 947);
        creditCard[2] = new CreditCard(23563445, 634);
        while(true){
            while(true){
                System.out.println("\nВыберите карточку:\n 1)\n 2)\n 3)");
                try{
                    operation1 = sc.nextInt();
                    if(operation1 >0 && operation1 <4)
                        break;
                }catch(InputMismatchException e){
                    System.out.print("Ошибка ввода( Повторите ввод: ");
                    sc.next();
                }
            }
            while(true) {
                System.out.println("Меню:\n 1)Пополнить счет\n 2)Снять деньги со счета\n 3)Посмотреть информацию о карточке\n 4)Выход");
                try {
                    operation2 = sc.nextInt();
                    if (operation2 > 0 && operation2 < 5)
                        break;
                } catch (InputMismatchException e) {
                    System.out.print("Ошибка ввода( Повторите ввод: ");
                    sc.next();
                }
            }
            switch (operation2) {
                case 1 -> {
                    creditCard[operation1 - 1].addSum();
                }
                case 2 -> {
                    creditCard[operation1 - 1].delete();
                }
                case 3 -> {
                    creditCard[operation1 - 1].view();
                }
                case 4 -> {
                }
            }
        }
    }
}
