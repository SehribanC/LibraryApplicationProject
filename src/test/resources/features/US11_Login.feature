Feature: Login same line
  Background: For all scenario user should be on login page
    Given user is in login page

  Scenario: Login as librarian same line
    #Given I am on the login page
    When user login as "librarian2"
    Then "dashboard" page should be displayed


