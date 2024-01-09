package lesson30.Singleton;

public class Sun {
    private static String date;
    private static Sun sun;
    private Sun (String date){
        this.date = date;
    }
    public static Sun shine(){
        if(sun == null)
            sun = new Sun (date);
        return sun;
    }

    public static String getDate() {
        return date;
    }

    public static void setDate(String date) {
        Sun.date = date;
    }
}
