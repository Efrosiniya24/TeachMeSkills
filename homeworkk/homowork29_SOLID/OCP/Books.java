package homowork29_SOLID.OCP;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Books implements product {
    private String name;
    private String author;
    private String cover;
    private String price;

    @Override
    public void setCharacteristic() {
        System.out.println("Укажите название: ");
        //указать название
        System.out.println("Укажите автора: ");
        //указать автора
        System.out.println("Укажите тип обложки: ");
        //указать тип обложки
    }

    @Override
    public void setPrice() {
        System.out.println("Цена: ");
        //указать цену
    }
}
