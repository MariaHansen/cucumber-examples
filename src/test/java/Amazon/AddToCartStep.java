package Amazon;

import Amazon.pages.CartPage;
import Amazon.pages.LandingPage;
import Amazon.pages.ProductDetailPage;
import Amazon.pages.SearchResultGridPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddToCartStep extends TestBase {

    private LandingPage landingPage;
    private SearchResultGridPage searchResultPage;
    private ProductDetailPage productDetailPage;
    private CartPage cartPage;

    @Before
    public void initTest() {
        super.startBrowser();
    }

    @After
    public void completeTest(Scenario scenario) {
        super.closeBrowser(scenario);
    }

    @Given("I am in Amazon site landing page")
    public void iAmInAmazonSiteLandingPage() {
        landingPage = new LandingPage(super.webDriver);
    }

    @And("search for {string}")
    public void searchFor(String searchCriteria) {
        searchResultPage = landingPage.search(searchCriteria);
    }

    @When("select the first item")
    public void selectTheFirstItem() {
        productDetailPage = searchResultPage.selectFirstProduct();
    }

    @And("add item to the Cart with quantity {int}")
    public void addItemToTheCartWithQuantity(int quantity) {
        productDetailPage.addItemToCart(quantity);
    }

    @And("open the cart")
    public void openTheCart() {
        cartPage = productDetailPage.clickOnCartIcon();
    }

    @When("reduce the quantity in {int}")
    public void reduceTheQuantityIn(int quantityToReduce) {
        cartPage.reduceQuantityIn(quantityToReduce);
    }

    @Then("the quantity in Cart is {int}")
    public void theQuantityInCartIs(int expectedQuantity) {
        int carIconQuantity = cartPage.getCarIconQuantity();
        int dropdownQuantity = cartPage.getDropdownQuantity();

        Assert.assertEquals(expectedQuantity, carIconQuantity);
        Assert.assertEquals(expectedQuantity, dropdownQuantity);
    }

    @And("the total price is correct")
    public void theTotalPriceIsCorrect() {
        //TODO
    }
}
