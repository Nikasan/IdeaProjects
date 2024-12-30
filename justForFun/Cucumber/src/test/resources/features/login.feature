Feature: Simple login test

  Scenario: lets open google
    Given user open browser Chrome by URL
    Then the page is opened
    And close browser
