package factoryMethodExample2;

import factoryMethodExample2.creator.BasicCarCreator;
import factoryMethodExample2.creator.PremiumCarCreator;
import factoryMethodExample2.products.Car;

public class App {

    public static void main(String[] args){

        BasicCarCreator basicCarFactory = new BasicCarCreator();
        Car basicCar1 = basicCarFactory.carFactoryMethod();
        Car basicCar2 = basicCarFactory.carFactoryMethod();

        System.out.println(basicCar1);
        System.out.println(basicCar2);

        PremiumCarCreator premiumCarFactory = new PremiumCarCreator();
        Car premiumCar1 = premiumCarFactory.carFactoryMethod();
        Car premiumCar2 = premiumCarFactory.carFactoryMethod();

        System.out.println(premiumCar1);
        System.out.println(premiumCar2);

    }

}
