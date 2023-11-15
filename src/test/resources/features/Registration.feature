Feature: Register Successfully
@Register @Regression
  Scenario: I should be able to register successfully
    Given I am on NopCommerce Homepage
    When I click on the register button
    And I am able to navigate to register page
    And I am able to fill the registration form
    Then I should able to register successfully