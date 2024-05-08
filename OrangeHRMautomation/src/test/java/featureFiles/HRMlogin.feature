Feature: Verification of Login Add user and Logout functionality in Orange HRM


  Scenario: Verify whether user can login to OrangeHRM and create a new System User and logout.
    Given login with valid credentials to OrangeHRM in a browser
    When  click login button and navigate to the dashboard
    And   navigate to Admin tile and add a new user
    And   Enter username in username field to search created user
    Then navigate to user profile and get logout
