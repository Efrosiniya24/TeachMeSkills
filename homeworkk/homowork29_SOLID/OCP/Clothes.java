package homowork29_SOLID.OCP;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Clothes implements product{
    private String size;
    private String color;
    private String model;
    private String type;
    private String gender;
    private String price;
    @Override
    public void setCharacteristic() {
        System.out.println("Укажите размер: ");
        //указать размер
        System.out.println("Укажите цвет: ");
        //указать цвет
        System.out.println("Укажите модель: ");
        //указать модель
        System.out.println("Укажите тип: ");
        //указать тип
        System.out.println("Укажите пол: ");
        //указать пол
    }

    @Override
    public void setPrice() {
        System.out.println("Цена: ");
        //указать цену
    }

}
