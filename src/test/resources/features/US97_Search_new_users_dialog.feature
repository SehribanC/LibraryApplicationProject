Feature: search new users dialog

  @US_97
  Scenario: Verify user information
    Given I am on the login page here
    And I login using following credentials:
      | email    | librarian21@library |
      | password | libraryUser         |

    And I click on "User" link now
    When I search for "10256"
    Then table should contain this data

      | User ID   | 10256            |
      | Full Name | Ali              |
      | Email     | user77@gmail.com |

