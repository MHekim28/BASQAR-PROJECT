Feature:

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario: Create a new subject and then delete a subject
    And Click to elements in the left Class
      | education |
      | setupFive |
      | subjects  |

    And Click to elements in the FormContent
      | addButton |

    And enter information in the Dialog Content
      | inputName | Turkish/IT/Software/28 |
      | inputCode | 28252825               |

    And Click to elements in the Dialog Content
      | selectSubjectCategory |
      | option1               |
      | selectSubjectStyle    |
      | option2               |
      | saveButton            |

    Then Delete subject

    And Success message should be displayed