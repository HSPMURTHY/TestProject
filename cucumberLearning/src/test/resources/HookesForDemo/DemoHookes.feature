  Feature: Feature to test login functionality
  
	 Scenario Outline: Title of your scenario outline
    Given Hookes user is on login page
    When Hookes user enters <username> and <password>
    And Hookes clicks on login button
    Then Hookes user is naviagated to home page

    Examples: 
      | username | password  |
      | Admin    | admin123  |
      | Admin    | admin123  |
      | Admin    | incorrect |
      | test		 | test |
  
