Feature: Verification of the funtionality of PIM feature

Scenario: Verify whether user is able to add a employee , edit the personal information, 
          reset the selected serach item and cancel the selected cemployee beign deleted
          
Given login to OrangeHRM in a browser
When  user navigate to PIM tile     
And   click on Employee List 
And   click on +Add button and enter values in text fields     
And   Under Personal Information click on Nick name text field Enter text 
And   Click on Nationality dropdown button Select value as Japanese
And   Click on Marital Status dropdown select value as Single
And   Click on Date of Birth date 
And   Click on Female radio button Click on Save button
And   Navigate and click on Employee List tile and enter emplyee name to search user
And   Click on Reset button 
And   Under Recods found click on 2nd check box 
And   Clcik on Delete Selected button
And   Click on No,Cancel button
Then  Clcik on Reset button