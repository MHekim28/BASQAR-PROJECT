Feature:

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario:Create a new Subject and then delete one Subject

    And Click to elements in the left Class
      | education |
      | setupFive |
      | subjects  |

    And Click to elements in the Dialog Content
      | addButton |

    And enter information in the form
      | nameInput | IT   |
      | codeInput | 2825 |

    #Asagidaki kismi er defa farkli girmek gerekiyor.Yeni kategori olusturmadan da mevcut olani secerek test edebilirim.
#    And Click to elements in the Dialog Content
#      | categoryAddButton |
#
#    And enter information in the form
#      | subjectCategoryName | Turkisch2825 |
#      | subjectCategoryCode | 28252825     |
#
#    And Click to elements in the Dialog Content
#      | categorySaveButton |

    Then Click to elements in the form
      | subjectCategory |
      | option1         |
      | selectStyle     |
      | option1         |

    And Click to elements in the Dialog Content
      | saveButton |

    Then Success message should be displayed

    And enter information in the form
      | deleteSearchName | IT   |
      | deleteSearchCode | 2825 |

    And Click to elements in the Dialog Content
      | searchButton |
      | deleteButton |
      | yesButton    |

    Then Success message should be displayed









