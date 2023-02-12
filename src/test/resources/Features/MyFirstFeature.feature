Feature:Create account of Facebook3
As a User you need to open the Facebook homepage and do the validation

Scenario: validate First name field31
Given User need to be on Facebook Login page
When  User enter the user "afreen" first name
Then User checks  user name is present
Then close the browser

Scenario: Validate  multiple field32
Given  User need to be on Facebook Login page
When  User enter the user "afreen" first name
And User enter the user "shaik"surname
Then User checks  user name is present
And User checks user surname is present
And User mobile number should be "7443187080"




