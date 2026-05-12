Feature: Test Facebook smoke scenario

  Scenario Outline: Test login with valid credentials
    Given Open chrome and start application
    When I enter valid "<username>" and valid "<password>"
    Then user should be able to login successfully
    Then application should be closed

    Examples: 
      | username         |  | password  |
      | tiger1@gmail.com |  | password1 |
      | tiger2@gmail.com |  | password2 |
      | tiger3@gmail.com |  | password3 |
      | tiger4@gmail.com |  | password4 |
