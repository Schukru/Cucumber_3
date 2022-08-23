Feature:  Citizenship with scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to Citizenship page

  Scenario Outline: Citizenship create
    When User a Citizenship name as "<ulkeAdi>" short name as "<ulkeKodu>"
    Then Success message should be displayed

    When User a Citizenship name as "<ulkeAdi>" short name as "<ulkeKodu>"
    Then Already exist message should be displayed
    And Click on close button

    When User Delete The "<ulkeAdi>"
    Then Success message should be displayed

    Examples:
    | ulkeAdi | ulkeKodu |
    | ulk1 | kod1 |
    | ule2 | kod2 |
    | uke3 | kod3 |
    | lke4 | kod4 |
    | ule5 | kod5 |
    | uke6 | kod6 |
