public class main11 {
    public static void main(String[] args) {
//        Задача 1:
//        Создать класс Build с одним полем type. Создать 2-х наследников этого класса – House и
//        Garage, в которых при создании в конструкторе будет присваиваться в поле type значения
//“House” и “Garage” соответственно. В методе main другого класса создать объекты House
//        и Garage классов. Продемонстрировать значения полей этих классов используя геттеры.

        Build house = new House("House");
        Build garage = new Garage("Garage");
        System.out.println("Значение поля класса House: " + house.getType());
        System.out.println("Значение поля класса Garage: " + garage.getType());
    }
}
