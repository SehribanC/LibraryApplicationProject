
Feature: Each user have a unique id

  User story : As a user, when I search users, each user should have a unique ID.

  Background: For all scenario user should be in users page
    Given user is in login page
    When user login as "librarian"
    And user click users button in main menu

    @B28G1-110
  Scenario: Each user should have a unique id
    When change show option as "500"
    Then user should see all user id is unique

  @B28G1-111
  Scenario Outline: Each user should have a unique id
    And user search some "<keywords>"
    And change show option as "500"
    Then user should see all user id is unique

    Examples:
      | keywords |
      | user     |
      | gmail    |
      | student  |






