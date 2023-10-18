package homework14;

import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
//        Задача 3:
//        Используя Function реализовать лямбду, которая будет принимать в себя строку в
//        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//        возвращать сумму, переведенную сразу в доллары.
        String byn = "25 BYN";
        Function<String, Double> convert = x ->{
            String[] sum = x.split(" ");
            return Double.parseDouble(sum[0])/3.29;
        };
        System.out.println("25 BYN = " + String.format("%.3f",convert.apply(byn)) + " USD");
    }
}
