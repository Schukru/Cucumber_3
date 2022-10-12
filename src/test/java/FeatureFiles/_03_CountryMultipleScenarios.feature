Feature: Country Multi Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to country page

  @Test1
  Scenario: Create a country
    When Create a country
    Then Success message should be displayed

    @Test1
  Scenario: Create a counrty parameter data
    When Create a country name as "ismetYni2" code as "code2"
    Then Success message should be displayed
