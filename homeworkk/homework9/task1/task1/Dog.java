public class Dog extends Animal1 {
    @Override
    public void voice(){
        System.out.println("\nГав");
    }
    @Override
    public void eat(String food){
        super.eat(food);
        System.out.println("I'm dog");
    }

    public Dog() {
    }
}
