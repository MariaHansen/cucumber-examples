package Amazon;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStep {

    @Given("I am in Amazon site landing page")
    public void iAmInAmazonSiteLandingPage() {
    }

    @And("search for {string}")
    public void searchFor(String searchCriteria) {
    }

    @When("select the first item")
    public void selectTheFirstItem() {

    }

    @And("add item to the Cart with quantity {int}")
    public void addItemToTheCartWithQuantity(int quantity) {
    }

    @And("open the cart")
    public void openTheCart() {

    }

    @When("reduce the quantity in {int}")
    public void reduceTheQuantityIn(int quantityToReduce) {
    }

    @Then("the quantity in Cart is {int}")
    public void theQuantityInCartIs(int expectedQuantity) {
    }

    @And("the total price is correct")
    public void theTotalPriceIsCorrect() {

    }
}
