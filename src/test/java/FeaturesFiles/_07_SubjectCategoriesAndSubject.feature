Feature:

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario: Create a subject category, when you add a subject to this category, this subject category should not be deleted.

    And Click to elements in the left Class
      | education         |
      | setupFive         |
      | subjectCategories |

    And Click to elements in the FormContent
      | addButton |

    And enter information in the Dialog Content
      | inputName | MySubjectCategory2825 |
      | inputCode | 28252825              |

    And Click to elements in the Dialog Content
      | saveButton |

    Then Add a subject to this category

    When Now try to delete the category. The category should not be deleted.

    Then the user should see the error message on the screen

    And To delete the category, first delete the subject you created

    Then Now successfully delete the Subject category

    Then Success message should be displayed

    # Passed