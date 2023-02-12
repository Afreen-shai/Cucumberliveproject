Feature:Create account of Facebook8
  As a User you need to open the Facebook homepage and do the validation
@smoke
  Scenario: validate First name field81
    Given User need to be on Facebook Login page
    When  User enter the user "afreen" first name
    Then User checks  user name is present


  Scenario: Validate  multiple field82
    Given  User need to be on Facebook Login page
    When  User enter the user "afreen" first name
    And User enter the user "shaik"surname
    Then User checks  user name is present
    And User checks user surname is present
    And User mobile number should be "7443187080"
