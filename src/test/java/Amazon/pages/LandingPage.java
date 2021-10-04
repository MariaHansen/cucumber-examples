package Amazon.pages;

import org.openqa.selenium.WebDriver;

public class LandingPage extends PageObject {
    private HeaderPage headerPage;
    private String amazonUrl = "http://www.amazon.com";

    public LandingPage(WebDriver driver) {
        super.webDriver = driver;
        super.webDriver.navigate().to(amazonUrl);
        headerPage = new HeaderPage(driver);
    }

    public SearchResultGridPage search(String text) {
        headerPage.search(text);
        return new SearchResultGridPage(super.webDriver, headerPage);
    }
}
