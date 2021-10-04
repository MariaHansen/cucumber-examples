package Amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage extends PageObject {
   private By searchInputLocator = By.id("twotabsearchtextbox");
   private By lensIconLocator = By.id("nav-search-submit-button");
   private By cartIconLocator = By.id("nav-cart-count-container");

   public HeaderPage(WebDriver driver) {
      super.webDriver = driver;
   }

   public void search(String text) {
      var searchInputElement = webDriver.findElement(searchInputLocator);
      searchInputElement.clear();
      searchInputElement.sendKeys(text);

      var submitLensIconElement = webDriver.findElement(lensIconLocator);
      submitLensIconElement.click();
   }

   public void clickOnCartIcon() {
      var cartIconElement = webDriver.findElement(cartIconLocator);
      cartIconElement.click();
   }

   public int getCartIconQuantity() {
      var cartIconElement = webDriver.findElement(cartIconLocator);
      return Integer.parseInt(cartIconElement.getText());
   }
}
