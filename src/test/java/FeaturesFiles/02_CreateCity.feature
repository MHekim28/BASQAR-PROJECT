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
      | newCityNameInput | Mein Land02  |
      | newCityNameCode | 2825 |

    And Click to elements in the Dialog Content
      | newCitySaveButton |

  Then Create and save a city

    #Then Success message should be displayed

      Then delete a city

      Then Success message should be displayed

  Scenario: Delete the country you created

    And Click to elements in the left Class
      | setup1Button     |
      | parametersButton |
      | countriesButton  |

    And enter information in the FormContent
      | searchInputName | Mein Land02 |
      | searchInputCode | 2825     |

    And Click to elements in the FormContent
      | searchButton |

    And Click to elements in the Dialog Content
      | deleteButton |
      | yesButton    |

    Then Success message should be displayed



