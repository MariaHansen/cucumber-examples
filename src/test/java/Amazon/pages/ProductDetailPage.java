package Amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends PageObject {
    private By cartButtonLocator = By.id("add-to-cart-button");
    private HeaderPage headerPage;

    public ProductDetailPage(WebDriver webDriver, HeaderPage headerPage) {
        super.webDriver = webDriver;
        this.headerPage = headerPage;
    }

    public ProductDetailPage addItemToCart(int quantity) {
        setDropdownQuantity(quantity);
        var addToCartButtonElement = webDriver.findElement(cartButtonLocator);
        addToCartButtonElement.click();
        return this;
    }

    public CartPage clickOnCartIcon() {
        headerPage.clickOnCartIcon();
        return new CartPage(super.webDriver, headerPage);
    }
}
