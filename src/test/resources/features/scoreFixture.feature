Feature: As a business user, I would like to make a record of all teams which are playing today


  Scenario: Output all team names with a match today. If there are no matches today, output a message to convey this.
    Given user lands on the "Fixtures" page
    When user sees all team names with a match today
    And if there is no matches today display, a message
