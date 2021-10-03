Feature: Amazon Cart price validation
  In order to verify the total price in the cart is correct
  I add the first product resulting from a search
  and change the quantities

  Background: Search hats in Amazon site and add the first result with quantity 2
    Given I am in Amazon site landing page
    And search for "hats for men"
    When select the first item
    And add item to the Cart with quantity 2
    And open the cart

  Scenario: Validate total price is according to quantity
    Then the quantity in Cart is 2
    And the total price is correct

  Scenario: Validate total price is according to quantity when it has been reduced in 1
    When reduce the quantity in 1
    Then the quantity in Cart is 1
    And the total price is correct