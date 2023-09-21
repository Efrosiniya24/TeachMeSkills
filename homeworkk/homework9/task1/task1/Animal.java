public abstract class Animal {
    public abstract void voice();

    public void eat(String food){
        if(food.equals("Grass"))
            System.out.println("I like grass)");
        else
            System.out.println("I'm angry(((. Where's grass.......");
    }
}
