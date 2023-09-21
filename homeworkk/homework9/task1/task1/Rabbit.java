public class Rabbit extends Animal{
    @Override
    public void voice(){
        System.out.println("\nпфпфпф");
    }

    @Override
    public void eat(String food){
        super.eat(food);
        System.out.println("I'm rabbit");
    }
}
