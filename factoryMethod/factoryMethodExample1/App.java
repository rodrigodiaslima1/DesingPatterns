package factoryMethodExample1;

import factoryMethodExample1.creator.ConcreteCreator1;
import factoryMethodExample1.creator.ConcreteCreator2;
import factoryMethodExample1.creator.Creator;
import factoryMethodExample1.products.Product;

public class App {

    public static void main(String[] args){

        Creator creatorInstance1 = new ConcreteCreator1();
        Creator creatorInstance2 = new ConcreteCreator2();

        Product product1 = creatorInstance1.factoryMethod();
        Product product2 = creatorInstance2.factoryMethod();

        System.out.println("===> Product 1:");
        product1.method1();
        product1.method1();

        System.out.println("\n===> Product 2:");
        product2.method1();
        product2.method2();
    }

}
