Feature: Validate the login functionality for e2eHiring application

        @login @one
      Scenario: Verification of login functionality with valid credentials
Given I launch the application
When I enter emailid "sssinsandur@gmail.com"
When I enter password "Rohi@635"
Then I click on login button