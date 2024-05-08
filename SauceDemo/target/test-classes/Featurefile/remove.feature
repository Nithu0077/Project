Feature:Add product and remove product from the cart 
Scenario: user can add multiple product to 
the cart and remove any product from the cart

Given User should enter the url
When User should able to enter the username
And User should able to enter the password
And User should able to click the login button
And User should able to add the 3rd product to the cart
And User should add the 1st product to the cart
And User should be displayed with cart page
And User should able to view the selected item in the cart
And User clicks the remove button of 2nd product
Then User should remove 2nd product from the cart  


