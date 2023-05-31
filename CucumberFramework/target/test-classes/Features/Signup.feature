Feature: New User Signup and Login
@NewUser
Scenario: Signing up with new user with valid informations
Given Land on the Luma portal page
When User navigate to the signup page
Then Fill the manadaotry amd the important details
|Dhareene|R|
And Validate the user logged into the website

@Product
Scenario: Validate the user able to add product from women category
Given Land on the Luma portal page
And Navigate to Login page
And Login with the useremail "dhareene@gmail.com" and password "qwerty@12345" code
When User navigate to women-Tees catagory
And Go to "Radiant Tee" from the product list
Then Give "S" Size and "Blue" colour 
And proceed the checkout
