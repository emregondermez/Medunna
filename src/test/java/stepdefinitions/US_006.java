package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_006 {
    EmrePage emrePage;
    @Given("EG Kullanici medunna.com adresine gider")
    public void eg_kullanici_medunna_com_adresine_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        emrePage= new EmrePage();
        Assert.assertTrue(emrePage.welcomeToMedunna.isEnabled());

    }


    @Given("EG Kullanici Account Menu ikonuna tiklar")
    public void eg_kullanici_account_menu_ikonuna_tiklar() {
        emrePage= new EmrePage();
        emrePage.girisIkonu.click();

    }
    @Given("EG Kullanici sign in secenegine tiklar")
    public void eg_kullanici_sign_in_secenegine_tiklar() {
        emrePage= new EmrePage();
        emrePage.anaSayfaSignIn.click();
        Assert.assertTrue(emrePage.signInMenusu.isEnabled());
    }
    @Given("EG Kullanici username kutusuna {string} girer")
    public void eg_kullanici_username_kutusuna_girer(String username) {
        emrePage= new EmrePage();
        emrePage.girisUsernameTextBox.sendKeys(username);
    }
    @Given("EG Kullanici Password kutusuna {string} girer")
    public void eg_kullanici_password_kutusuna_girer(String password) {
        emrePage= new EmrePage();
        emrePage.girisPasswordTextBox.sendKeys(password);

        ReusableMethods.waitFor(2);
    }
    @Given("EG Kullanici sign in butonuna tiklar")
    public void eg_kullanici_sign_in_butonuna_tiklar() {
        emrePage= new EmrePage();
    emrePage.girisSignInButton.click();
    Assert.assertTrue(emrePage.myPagesElementi.isEnabled());
        ReusableMethods.waitFor(3);

    }
    @Given("EG Kullanici sag ust kosede bulunan kullanici ismine tiklar")
    public void eg_kullanici_sag_ust_kosede_bulunan_kullanici_ismine_tiklar() {
        emrePage= new EmrePage();
        emrePage.sagUstKullaniciAdi.click();
    Assert.assertTrue(emrePage.settingsButton.isEnabled());
    }
    @Given("EG Kullanici settings secenigine tiklar")
    public void eg_kullanici_settings_secenigine_tiklar() {
        emrePage= new EmrePage();
        emrePage.settingsButton.click();
    Assert.assertTrue(emrePage.userSettingsFor.isEnabled());
        ReusableMethods.waitFor(2);

    }
    @Given("EG Firstname kutusundaki isim kayit olurken girilen {string} olmali")
    public void eg_firstname_kutusundaki_isim_kayit_olurken_girilen_olmali(String firstname) {
        emrePage= new EmrePage();
        String actualFirstname= emrePage.settingsFirstnameTextBox.getAttribute("value");
        System.out.println(actualFirstname);
        Assert.assertEquals(actualFirstname,firstname);
    }
    @Given("EG last name  kutusundaki soy isim kayit olurken girilen {string} olmali")
    public void eg_last_name_kutusundaki_soy_isim_kayit_olurken_girilen_olmali(String lastname) {
        emrePage= new EmrePage();
        String actualLastname = emrePage.settingsLastnameTextBox.getAttribute("value");
    Assert.assertEquals(actualLastname,lastname);
    }
    @Given("EG email kutusundaki mail adresi  kayit olurken girilen {string} olmali")
    public void eg_email_kutusundaki_mail_adresi_kayit_olurken_girilen_olmali(String email) {
        emrePage= new EmrePage();
        String actualEmail= emrePage.settingsEmailTextBox.getAttribute("value");
    Assert.assertEquals(actualEmail,email);
    }
    @Given("EG kullanici uygulamayi kapatir")
    public void eg_kullanici_uygulamayi_kapatir() {
    Driver.closeDriver();
    }
}
