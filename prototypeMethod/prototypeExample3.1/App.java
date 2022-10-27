package review3.prototype2;

public class App {

    public static void main(String[] args){

        Package package1 = new Package();
        package1.setSender("Rodrigo");
        package1.setReceiver("Elza");
        package1.setContent("Hello, mother!");

        Package package2 = package1.clone();

        System.out.println("=> Package1:");
        System.out.println(package1.getSender());
        System.out.println(package1.getReceiver());
        System.out.println(package1.getContent());

        System.out.println("\n=> Package2:");
        System.out.println(package2.getSender());
        System.out.println(package2.getReceiver());
        System.out.println(package2.getContent());


    }

}
