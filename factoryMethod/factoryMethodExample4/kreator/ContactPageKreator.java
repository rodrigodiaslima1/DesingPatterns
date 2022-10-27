package factoryMethodExample4.kreator;

import factoryMethodExample4.product.ContactPage;
import factoryMethodExample4.product.WebPage;

import java.util.Scanner;

import java.awt.*;

public class ContactPageKreator implements Kreator{

    @Override
    public WebPage factoryMethod() {
        return new ContactPage();
    }
}
