package pages;

public class HomePage extends BasePage {
    //Constructor
    public HomePage() {
        super(driver);
    }

    // Dynamic Locators:
    private String navigationBarCategory = "//a[@role='button'][normalize-space()='%s' and @href]";


    //Methods
    public void navigateToMacStore() {
        navigateTo("https://www.macstoreonline.com.mx");
    }

    public void selectDeviceCategory(String category) {
        String xpathSection = String.format(navigationBarCategory, category);
        clickElement(xpathSection);
    }

}
