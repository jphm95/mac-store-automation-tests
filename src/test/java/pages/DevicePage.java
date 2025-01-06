package pages;

public class DevicePage extends BasePage {
    public DevicePage() {
        super(driver);
    }

    //Dynamic Locators:
    private String deviceModel = "//h2[normalize-space()='%s']";
    private String comprarButton = "//a[@id='comprarLink']";
    private String screenSize = "//li[normalize-space()='%s']";
    private String deviceColor = "//li[contains(@class, '%s')]";
    private String deviceStorage = "//li[normalize-space()='%s']";
    private String addToCartButton = "//a[@id='menu-toggle']";

    //Methods:
    public void selectDeviceModel(String selectedDevice) {
        String xpathSection = String.format(deviceModel, selectedDevice);
        clickElement(xpathSection);
    }

    public void purchase() {
        clickElement(comprarButton);
    }

    public void setScreenSize(String selectedSize) {
        String xpathSection = String.format(screenSize, selectedSize);
        clickElement(xpathSection);
    }

    public void setColor(String selectedColor) {
        String xpathSection = String.format(deviceColor, selectedColor);
        clickElement(xpathSection);
    }

    public void setStorage(String selectedStorage) {
        String xpathSection = String.format(deviceStorage, selectedStorage);
        clickElement(xpathSection);
    }

    public void addToCart() {
        clickElement(addToCartButton);
    }
}
