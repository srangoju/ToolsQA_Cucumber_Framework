Feature: Automated End to End Tests
Description: The purpose of this feature is to test end to end integration.


  Scenario: Customer place an order by purchasing an item from search
    Given user is on Home Page
    When he search for "Brocolli"
    And choose to buy the first item
    And moves to checkout from mini cart
    And enter personal details on checkout page
    And click on proceed to checkout 
    And click on place order
    And select country
    And click on Agree Terms and conditions
    And click on proceed button
    Then validate success message
    

 