package factoryMethodExample4.product;

public class HomeWebPage implements WebPage {

    private final String URL = "website.com/homepage";
    private final String CONTENT = "=== HOME PAGE ===";


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


