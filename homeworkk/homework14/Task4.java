package homework14;

import java.util.function.Consumer;
import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {
//        Задача 4:
//        Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
//        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//        выводить сумму, переведенную сразу в доллары.

        String byn = "25 BYN";
        Consumer<String> convert = x ->{
            String[] sum = x.split(" ");
            double sum1 = Double.parseDouble(sum[0])/3.29;
            System.out.println("25 BYN = " + String.format("%.3f", sum1) + " USD");
        };
       convert.accept(byn);
    }
}
