Feature: JavaScript Alert
  
  In order to handle JavaScript Alerts
  as a regular user
  I want to visit JavaScript Homepage and click on different types of Alerts

  @JS_Alert
  Scenario: JavaScript Alert Handle
    Given user visit JavaScript Alert Page
    When user click for JS Alert button
    And user click on OK from pop up alert
    Then user will able to see the result that alert is clicked
  
  @JS_Confirm  
  Scenario: JavaScript Confirm Handle
    Given user visit JavaScript Alert Page
    When user click for JS confirm button
    And user click on Cancel from pop up alert
    Then user will able to see the result that alert is cancelled
    
   @JS_Prompt 
    Scenario Outline: JavaScript Prompt Handle
    Given user visit JavaScript Alert Page
    When user click for JS Prompt button
    And user type "<Any Text>"
    And user click on OK button
    Then user will able to see the what he typed on the pop up alert
    
    
    Examples: 
      | Any Text |
      | Alert Handling |    
  

