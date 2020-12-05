Feature:Create a position in Salary then edit and delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully
  @RegressionTest
  Scenario: Create a position in Salary then edit and delete
    And Click to elements in the left Class
      | humanResoursec |
      | setupHuman     |
      | positionSalary |

    And Click to elements in the FormContent
      | addButton |

    When Edit and delete position Salary

    Then Success message should be displayed

    ## Passed