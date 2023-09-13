import java.util.Scanner;

public class CreditCard {
    private int NumberCard;
    private double sum;

    static Scanner sc=  new Scanner(System.in);

    public CreditCard(int numberCard, double sum) {
        NumberCard = numberCard;
        this.sum = sum;
    }

    public double addSum(){
        System.out.print("Пополните счет: ");
        double addSum = sc.nextDouble();
        this.sum += addSum;
        return sum;
    }

    public double delete(){
        System.out.print("Сколько желаете снять со счета? \nКоличество: ");
        double del = sc.nextDouble();
        this.sum -= del;
        return sum;
    }

    public void view(){

        System.out.print("Счет: " + this.sum +"\nНомер карты: "+ this.NumberCard);
    }

}
