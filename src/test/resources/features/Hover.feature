Feature: Hover over category
@Hover @Regression
Scenario: I should be able to Hover on Computers category and change color
  Given I am on Homepage
  And I can see the Computers text is black color
  When I move my mouse over Computers category
  Then I should be able to see the Computer category color change from black to blue
  Then I should be able to check if the color code is as expected