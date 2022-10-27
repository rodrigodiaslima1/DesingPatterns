package factoryMethodExample4;

import factoryMethodExample4.kreator.ContactPageKreator;
import factoryMethodExample4.kreator.HomePageKreator;
import factoryMethodExample4.product.ContactPage;
import factoryMethodExample4.product.HomeWebPage;
import factoryMethodExample4.product.WebPage;

public class App {

    public static void main(String[] args){

        HomePageKreator homePageKreator = new HomePageKreator();
        ContactPageKreator contactPageKreator = new ContactPageKreator();

        HomeWebPage homePage = (HomeWebPage) homePageKreator.factoryMethod();
        ContactPage contactPage = (ContactPage) contactPageKreator.factoryMethod();

        System.out.println("===> Home Page:");
        System.out.println("URL: " + homePage.getURL());
        System.out.println("CONTENT: " + homePage.getCONTENT());

        System.out.println("\n===> Contact Page:");
        System.out.println("URL:" + contactPage.getURL());
        System.out.println("CONTENT: " + contactPage.getCONTENT());
    }

}
