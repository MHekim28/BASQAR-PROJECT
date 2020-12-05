Feature:Create an excel template then edit and delete it

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully
  @RegressionTest
  Scenario: Create an excel template then edit and delete it

    And Click to elements in the left Class
      | reportsButton     |
      | reportSetupButton |
      | excelTemplate     |

    And Click to elements in the FormContent
      | excelTemplateAddBtn |

    Then Create a new excel template

    When Edit this excel template

    And Delete this excel template

    Then Success message should be displayed
  @RegressionTest
  Scenario: Create a Salary Types then edit and delete it

    And Click to elements in the left Class
      | humanResoursec |
      | setupHuman     |
      | salaryTypes    |

    And Click to elements in the FormContent
      | addButton |

    Then Create a new Salary Types

    When Edit this Salary Types

    And Delete this Salary Types

    Then Success message should be displayed

