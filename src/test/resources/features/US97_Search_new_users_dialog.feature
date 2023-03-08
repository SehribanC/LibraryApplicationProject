Feature: search new users dialog

  @US_97
  Scenario: Verify user information
    Given I am on the login page
    And I login using following credentials:
      | email    | librarian21@library |
      | password | libraryUser         |

    And I click on "User" link
    When I search for "486"
    Then table should contain this data

      | User ID   | 486                             |
      | Full Name | Asuncion Pfeffer                |
      | Email     | Oralia Daugherty234@library.com |

