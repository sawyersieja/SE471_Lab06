//Demo.java
public class Demo {
    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);
        for (int i = 0; i < 10; i++) {
            nc.addItem("notif" + i);
        }
        MediaAttachment media = new MediaAttachment();
        FileAttachment file = new FileAttachment();
        nc.setAttachment(media, 1);
        nc.setAttachment(media, 2);
        nc.setAttachment(media, 3);
        nc.setAttachment(file, 5);
        nc.setAttachment(file, 9);
        //1. create Notifications and add them to nc
        //2. create attachments and link them to notifications in nc
        nb.printNotifications();
    }
}