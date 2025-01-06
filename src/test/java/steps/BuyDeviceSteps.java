package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.DevicePage;
import pages.HomePage;

public class BuyDeviceSteps {
    HomePage homepage = new HomePage();
    DevicePage devicePage = new DevicePage();

    @Given("I navigate to the MacStore website and click on the {string} Category")
    public void navigateToMacStoreWebAndSelectCategory(String category) {
        homepage.navigateToMacStore();
        homepage.selectDeviceCategory(category);
    }

    @When("The user selects {string} from the list of devices and clicks the purchase button")
    public void selectDevice(String device) {
        devicePage.selectDeviceModel(device);
        devicePage.purchase();
    }

    @And("The user sets the color {string}")
    public void setColorAndStorage(String color) {
        devicePage.setColor(color);
    }


    @And("The user sets the storage {string}")
    public void setStorage(String storage) {
        devicePage.setStorage(storage);
    }

    @And("The user selects the screen size {string}")
    public void selectScreenSize(String size) {
        devicePage.setStorage(size);
    }

    @And("The user decides the connectivity {string}")
    public void decidesConnectivity(String connectivity) {
    }

    @And("The user clicks Comprar")
    public void addToCart() {
        devicePage.addToCart();
    }

    @And("The user decides AppleCare {string} program")
    public void acceptAppleCare(String care) {

    }
}
