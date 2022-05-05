Feature: Android Login

  @BrowserStack
  Scenario: Cinsiyet secimi yapilmadan basarili login
    When Splash Ekranindan Turkiye secilir
    Then Cinsiyet secimi yapilmadan devam edilir
    Then Navigation Bar alanindan hesabim butonuna tiklanir
    Then "tolga.test@yandex.com" User email bilgisi yazilir
    Then "123123Tek" User password bilgisi yazilir
    Then Submit butonuna basilir
    Then Rootbarda tiklama islemi yapilir
    Then "tolga.test@yandex.com" Email bilgisi kontrol edilir