Feature: Appliaction Login

Background:
Given the browser should login
When the code is triggered
Then the url should given and triggered

@SmokeTest
Scenario: User need to login with valid login user and password
Given User should be in the login page of the application
When User should provide valid user "idhldf" and password "93987213"
Then  The user should be landed to the homepage 
And  Able to see the all the carts is "true"

Scenario: User need to login with valid login user and password
Given User should be in the login page of the application
When User should provide valid user "dharee" and password "273727"
Then  The user should be landed to the homepage 
And  Able to see the all the carts is "false"
@SmokeTest
Scenario: User need to login with valid login user and password
Given User should be in the login page of the application
When User should signin with the following details
| dhareene| password| emailid@gmail.com| TamilNadu|
Then  The user should be landed to the homepage 
And  Able to see the all the carts is "false"



Scenario Outline: User need to login with valid login user and password
Given User should be in the login page of the application
When User login in to application with <userName> and password <Password>
Then  The user should be landed to the homepage 
And  Able to see the all the carts is "false"

Examples:
 |userName |Password|
 |user1    |1234df  |
 |user2    |43534dsf|
 |user3    |53534dsf|
 |user4    |63534dsf|
 
