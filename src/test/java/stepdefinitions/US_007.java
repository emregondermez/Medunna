package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.EmrePage;
import utilities.ReusableMethods;

public class US_007 {

    EmrePage emrePage ;
    @Given("EG hasta MY PAGES elementine tiklar")
    public void eg_hasta_my_pages_elementine_tiklar() {
        emrePage = new EmrePage();
        emrePage.myPagesElementi.click();
    }
    @Given("EG hasta Make an appointment secenegine tiklar")
    public void eg_hasta_make_an_appointment_secenegine_tiklar() {
        emrePage = new EmrePage();
        emrePage.makeAnAppointment.click();

    }
    @Given("EG hasta telefon numarasi girer")
    public void eg_hasta_telefon_numarasi_girer() {
        emrePage = new EmrePage();

        emrePage.phoneNumberTextBox.sendKeys("1232344345");
    }

    @Given("EG hasta Appointment date can not be past date! yazisini gorunur")
    public void eg_hasta_appointment_date_can_not_be_past_date_yazisini_gorunur() {
        emrePage = new EmrePage();
        Assert.assertTrue(emrePage.gecersizTarihUyarisi.isEnabled());
    }
    @Given("EG hasta Appointment date can not be past date! yazisini gormez")
    public void eg_hasta_appointment_date_can_not_be_past_date_yazisini_gormez() {
        emrePage = new EmrePage();
        Assert.assertFalse(emrePage.gecersizTarihUyarisi.isEnabled());
    }


    @Given("EG hasta send an appointment request secenegine tiklar")
    public void eg_hasta_send_an_appointment_request_secenegine_tiklar() {
        emrePage = new EmrePage();
        emrePage.sendAnAppointmentRequest.click();
        ReusableMethods.waitFor(3);
    }

    @Given("EG hasta EG hasta tarih olarak eski tarih {string} girer")
    public void eg_hasta_eg_hasta_tarih_olarak_eski_tarih_girer(String date) {
        emrePage = new EmrePage();
        emrePage.dateTextBox.sendKeys(date);
        ReusableMethods.waitFor(3);

    }
    @Given("EG hasta tarih olarak guncel tarih {string} girer")
    public void eg_hasta_tarih_olarak_guncel_tarih_girer(String date) {
        emrePage = new EmrePage();
        emrePage.dateTextBox.sendKeys(date);
        ReusableMethods.waitFor(3);
    }


    @Given("EG hasta yil-ay-gun formatinda tarih girer")
    public void eg_hasta_yil_ay_gun_formatinda_tarih_girer() {
        emrePage = new EmrePage();
        emrePage.dateTextBox.sendKeys("2023.02.01");
    }
}
