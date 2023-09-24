public class Dog1 extends Animal1 {
    @Override
    public void voice(){
        System.out.println("\nГав");
    }
    @Override
    public void eat(String food){
        super.eat(food);
        System.out.println("I'm dog");
    }

    private Dog1() {
    }

    public static Dog1 create(){
        return new Dog1();
    }
}
