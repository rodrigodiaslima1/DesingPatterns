package factoryMethodExample2.creator;

import factoryMethodExample2.products.BasicCar;
import factoryMethodExample2.products.Car;

public class BasicCarCreator implements CarCreator{
    @Override
    public Car carFactoryMethod() {
        return new BasicCar();
    }
}
