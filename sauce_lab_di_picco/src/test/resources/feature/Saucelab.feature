Feature: Test the saucelab Ecommerce Website

  #Scenario Outline: Validate the Login functionality
  #Given User should launch the website
  #When user should enters the "<Username>" and "<Password>"
  #And user click on the Login button
  #Then user should navigate to product homepage
  #Examples:
  #| Username      | Password     |
  #| standard_user | secret_sauce |
  
  @smoke
  Scenario: Validate the Login functionality
    Given user should enters the Username "standard_user" and Password "secret_sauce"
    And user click on the Login button
  
  @sanity1
  Scenario: Valiadte the Product Insertion Order based on the Sort order list
    Given user should enters the Username "standard_user" and Password "secret_sauce"
    And user click on the Login button
    And user should navigate to product homepage
    And user should verify the Product order list based on the Name(A-Z) on dropdown
      | Sauce Labs Backpack               |
      | Sauce Labs Bike Light             |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |
    And user should select Name(Z-A) in dropdown and verify the Product order
      | Test.allTheThings() T-Shirt (Red) |
      | Sauce Labs Onesie                 |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Bike Light             |
      | Sauce Labs Backpack               |
    And User should select Price(low to high) in dropdown and verify the Product order
      | $7.99  |
      | $9.99  |
      | $15.99 |
      | $15.99 |
      | $29.99 |
      | $49.99 |
    And User should select Price(high to low) in dropdown and verify the Product order
      | $49.99 |
      | $29.99 |
      | $15.99 |
      | $15.99 |
      | $9.99  |
      | $7.99  |
    And user should select the product
    And navigate to the add to cart and verify the Product
    Then User should click on Check out button and navigate to the checkout page

  Scenario: Validate the Checkout form and place the order
    Given user should enters the Username "standard_user" and Password "secret_sauce"
    And user click on the Login button
    And user should navigate to product homepage
    And user should verify the Product order list based on the Name(A-Z) on dropdown
      | Sauce Labs Backpack               |
      | Sauce Labs Bike Light             |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |
    And user should select Name(Z-A) in dropdown and verify the Product order
      | Test.allTheThings() T-Shirt (Red) |
      | Sauce Labs Onesie                 |
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Bolt T-Shirt           |
      | Sauce Labs Bike Light             |
      | Sauce Labs Backpack               |
    And User should select Price(low to high) in dropdown and verify the Product order
      | $7.99  |
      | $9.99  |
      | $15.99 |
      | $15.99 |
      | $29.99 |
      | $49.99 |
    And User should select Price(high to low) in dropdown and verify the Product order
      | $49.99 |
      | $29.99 |
      | $15.99 |
      | $15.99 |
      | $9.99  |
      | $7.99  |
    And user should select the product
    And navigate to the add to cart and verify the Product
    Then User should click on Check out button and navigate to the checkout page
    Given User should enter the Firstname "Vignesh"
    And User should enter the Lastname "s"
    And User should enter the Postalcode "60010"
    And user should click on the Continue button
    Then User should navigate to overview page and click on Finish button
