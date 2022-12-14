Feature: Entrance Exam Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

    @Test1
  Scenario: Create and delete an exam

    And Click on the element in the left Nav
      | entranceexamsone  |
      | setuptwo          |
      | entranceexamstwo  |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | SukruExam2 |

    And Click on the element in the Form Content
      | AcademicPeriod  |
      | period1         |
      | GradeLevel      |
      | level1          |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And Click on the element in the left Nav
      | entranceexamsone  |
      | setuptwo          |
      | entranceexamstwo  |

    And User delete item from Dialog
      | SukruExam2 |

    And Success message should be displayed

    #    Senaryo Outline da verilen değerler için tüm senaryo her satır kadar tekrar çalıştırılıyordu.
    #    DataTable da ise, sadece ilgili step için toplu veri gönderme imkanı oluşuyor.

