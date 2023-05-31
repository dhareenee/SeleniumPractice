Feature: Appliaction Login



@WebTest
Scenario: User need to login with valid login user and password
Given User should be in the login page of the application
When User should provide valid user "idhldf" and password "93987213"
Then  The user should be landed to the homepage 
And  Able to see the all the carts is "true"
@MobileTest
Scenario: User need to login with valid login user and password
Given User should be in the login page of the application
When User should provide valid user "dharee" and password "273727"
Then  The user should be landed to the homepage 
And  Able to see the all the carts is "false"
@WebTest
Scenario: User need to login with valid login user and password
Given User should be in the login page of the application
When User should signin with the following details
| dhareene| password| emailid@gmail.com| TamilNadu|
Then  The user should be landed to the homepage 
And  Able to see the all the carts is "false"



 
