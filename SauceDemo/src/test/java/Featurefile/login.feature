Feature:  Login and Adding product to the cart
Scenario: User is able to login and add product to the cart
 
Given user is on the login page
When user enters the username
And user enters the password
And user clicks the login button
And user should navigate to home page and add last product to the cart
And user should displayed with cart page
Then user should view the selected item on the cart