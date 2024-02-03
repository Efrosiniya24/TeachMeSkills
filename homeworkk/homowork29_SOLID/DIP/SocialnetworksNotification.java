package homowork29_SOLID.DIP;

public class SocialnetworksNotification implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Отправлено уведомление через email");
    }
}
