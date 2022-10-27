package factoryMethodExample1.creator;

import factoryMethodExample1.products.ConcreteProduct1;
import factoryMethodExample1.products.Product;

public class ConcreteCreator1 implements Creator{


    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
