package review5.prototype;

public class Package implements IPrototype{

    private String sender;
    private String receiver;
    private String message;

    public Package(){

    }

    public Package(Package target){
        if(target != null){
            this.sender = target.getSender();
            this.receiver = target.getReceiver();
            this.message = target.getMessage();
        }
    }

    @Override
    public IPrototype clone() {
        return new Package(this);
    }

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
