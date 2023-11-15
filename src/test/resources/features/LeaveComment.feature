Feature: Leave comment and verify the comment is added in the end of list
@Comment
  Scenario: I should be able to leave comment and check if its posted and exist in the end of the list.

    Given I am on Homepage of Nop Commerce
    When I click on the details button of News Release
    And I am able to navigate to Nop Commerce News Release page
    And I am able to fill the comment title
    And I am able to fill the comment box
    And I am able to click on the New comment button
    And I should be able to see comment added successfully message
    Then I should able to check if the comment is at the end of the list