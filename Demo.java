//Demo.java
public class Demo {
    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);
        //1. create Notifications and add them to nc
        //2. create attachments and link them to notifications in nc
        nb.printNotifications();
    }
}