Feature: Login Functionality

  Scenario: Login with username and password
    Given Navigate to basqar

    When Enter username and password and click Login Button

    Then User should login successfully

  Scenario Outline: User shouldn't be able to login with wrong  credentials
    Given Navigate to basqar
    When Enter "<username>" and "<password>"
    Then Error message "<message>" should be displayed

    Examples:
      | username             | password        | message                      |
      | daulet2030@gmail.com | TechnoStudy1    | Invalid username or password |
#      | daulet203            | TechnoStudy123@ | Invalid username or password |
#      | daulet2030@gmail     | TechnoStudy123@ | Invalid username or password |
#      | daulet2030@gmail.com | 123             | Invalid username or password |


