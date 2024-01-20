package homework30Pattern.Builder;

public class House {
    private int floor;
    private String type;
    private String color;
    private int rooms;
    private boolean terrace;

    public House(int floor, String type, String color, int rooms, boolean terrace) {
        this.floor = floor;
        this.type = type;
        this.color = color;
        this.rooms = rooms;
        this.terrace = terrace;
    }

    public int getFloor() {
        return floor;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean isTerrace() {
        return terrace;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor=" + floor +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", rooms=" + rooms +
                ", terrace=" + terrace +
                '}';
    }
}