package review.prototype;

public class Client extends User{

    private String username;
    private String password;

    public Client(){}

    public Client(Client target){
        super(target);
        if(target != null){
            this.username = target.getUsername();
            this.password = target.getPassword();
        }
    }

    @Override
    public User clone() {
        return new Client(this);
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
