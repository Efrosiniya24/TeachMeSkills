//public class homework10Main {
//
//        public static void main(String[]args){
//
////        5. Вывести на консоль новую строку, которой задублирована каждая буква из
////        начальной строки. Например, "Hello" -> "HHeelllloo".
////                Задача *:
////        Дана строка произвольной длины с произвольными словами. Написать программу для
////        проверки является ли любое выбранное слово в строке палиндромом.
////                Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
////        слово в этой строке палиндромом.
////                Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например,
////                в строке 5 слов, а на вход программе передали число 500
//
//            Scanner sc=new Scanner(System.in);
//            int operation=0;
//            while(true){
//                System.out.println("\nВыберите задание:\n 1)\n 2)\n 3)\n 4)\n 5)\n 6)");
//                try{
//                    operation=sc.nextInt();
//                }catch(InputMismatchException e){
//                }
//                switch(operation){
//                    case 1->{
//                        task1();
//                    }
//                    case 2->{
//                        task2();
//                    }
//                    case 3->{
//                        task3();
//                    }
//                    case 4->{
//                        task4();
//                    }
//                    case 5->{
//                        // task5();
//                    }
//                    case 6->{
//                        //task6();
//                    }
//                }
//            }
//        }
//
//        static void task1(){
//            //        1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
////        найденные строки и их длину.
//
//            Scanner sc=new Scanner(System.in);
//            String[]line=new String[3];
//
//            System.out.print("Введите первую строку: ");
//            line[0]=sc.nextLine();
//
//            System.out.print("Введите вторую строку: ");
//            line[1]=sc.nextLine();
//
//            System.out.print("Введите третью строку: ");
//            line[2]=sc.nextLine();
//
//            int max=line[0].length();
//            int min=line[0].length();
//
//            int maxIndex=0;
//            int minIndex=0;
//
//            for(int i=0;i<2;i++){
//                if(line[i].length()>max){
//                    max=line[i].length();
//                    maxIndex=i;
//                }
//                if(line[i].length()<min){
//                    min=line[i].length();
//                    minIndex=i;
//                }
//            }
//
//            for(int i=0;i<3;i++)
//                System.out.println("Строка "+(i+1)+": "+line[i]+" имеет длину "+line[i].length()+" символов");
//
//            System.out.println("Самая кроткая стррока: "+line[minIndex]);
//            System.out.println("Самая длинная стррока: "+line[maxIndex]);
//
//        }
//
//        static void task2(){
//            //        2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
////        значений их длины.
//
//            Scanner sc=new Scanner(System.in);
//            String[]line=new String[3];
//
//            for(int i=0;i<3;i++){
//                System.out.print("Введите строку №"+(i+1)+": ");
//                line[i]=sc.nextLine();
//            }
//
//            System.out.println("Строки в порядке возрастагия их длины: ");
//            String temp="";
//            for(int i=0;i<3;i++){
//                for(int j=i;j< 3;j++)
//                    if(line[j].length()<line[i].length()){
//                        temp=line[i];
//                        line[i]=line[j];
//                        line[j]=temp;
//                    }
//                System.out.println(line[i]);
//            }
//        }
//
//        static void task3(){
//            //        3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
//            //        средней, а также их длину.
//
//            Scanner sc=new Scanner(System.in);
//            String[]line=new String[3];
//            int[]lenghtLine=new int[3];
//
//            for(int i=0;i<3;i++){
//                System.out.print("Введите строку №"+(i+1)+": ");
//                line[i]=sc.nextLine();
//                lenghtLine[i]=line[i].length();
//            }
//
//            String temp="";
//            for(int i=0;i<3;i++){
//                for(int j=i;j< 3;j++)
//                    if(line[j].length()<line[i].length()){
//                        temp=line[i];
//                        line[i]=line[j];
//                        line[j]=temp;
//                    }
//            }
//
//            System.out.println("Строки длинная которых меньше средней");
//            for(int i=0;!(line[i].equals(temp));i++)
//                System.out.println(line[i]);
//        }
//
//        static void task4(){
////        4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
////        Если таких слов несколько, найти первое из них.
//
//            Scanner sc=new Scanner(System.in);
//            boolean t=true;
//            String[]line=new String[3];
//
//            for(int i=0;i<3;i++){
//                System.out.print("Введите строку №"+(i+1)+": ");
//                line[i]=sc.nextLine();
//            }
//
//            for(int i=0;i<3;i++){
//                String[]l=line[i].split("");
//                for(int j=0;j<line[i].length();j++)
//                    for(int k=j+1;k<line[i].length();k++)
//                        if(l[k].equals(l[j]))
//                            t=false;
//                if(t){
//                    System.out.println("Слово, состоящее только из различных символов: "+l);
//                    return;
//                }
//            }
//            System.out.println("Нет слов, состоящих только из различных символов: ");
//        }
//    }
