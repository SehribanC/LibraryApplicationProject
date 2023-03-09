@US05_ZG
Feature: Search functionality on the users page

Background:

    Given User is on the login page
    And User login as a librarian
    And User click on "Users" link


Scenario: Search accuracy

    When User search for "test"
    Then Table should contain rows with "Test"


  Scenario: Table columns names
    Then table should have following column names:

      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |



