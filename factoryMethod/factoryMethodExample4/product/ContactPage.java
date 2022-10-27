package factoryMethodExample4.product;

public class ContactPage implements WebPage{

    private final String URL = "website.com/contact";
    private final String CONTENT = "=== Contact Page Content ===";

    @Override
    public String defineUrl() {
        return getURL();
    }

    @Override
    public String defineContent() {
        return getCONTENT();
    }

    //Getters and Setters


    public String getURL() {
        return URL;
    }

    public String getCONTENT() {
        return CONTENT;
    }
}
