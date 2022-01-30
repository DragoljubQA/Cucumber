@UI
Feature: Login

  Background:
    Given user is on login page

  Scenario: User can log in using valid credentials
      When user inputs valid username "DragoQA"
      And user inputs valid password "Qwerty123!@#"
      And user clicks on Login button
      Then user is redirected to profile

  Scenario Outline: User cannot log in using incorrect password
        When user inputs valid username "DragoQA"
        And user inputs incorrect password <password>
        And user clicks on Login button
        Then user did not log in
        Examples:
          | password |
          | "qwerty123!@#" |
          | "Qwerty123"    |
          | "QWERTY123!@#" |
          | "Qwerty!@#"    |

  Scenario Outline: User cannot log in using incorrect username
    When user inputs incorrect username <username>
    And user inputs valid password "Qwerty123!@#"
    And user clicks on Login button
    Then user did not log in
    And profile page is not present
    Examples:
      | username |
      | "Drago"  |
      | "QA"     |
      | "Qwerty123!@#" |
      | "dragoqa"      |
      | "DRAGOQA"      |
      | "Drago QA"     |

