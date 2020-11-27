Feature:

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario:Create a new bank account, edit it and then delete it

    And Click to elements in the left Class
      | setup1Button     |
      | parametersButton |
      | bankAccount      |

    And Click to elements in the FormContent
      | addButton |

    Then Create a new bank account

    When Edit this bank account

    And Delete this bank account

    Then Success message should be displayed

    ## Passed     good passed(3 defa üst üste gecti)


