Feature:Create a city and delete a city

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario: Create a city

    And Click to elements in the left Class
      | setup1Button     |
      | parametersButton |
      | citiesButton     |

    And Click to elements in the FormContent
      | addButton |

    And Click to elements in the Dialog Content
      | newCityAddButton |

    And enter information in the Dialog Content
      | newCityNameInput | MeinLand28 |
      | newCityNameCode  | 2825       |

    And Click to elements in the Dialog Content
      | newCitySaveButton |

    Then Create and save a city

    Then delete a city

    And also delete the country you created for the city

    Then Success message should be displayed

    #Passed(Test gecti)     good passed(3 defa üst üste gecti)
  ## NOT!!! select kismini gelince uzun bekliyor ama seciyor secene kadar kapatmadan bekle!!!





