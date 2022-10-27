package factoryMethodExample4.kreator;

import factoryMethodExample4.product.HomeWebPage;
import factoryMethodExample4.product.WebPage;

public class HomePageKreator implements Kreator{


    @Override
    public WebPage factoryMethod() {
        return new HomeWebPage();
    }
}
