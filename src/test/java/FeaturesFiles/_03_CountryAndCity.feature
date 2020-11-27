Feature:

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario:Create a country. When you add a city to this country you created, the country should not be deleted.
    And Click to elements in the left Class
      | setup1Button     |
      | parametersButton |
      | countriesButton  |

    And Click to elements in the FormContent
      | addButton |

    And enter information in the Dialog Content
      | inputName | MyLand010203 |
      | inputCode | 2825         |

    And Click to elements in the Dialog Content
      | saveButton |

    When Create a city

    Then Try to delete the created country and check that it cannot be deleted.

    Then the user should see the error message on the screen

    And delete the city first to be able to delete the country

    Then now successfully delete the country

    Then Success message should be displayed

     #Passed(Test gecti)     good passed(3 defa üst üste gecti)
  ## NOT!!! select kismini gelince uzun bekliyor ama seciyor secene kadar kapatmadan bekle!!!