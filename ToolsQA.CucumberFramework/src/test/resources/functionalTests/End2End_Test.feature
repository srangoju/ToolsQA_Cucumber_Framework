Feature: Automated End to End Tests
Description: The purpose of this feature is to test end to end integration.

  Scenario: Customer place an order by purchasing an item from search
    Given user is on Home Page
    When click on top dealers link
    When user navigate to top deals page
    Then enter item in searchbox

    

 