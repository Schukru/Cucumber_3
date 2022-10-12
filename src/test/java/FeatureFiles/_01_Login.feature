#Senaryo;
#
#

Feature: Login girisi

  @SmokeTest
  Scenario: Login icin kullanici bilgilerini kullan

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly


