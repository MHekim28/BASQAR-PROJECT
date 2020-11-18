Feature:

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario: Create a new Budget Accounts and delete it.
    And Click to elements in the left Class
      | budget          |
      | budgetAccounts  |
      | addButtonBudget |

    And enter information in the form
      | budgetCodeInput | 12345678859      |
      | budgetNameInput | TechnoStudy3749|

    Then Click to elements in the form
      | budgetCategory    |
      | option2           |
      | budgetType        |
      | option1           |
      | budgetBalanceType |
      | option1           |
      | budgetCurrency    |
      | option2           |
      | budgetSaveButton  |

   Then Success message should be displayed

    And enter information in the form
      | budgetDeleteName| TechnoStudy3 |
      | budgetDeleteCode | 12345678      |

    Then Click to elements in the form
      | searchButton |
      | deleteButton |
      | yesButton    |