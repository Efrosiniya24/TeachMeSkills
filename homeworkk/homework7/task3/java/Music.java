public class Music implements Cloneable {
    private String name;
    private String author;
    private double time;

    public Music(String name, String author, double time) {
        this.name = name;
        this.author = author;
        this.time = time;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getTime() {
        return this.time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return (Music) super.clone();
    }


}
