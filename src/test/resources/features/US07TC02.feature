@test05
Feature: US07 TC02

  Scenario: HastaTarih sırası gün/ay/yıl  formatinda guncel tarih girer

    Given EG Kullanici medunna.com adresine gider
    And EG Kullanici Account Menu ikonuna tiklar
    And EG Kullanici sign in secenegine tiklar
    And EG Kullanici username kutusuna "PatientEmr" girer
    And EG Kullanici Password kutusuna "Asdf1!" girer
    And EG Kullanici sign in butonuna tiklar
    And EG hasta MY PAGES elementine tiklar
    And EG hasta Make an appointment secenegine tiklar
    And EG hasta telefon numarasi girer
    And EG hasta tarih olarak guncel tarih "02.02.2023" girer
    Then EG kullanici uygulamayi kapatir



    Scenario: Hasta Tarih sırası gün/ay/yıl  formatinda guncel tarih girer
      Given EG Kullanici medunna.com adresine gider
      And EG Kullanici Account Menu ikonuna tiklar
      And EG Kullanici sign in secenegine tiklar
      And EG Kullanici username kutusuna "PatientEmr" girer
      And EG Kullanici Password kutusuna "Asdf1!" girer
      And EG Kullanici sign in butonuna tiklar
      And EG hasta MY PAGES elementine tiklar
      And EG hasta Make an appointment secenegine tiklar
      And EG hasta telefon numarasi girer
      And EG hasta yil-ay-gun formatinda tarih girer
      And EG hasta Appointment date can not be past date! yazisini gorunur
      Then EG kullanici uygulamayi kapatir