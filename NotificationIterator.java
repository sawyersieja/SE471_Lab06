//NotificationIterator.java
public class NotificationIterator implements NotificationIteratorIF{

    private final NotificationCollection collection;
    private int index = 0;
    public NotificationIterator(NotificationCollection collection) {
        this.collection = collection;
    }
    @Override
    public boolean hasNext() {
        return index < collection.getLength();
    }

    @Override
    public Notification next() {
        return collection.getItem(index++);
    }

}
