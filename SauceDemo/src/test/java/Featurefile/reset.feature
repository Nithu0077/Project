Feature:reset the application
Scenario:User can reset the application state


Given User should enter the saucedemo website
When User Enter the valid username
And User enter the valid password
And User click on login button
And User click the dropdown ZtoA button
And User shold able to add multiple items
And User clicks add to cart of any product
And User should view the added items
And User click on Reset app state
And User should validate the cart is empty
Then User should perform logout

