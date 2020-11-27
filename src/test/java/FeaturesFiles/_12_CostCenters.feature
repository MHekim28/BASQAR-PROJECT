Feature:

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully

    Scenario: Create a Cost Centers, edit it and then delete it

      And Click to elements in the left Class
        | budgetButton     |
        | budgetSetupButton |
        | costCentersButton      |

      And Click to elements in the FormContent
        | addButton |

      Then Create a Cost Centers

      When Edit this Cost Centers

      And Delete this Cost Centers

      Then Success message should be displayed

    ## Passed     good passed(3 defa üst üste gecti)