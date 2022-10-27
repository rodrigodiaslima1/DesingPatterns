package review2.prototype;

public class Package extends CloneClass {

    private String sender;
    private String receiver;

    public Package(){};

    public Package(Package target){
        super(target);
        if(target != null){
            this.sender = target.getSender();
            this.receiver = target.getReceiver();
        }
    }

    @Override
    public Package clone() {
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
}
