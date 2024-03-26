//NotificationCollection.java

import java.util.ArrayList;
import java.util.List;

public class NotificationCollection implements NotificationCollectionIF{
    private List<Notification> notifs = new ArrayList<>();
    
    public Notification getItem(int index){
        return notifs.get(index);
    }

    public void addItem(String str){
        notifs.add(new Notification(str));
    }

    public int getLength(){
        return notifs.size();
    }

    public void setAttachment(Attachment a, int index){
        getItem(index).setAttachment(a);
    }

    @Override
    public NotificationIteratorIF createIterator() {
        return new NotificationIterator(this);
    }
}
