Feature:

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully

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

    ## Passed     good passed(3 defa üst üste gecti)

