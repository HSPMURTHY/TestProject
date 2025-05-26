Feature: Feature to test login functionality
  
  @sanity
  Scenario Outline: Title of your scenario outline
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is naviagated to home page

    Examples: 
      | username | password  |
      | Admin    | admin123  |
      | Admin    | admin123  |
      | Admin    | incorrect |
      | test		 | test |
      
      