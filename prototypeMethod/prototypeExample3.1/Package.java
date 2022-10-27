package review3.prototype2;

public class Package implements IPrototype<Package> {

    private String sender;
    private String receiver;
    private String content;

    public Package(){}

    public Package(Package target){
        if(target != null){
            this.sender = target.getSender();
            this.receiver = target.getReceiver();
            this.content = target.getContent();
        }
    }

    @Override
    public Package clone() {
        return new Package(this);
    }

    // Getters and setters:


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
