Feature:Create account of Facebook1
  As a User you need to open the Facebook homepage and do the validation


  Scenario Outline: Validate  multiple field12
    Given  User need to be on Facebook Login page
    When  User enter the user "<user>" first name
    And User enter the user "<surname>"surname
    Then User checks "<user>" name is present
    And User mobile number should be "7443187080"
    Then close the browser
    Examples:
      |user  |surname |
      |afreen|shaik   |
      |shafiq|shaik   |




