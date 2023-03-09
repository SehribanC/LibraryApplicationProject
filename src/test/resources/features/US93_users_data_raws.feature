
Feature: As a user, I want to select different number of raws to see users records

  @B28G1-121
  Scenario Outline: Show records for count options
    Given I am on the login page now
    And I login as a librarian now
    And I click on "Users" link now
    When I select Show "<count>" records
    Then show records value should be "<count>"
    Then the users table must display "<count>" records

    Examples:
      | count |
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |


