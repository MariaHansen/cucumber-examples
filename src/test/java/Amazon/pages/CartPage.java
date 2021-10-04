package Amazon.pages;

import org.openqa.selenium.WebDriver;


public class CartPage extends PageObject {
    private HeaderPage headerPage;

    public CartPage(WebDriver driver, HeaderPage headerPage) {
        super.webDriver = driver;
        this.headerPage = headerPage;
    }

    public CartPage reduceQuantityIn(int quantity) {
        var currentQuantity = getDropdownQuantity();
        setDropdownQuantity(currentQuantity - quantity);
        return this;
    }

    public int getCarIconQuantity() {
        return headerPage.getCartIconQuantity();
    }
}
