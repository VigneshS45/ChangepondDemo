Feature: Test the create order functionality in Dufry appliaction

  Scenario: Launch the Dufry application URL
    Given User launch the Dufry application
    #And User clicks on the accept button
    
  @create
  Scenario: Validate the create order functionality by creating liquor order
    Given User launch the Dufry application
    And User clicks on the "Liquor" tab from product menu list
    And User should navigates to the "Liquor" module
    When User selects the "jack-daniel-s" brand from the top brands
    And User should navigates to the "JACK DANIEL'S" brand product page
    And User selects the "Tennessee Whiskey Old No. 7 1l" liquor product from the brand product page
    And User should navigates to the product "Tennessee Whiskey Old No. 7 1l" details page
    And User clicks on the Add to bag button
    Then User should navigates to the "Collection point" page
    And User selects the terminal as "Bengaluru International Terminal 2– Arrival" from the dropdown
    And User selects the collection date "30" from the date picker field
    And User clicks on the confirm collection piont button
    And User clicks on the show cart tab
    #And User clicks on the Order now button
    
  @search
  Scenario: Validate the create order functionality by searching and creating liquor order
    Given User launch the Dufry application
    And User enters the product "jack daniels" in the searchbox
    When User clicks on the search icon
    And User selects the "Tennessee Whiskey Old No. 7 1l" liquor product from the brand product page
    And User should navigates to the product "Tennessee Whiskey Old No. 7 1l" details page
    And User clicks on the Add to bag button
    Then User should navigates to the "Collection point" page
    And User selects the terminal as "Bengaluru International Terminal 2– Arrival" from the dropdown
    And User selects the collection date "30" from the date picker field
    And User clicks on the confirm collection piont button
    And User clicks on the show cart tab
    #And User clicks on the Order now button
