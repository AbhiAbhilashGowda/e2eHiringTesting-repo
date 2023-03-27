Feature: Validate the Mentorship functionality for e2eHiring application

        @Mentoship @one
      Scenario: Verification of Mentorship functionality with valid credentials
Given I launch the application
When I enter emailid "sunny@mail7.io"
When I enter password "Diatoz@123"
Then I click on login button
Then I click on mentorship
Then I click on overview
Then I click on register for orientation
Then I enter name "abhi"
Then I enter mailid in mentorship form "abhilashgowda23@gmail.com"
Then I enter phonenumber "8880372063"
Then I select java developer in mentorship program
Then I click on submit button 