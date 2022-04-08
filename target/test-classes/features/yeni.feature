Feature: new
@test2
  Scenario: new

    Given EG Kullanici medunna.com adresine gider
    And EG Kullanici Account Menu ikonuna tiklar
    And EG Kullanici sign in secenegine tiklar
    And EG Kullanici username kutusuna "DoctorEmr" girer
    And EG Kullanici Password kutusuna "Asdf1!" girer
    And EG Kullanici sign in butonuna tiklar
    Then EG kullanici uygulamayi kapatir

  @test2
    Scenario:
      Given EG Kullanici medunna.com adresine gider
      And EG Kullanici Account Menu ikonuna tiklar
      And EG Kullanici sign in secenegine tiklar
      And EG Kullanici username kutusuna "PatientEmr" girer
      And EG Kullanici Password kutusuna "Asdf1!" girer
      And EG Kullanici sign in butonuna tiklar
      Then EG kullanici uygulamayi kapatir