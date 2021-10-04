package Amazon;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver webDriver;

    public void startBrowser() {
        //TODO fix filepath
        System.setProperty("webdriver.chrome.driver", "C:/Users/mhansen/IdeaProjects/cucumber-examples/target/test-classes/lib/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }

    public void closeBrowser(Scenario scenario) {
        webDriver.close();
    }
}
