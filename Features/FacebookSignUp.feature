@tag
Feature: Facebook SignUp

In order to verify SignUp
As a new user
I want to visit facebook webpage and sign up
  
  @fbsignup
    Scenario Outline: 
    Given user visit fb homepage
    When user click create new account
    And user enter valid "<First name>" and "<Last name>" and valid "<Mobile number or email>" and valid "<New password>"
    And user select dropdown Month and dropdown Day and dropdown Year
    Then user click Gender 

    Examples: 
      | First name  | Last name | Mobile number or email | New password |
      | Hrithik  | Roushan | abcd@yahoo.com | 123 |
      
