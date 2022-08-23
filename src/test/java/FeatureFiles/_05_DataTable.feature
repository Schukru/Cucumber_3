Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Accept All Cookies

  Scenario: Create Country
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | countries  |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | ismetCoun21 |
      | codeInput | 121233      |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | ismetCoun21 |

    And Success message should be displayed

  Scenario: Create a Nationality
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | nationalities |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | Sukru1 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | Sukru1 |

    And Success message should be displayed

  Scenario: Create a Fee, delete Fee
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | fees          |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | feeName         | Kurs Ucreti-1   |
      | feeCode         | Ucret-1         |
      | integrationCode | 1               |
      | priority        | 4               |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

#    And User delete item from Dialog
#      | Sukru1 |
#
#    And Success message should be displayed

    #    Senaryo Outline da verilen değerler için tüm senaryo her satır kadar tekrar çalıştırılıyordu.
    #    DataTable da ise, sadece ilgili step için toplu veri gönderme imkanı oluşuyor.

