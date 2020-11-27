Feature:

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario: Create a new Subject category and then delete one Subject category.

    And Click to elements in the left Class
      | education         |
      | setupFive         |
      | subjectCategories |

    And Click to elements in the FormContent
      | addButton |

    And enter information in the Dialog Content
      | inputName | IT/Software/Engineering/28 |
      | inputCode | 28252825                   |

    And Click to elements in the Dialog Content
      | saveButton |

    Then Delete category

    And Success message should be displayed

    #Passed(Test gecti)     good passed(3 defa üst üste gecti)

