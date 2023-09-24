public class Rabbit1 extends Animal1 {
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
