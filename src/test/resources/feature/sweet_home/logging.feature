Feature: User is trying to logging in application
  Scenario: Logging to SweetHome
    Given I'm on sweethome logging page
    When User input login 'user'
    And User input password 'password'
    Then Login should be accept
    When User press button exit
    Then User logout