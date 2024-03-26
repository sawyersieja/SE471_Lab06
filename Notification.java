//Notification.java
public class Notification {
    private final String content;
    private Attachment attachment = null;

    public Notification(String content){
        this.content = content;
    }
    
    public String getContent(){
        return content;
    }

    public void setAttachment(Attachment a){
        this.attachment = a;
    }
}