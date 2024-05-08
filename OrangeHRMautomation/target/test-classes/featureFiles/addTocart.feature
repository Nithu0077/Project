Feature: Verify add to cart functionality

  Scenario: check that the last product which is in home page added to cart
    Given enter sauce demo url in browser
    When user gives credentials
    And click login button
    And navigate to last product and add it to cart
    Then validate the added product