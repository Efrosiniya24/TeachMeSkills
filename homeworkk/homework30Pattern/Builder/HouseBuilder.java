package homework30Pattern.Builder;

public class HouseBuilder {
    private int floor;
    private String type;
    private String color;
    private int rooms;
    private boolean terrace;

    public HouseBuilder() {
    }

    public HouseBuilder setFloor(int floor) {
        this.floor = floor;
        return this;
    }

    public HouseBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public HouseBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public HouseBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public HouseBuilder setTerrace(boolean terrace) {
        this.terrace = terrace;
        return this;
    }

    public House build() {
        return new House(floor, type, color, rooms, terrace);
    }
}