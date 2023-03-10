@B28G1-135
Feature: User valid login

  Scenario Outline: Verify user information email
    Given User is on the login page
    When User login "<email>" and "<password>"
    Then Account holder name should be "<name>"
    Examples:
      | email              | password    | name             |
      | student1@library   | libraryUser | Test Student 1   |
      | student2@library   | libraryUser | Test Student 2   |
      | student3@library   | libraryUser | Test Student 3   |
      | librarian1@library | libraryUser | Test Librarian 1 |
      | librarian2@library | libraryUser | Test Librarian 2 |
      | librarian3@library | libraryUser | Test Librarian 3 |


