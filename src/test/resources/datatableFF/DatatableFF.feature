Feature:Create account of Facebook2
  As a User you need to open the Facebook homepage and do the validation

  Scenario: validate multiple fields21
    Given User need to be on Facebook Login page
    When  User enter following details
       |Username|surname|mobile|
       |afreen  |shaik  |12345 |
       |shafiq  |shaik  |3456  |
