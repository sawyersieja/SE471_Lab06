//FileAttachment.java
public class FileAttachment extends Attachment {
    
    private int size_Byte;

    public String toString(){ 
        String sizeByteString = Integer.toString(size_Byte);
        return sizeByteString;
    }
}
