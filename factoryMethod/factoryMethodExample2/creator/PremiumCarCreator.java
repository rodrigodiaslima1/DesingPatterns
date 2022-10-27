package factoryMethodExample2.creator;

import factoryMethodExample2.products.Car;
import factoryMethodExample2.products.PremiumCar;

public class PremiumCarCreator implements CarCreator{


    @Override
    public Car carFactoryMethod() {
        return new PremiumCar();
    }
}
