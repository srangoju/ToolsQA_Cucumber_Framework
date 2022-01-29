Feature: Automated End to End Tests
Description: The purpose of this feature is to test end to end integration.


  Scenario: Customer place an order by purchasing an item from search
    Given user is on Home Page
    When he search for "Brocolli"
    And click on Add to Cart
    And click on bag 
    And click on proceed to checkout
    And click on place order
    And choose country
    And check Agree Terms and conditions
    And click on proceed button
    Then validate success message
    

 