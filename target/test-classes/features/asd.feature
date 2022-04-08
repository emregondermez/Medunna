@test01
Feature:06_TC_01_Kullanıcı bilgileri



  Scenario Outline:  "firstname, lastname, email" girerken doldurulan kullanıcı bilgileri olmalıdır
    Given EG Kullanici medunna.com adresine gider
    And EG Kullanici Account Menu ikonuna tiklar
    And EG Kullanici sign in secenegine tiklar
    And EG Kullanici username kutusuna "<username>" girer
    And EG Kullanici Password kutusuna "<password>" girer
    And EG Kullanici sign in butonuna tiklar
    And EG Kullanici sag ust kosede bulunan kullanici ismine tiklar
    And EG Kullanici settings secenigine tiklar
    And EG Firstname kutusundaki isim kayit olurken girilen "<firstname>" olmali
    And EG last name  kutusundaki soy isim kayit olurken girilen "<lastname>" olmali


    And EG kullanici uygulamayi kapatir



    Examples:test_data
  |username|password|firstname|lastname|

  |UserEmr|Asdf1!|User      |Emr       |
 |PatientEmr|Asdf1!|Patient|Emr       |
 |StaffEmr|Asdf1!|Staff    |Emr       |
  |DoctorEmr |Asdf1!|Doctor |Emr       |
  |AdminEmr|Asdf1!|Admin    |Emr       |







