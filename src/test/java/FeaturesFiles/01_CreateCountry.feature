Feature:Create a country and Delete a country

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario:Create a Country

    And Click to elements in the left Class
      | setup1Button     |
      | parametersButton |
      | countriesButton  |

    And Click to elements in the FormContent
      | addButton |

    And enter information in the Dialog Content
      | inputName | My Country_1 |
      | inputCode | 28252825     |

    And Click to elements in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario:Delete a Country

    And Click to elements in the left Class
      | setup1Button     |
      | parametersButton |
      | countriesButton  |

    And enter information in the FormContent
      | searchInputName | My Country_1 |
      | searchInputCode | 28252825     |

    And Click to elements in the FormContent
      | searchButton |

    And Click to elements in the Dialog Content
      | deleteButton |
      | yesButton    |

    Then Success message should be displayed

    # 2 passed









