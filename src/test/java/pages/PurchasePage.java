package pages;

public class PurchasePage extends BasePage {
    public PurchasePage() {
        super(driver);
    }

    private String productDetails = "//td[@id='seccprod']";
    private String proceedPaymentButton = "//b[normalize-space()='Proceder al pago']";

    public String getProductDetails() {
        return getElementText(productDetails);
    }

    public void proceedToPayment() {
        clickElement(proceedPaymentButton);
    }
}
