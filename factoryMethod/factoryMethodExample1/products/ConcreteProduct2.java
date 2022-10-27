package factoryMethodExample1.products;

public class ConcreteProduct2 implements Product {

    @Override
    public void method1(){
        System.out.println("ConcreteProduct 2 -> Method 1");
    }

    @Override
    public void method2(){
        System.out.println("ConcreteProduct 2 -> Method 2");
    }

}
