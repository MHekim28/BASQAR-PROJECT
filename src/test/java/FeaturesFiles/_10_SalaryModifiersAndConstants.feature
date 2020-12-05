Feature:Create a new Salary Modifiers, edit it and delete it.

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully
  @RegressionTest
  Scenario: Create a new Salary Modifiers, edit it and delete it.

    And Click to elements in the left Class
      | humanResoursec  |
      | setupHuman      |
      | salaryModifiers |

    And Click to elements in the FormContent
      | addButton |

    Then Create a new Salary Modifiers

    When Edit it

    And Delete it

    Then Success message should be displayed
  @RegressionTest
  Scenario: Create a new Salary Constants , edit it and delete it.

    And Click to elements in the left Class
      | humanResoursec  |
      | setupHuman      |
      | salaryConstants |

    And Click to elements in the FormContent
      | addButton |

    Then Create a new Salary Constants

    When Edit this Salary Constants

    And Delete this Salary Constants

    Then Success message should be displayed

    ## Passed     good passed(3 defa üst üste gecti)

