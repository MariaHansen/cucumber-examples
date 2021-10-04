package Amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public abstract class PageObject {
    private By quantityDropdownLocator = By.id("quantity");

    protected WebDriver webDriver;

    public int getDropdownQuantity() {
        var selectElement = webDriver.findElement(quantityDropdownLocator);
        var quantityDropdownElement = new Select(selectElement);

        var currentQuantityElement = quantityDropdownElement.getFirstSelectedOption();
        return Integer.parseInt(currentQuantityElement.getText());
    }

    public void setDropdownQuantity(int newQuantity) {
        var selectElement = webDriver.findElement(quantityDropdownLocator);
        var quantityDropdownElement = new Select(selectElement);
        quantityDropdownElement.selectByValue(String.valueOf(newQuantity));
    }
}
