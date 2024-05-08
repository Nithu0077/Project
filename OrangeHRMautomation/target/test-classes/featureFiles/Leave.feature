Feature: Verification of Leave functoinality

Scenario: Verify whether user is able to apply leave and delete the appiled leave

    Given do login in OrangeHRM with in a browser
    When  click on login button and  get navigate to the dashboard
    And   navigate to Leave tile and click on Assign leave
    And   Enter inputs in text fields click Assign button
    Then  Click on Ok button on pop-up 
    