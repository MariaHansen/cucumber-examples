package Amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultGridPage extends PageObject {
    private By productsElements = By.xpath("//a[@class='a-link-normal a-text-normal']");
    private HeaderPage headerPage;

    public SearchResultGridPage(WebDriver driver, HeaderPage headerPage) {
        super.webDriver = driver;
        this.headerPage = headerPage;
    }

    public ProductDetailPage selectFirstProduct() {
        List<WebElement> products = webDriver.findElements(productsElements);
        products.get(0).click();
        return new ProductDetailPage(super.webDriver, headerPage);
    }
}
