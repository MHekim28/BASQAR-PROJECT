Feature:Create a country and Delete a country

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully
  @WipTest @SmokeTest @RegressionTest
  Scenario:Create a Country

    And Click to elements in the left Class
      | setup1Button     |
      | parametersButton |
      | countriesButton  |

    And Click to elements in the FormContent
      | addButton |

    And enter information in the Dialog Content
      | inputName | My Country_2825 |
      | inputCode | 28252825        |

    And Click to elements in the Dialog Content
      | saveButton |

    Then Success message should be displayed

    And Delete this Country

    Then Success message should be displayed

   #Passed(Test gecti)     good passed(3 defa üst üste gecti)









