Feature: Test the saucelab Ecommerce Website

 
  Scenario: Validate the Login functionality of swag labs
    Given User launch the website Swag Labs "https://www.saucedemo.com/"
    And User enters the Username "standard_user" and Password "secret_sauce"
    Then User click on the Login button

  @smoke1
  Scenario: Valiadte the Product sort list Order based on the selected options in dropdown
    Given User launch the website Swag Labs "https://www.saucedemo.com/"
    And User enters the Username "standard_user" and Password "secret_sauce"
    And User click on the Login button
    When user navigate to product homepage
    And User verify the product order list based on selected option "Name (A to Z)"  in dropdown
      | Sauce Labs Backpack               |
      | Sauce Labs Bike Light             |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |
    And User verify the product order list based on selected option "Name (Z to A)"  in dropdown
      | Test.allTheThings() T-Shirt (Red) |
      | Sauce Labs Onesie                 |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Bike Light             |
      | Sauce Labs Backpack               |
    And User verify the product order list based on selected option "Price (low to high)"  in dropdown
      | $7.99  |
      | $9.99  |
      | $15.99 |
      | $15.99 |
      | $29.99 |
      | $49.99 |
    And User verify the product order list based on selected option "Price (high to low)"  in dropdown
      | $49.99 |
      | $29.99 |
      | $15.99 |
      | $15.99 |
      | $9.99  |
      | $7.99  |
    And user select the multiple products
    And User click on the add to cart button
    Then User click on Check out button and navigate to the checkout page

 @smoke2
  Scenario: Validate the Checkout form and place the order
    Given User launch the website Swag Labs "https://www.saucedemo.com/"
    And User enters the Username "standard_user" and Password "secret_sauce"
    And User click on the Login button
    When user navigate to product homepage
    And user select the multiple products
    And User click on the add to cart button
    And User click on Check out button and navigate to the checkout page
    And User enter the Firstname "Vignesh"
    And User enter the Lastname "s"
    And User enter the Postalcode "60010"
    And User click on the Continue button
    And User navigate to overview page and verify the product price
    Then click on Finish button
