//NotificationBar.java
public class NotificationBar {
    
    private final NotificationCollectionIF notifications;
    public NotificationBar(NotificationCollectionIF notifs) {
        notifications = notifs;
    }
    public void printNotifications()
    {
        NotificationIteratorIF iterator = notifications.createIterator();
        while(iterator.hasNext()){
            Notification n = iterator.next();
            System.out.println(n.getContent());
        }
    }
}
