package homework31Pattern.Adapter;

public class RussianText implements Russian{
    @Override
    public void sayGoodDay() {
        System.out.println("Хороший день!");
    }
}
