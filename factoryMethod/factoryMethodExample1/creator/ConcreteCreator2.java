package factoryMethodExample1.creator;

import factoryMethodExample1.products.ConcreteProduct2;
import factoryMethodExample1.products.Product;

public class ConcreteCreator2 implements Creator{


    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
