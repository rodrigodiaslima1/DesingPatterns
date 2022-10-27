package review.prototype;

public class User implements IPrototype{

    private String data1;
    private String data2;
    private String data3;

    public User(){

    }

    public User(User target){
        if(target != null){
            this.data1 = target.getData1();
            this.data2 = target.getData2();
            this.data3 = target.getData3();
        }
    }

    @Override
    public User clone() {
        return null;
    }


    // Getters and Setters
    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public String getData3() {
        return data3;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }
}
