Feature: create the customer and add customer
Scenario: create account details for customer
Given user should enter the login page
When user should click bankmanager 
And user should addcustomer and enter the customer details
And user should validate the popup click ok
And user sholud click open account and add details of customer
And user should check the popup click on ok
Then user should go to customer and go to newly created account  