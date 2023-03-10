@B28G1-109
Feature: Test records checkbox for different options
  @B28G1-106
  Scenario Outline: Verify user see records and by default should be 10
    Given As a user go to "Library" login page.
    And Use librarian valid inputs for "<username>" and "<password>"
    When Librarian on dashboard, click "Users" module on top of the page
    Then Verify librarian see records and  by default should be 10
    Examples:
      |username           |password   |
      |librarian1@library |libraryUser|
  @B28G1-107
    Scenario Outline: Verify user has different options in records checkbox
      Given As a user go to "Library" login page.
      And Use librarian valid inputs for "<username>" and "<password>"
      When Librarian on dashboard, click "Users" module on top of the page
      When Click records checkbox to see different options
      Then Verify user has different options
        | 5   |
        | 10  |
        | 15  |
        | 50  |
        | 100 |
        | 200 |
        | 500 |
      Examples:
        |username           |password   |
        |librarian1@library |libraryUser|
