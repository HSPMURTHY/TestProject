Feature: Feature to test login functionality
 
  Scenario: Check login is successful with valid credentails
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is naviagated to home page
    
