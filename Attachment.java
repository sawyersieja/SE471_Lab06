//Attachment.java
public abstract class Attachment {
        
    private int uniqueID;
    private String author;

    public void preview() {
        System.out.printf("%d: by %s. %s", uniqueID, author, toString());
        //Not sure what we're supposed to put here...
        //I think some people said preview attachment.
        //Does that mean to literally just println uniqueID, author, any any other relevant info?
    }
}