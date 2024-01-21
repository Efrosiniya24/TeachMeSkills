package homework31Pattern.Adapter;

public class EnglishText implements English {

    @Override
    public void sayGoodDay() {
        System.out.println("Good day!");
    }
}
