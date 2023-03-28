Feature: Validate login functionality

  Scenario: Validating login functionlity
    Given User is in login page
    When user enters username "sssinsandur@gmail.com"
    And user enters password "Rohi@635"
    Then user clicks on login button
