Feature: Login functionality

  Background: For all scenario user should be on login page
    Given user is in login page

    Scenario: Login as a student
      When user login as "student"
      Then user should see the title is "Library"

  Scenario: Login as a librarian
    When user login as "librarian"
    Then user should see the title is "Library"



