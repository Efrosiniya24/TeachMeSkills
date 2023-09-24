public class Tiger1 extends Animal1 {
    @Override
    public void voice(){
        System.out.println("\nрррр");
    }
    @Override
    public void eat(String food){
        super.eat(food);
        System.out.println("I'm tiger");
    }
}
