package lesson19.Task1;

public class Child extends  Thread{

    public void run(){
    for(int i=1;i<=100;i++)
        System.out.println(i);
    }
}
