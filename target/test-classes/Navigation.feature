@UI
Feature: Navigation feature

  Scenario: User can navigate to sidebar from homepage
    Given user is on homepage
    When user clicks on Elements button
    Then sidebar is displayed
    And Elements URL is present