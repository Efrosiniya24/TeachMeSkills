package lesson19.Task3;

public class Child implements Runnable{
    @Override
    public void run(){
    for(int i=1;i<=100;i++)
        System.out.println(i);
    }
}
