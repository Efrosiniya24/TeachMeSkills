package homework30Pattern.Builder;

public class Main {
    public static void main(String[] args) {
        HouseBuilder builder = new HouseBuilder();

        House house = builder.setFloor(2)
                .setType("Villa")
                .setColor("Blue")
                .setRooms(4)
                .setTerrace(true)
                .build();

        System.out.println(house);
    }
}