@test03
Feature: US06 TC02-03-04

  Scenario Outline:
    Given EG Kullanici medunna.com adresine gider
    And EG Kullanici Account Menu ikonuna tiklar
    And EG Kullanici sign in secenegine tiklar
    And EG Kullanici username kutusuna "<username>" girer
    And EG Kullanici Password kutusuna "<password>" girer
    And EG Kullanici sign in butonuna tiklar
    And EG Kullanici sag ust kosede bulunan kullanici ismine tiklar
    And EG Kullanici settings secenigine tiklar
    And EG kullanici firstname kutusuna yeni "<newFirstname>" yazar
    And EG kullanici lastname kutusuna yeni "<newLastname>" yazar
    And EG kullanici email kutusuna yeni "<newEmail>" yazar
    And EG kullanici save butonuna basar ve degisiklikleri kaydeder
    Then EG kullanici uygulamayi kapatir


    Examples: test-data
      |username|password|newFirstname|newLastname|newEmail|
      |DoctorEmr |Asdf1!|Doctor |Emr       |asdf@gmail.com|
      |PatientEmr|Asdf1!|Patient|Emr       |asdfg1@gmail.com|
      |StaffEmr|Asdf1!|Staff    |Emr       |asdfghjk@gmail.com|