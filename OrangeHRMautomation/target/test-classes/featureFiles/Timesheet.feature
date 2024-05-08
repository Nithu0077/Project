Feature: Verification of functionality of the Timesheet

Scenario: Verify whether user is able to fill and save the Time sheet

    Given login in OrangeHRM with valid credentials
    When  click login button and  get redirect to the dashboard
    And   navigate to Time tile and click on Timesheets 
    And   Enter Paul Collings in emplyee name and click on View button
    And   click edit button
    And   Enter Apache Software Foundation ASF Phase text in Project text field
    And   Click on Activity dropdown and select Implementation
    And   Enter text in all the date text fields
    Then  Click on Save button