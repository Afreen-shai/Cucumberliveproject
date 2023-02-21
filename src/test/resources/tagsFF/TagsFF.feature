@important
Feature:Create account of Facebook9
  As a User you need to open the Facebook homepage and do the validation
@smoke
  Scenario: validate First name field91
    Given User need to be on Facebook Login page
    When  User enter the user "afreen" first name
    Then  User checks  user name "afreen"is present
    Then close the browser
@smoke @Regression
  Scenario: Validate  multiple field92
    Given  User need to be on Facebook Login page
    When  User enter the user "shafiq" first name
    And User enter the user "shaik"surname
    Then User checks  user name "shafiq"is present
    Then close the browser
@Regression
  Scenario: validate First name field93
    Given User need to be on Facebook Login page
    When  User enter the user "afreen" first name
    Then User checks  user name "afreen"is present
    Then close the browser
@Regression
  Scenario: Validate  multiple field94
    Given  User need to be on Facebook Login page
    When  User enter the user "afreen" first name
    And User enter the user "shaik"surname
    Then User checks  user name "afreen"is present
    And User mobile number should be "7443187080"
    Then close the browser

@smoke
  Scenario: validate First name field95
    Given User need to be on Facebook Login page
    When  User enter the user "afreen" first name
    Then User checks  user name "afreen"is present
    Then close the browser
