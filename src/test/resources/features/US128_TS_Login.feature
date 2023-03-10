@B28G1-131
Feature: Login same line
  #US_11
  Background: For all scenario user should be on login page
    Given user is in login page
@B28G1-129
  Scenario: Login as librarian same line
    #Given I am on the login page
    When I am as user login as "librarian12"
    Then "dashboard" page should be displayed
    Then should be displayed "dashboard" page
@B28G1-130
  Scenario: Login as student same line
   # Given I am on the login page
    When I am as user login as "student12"
    Then "books" page should be displayed
    Then should be displayed "books" page

