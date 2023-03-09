@B28G1-120
Feature: Default

  Background:
		#@B28G1-116
    Given I am on the login page
    And I login as a librarian

  @B28G1-117
  Scenario: US101_TC1 AC1
    When I click on Users module
    Then Users page should be displayed


  @B28G1-118
  Scenario: US101_TC2 AC2
    When I click on Books module
    Then Books page should be displayed

  @B28G1-119
  Scenario: US101_TC3 AC3
    And I click on Books module
    When I click on Dashboard link
    Then Dashboard page should be displayed