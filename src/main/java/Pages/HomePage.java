package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BaseLibrary {

    public HomePage loginButton() {
        webDriver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul[2]/li[1]/a")).click();
        return this;
    }

    @Step("Email Alanı Doldurulur")
    public HomePage emailDoldur(String email) {
        webDriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
        return this;
    }

    @Step("Parola Alanı Doldurulur")
    public HomePage passwordDoldur(String password) {
        webDriver.findElement(By.id("password")).sendKeys(password);
        return this;
    }

    @Step("Login Butonuna Tıklanır")
    public HomePage loginTikla() {
        webDriver.findElement(By.id("login-button")).click();
        return this;
    }

    @Step("Hata Mesajı Kontrolü: {text}")
    public HomePage hataMesajiKontrolu(String text) {
        String value = webDriver.findElement(By.xpath("//*[@id=\"page\"]/div/div[1]/div/div[1]/div/div/p")).getText();
        Assert.assertEquals(text, value);
        return this;
    }

    @Step("Hata Mesajı Kontrolü: {text}")
    public HomePage mailHataKontrolu(String text) {
        String value = webDriver.findElement(By.xpath("//*[@id=\"page\"]/div/div[1]/div/fieldset[1]/p")).getText();
        Assert.assertEquals(text, value);
        return this;
    }

    @Step("Hata Mesajı Kontrolü: {text}")
    public HomePage bosPasswordHataMesajiKontrolu(String text) {
        String value = webDriver.findElement(By.xpath("//*[@id=\"page\"]/div/div[1]/div/fieldset[2]/p")).getText();
        Assert.assertEquals(text, value);
        return this;
    }

    public HomePage passwordMaskeleme() {
        webDriver.findElement(By.cssSelector("#page > div > div.d-g.a-i-c.j-c-c.o-y-s.login-form > div > fieldset:nth-child(4) > svg")).click();
        return this;
    }

    public HomePage emailTemizle() {
        webDriver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
        return this;
    }

    public HomePage passwordTemizle() {
        webDriver.findElement(By.id("password")).clear();
        return this;
    }

    public HomePage loginWithSSOButton(){
        webDriver.findElement(By.id("sso-login-button")).click();
        return this;
    }

    public HomePage resetPasswordButton(){
        webDriver.findElement(By.id("reset-password")).click();
        return this;
    }

    public HomePage neverRegesteredBeforeButton(){
        webDriver.findElement(By.id("never-registered")).click();
        return this;
    }
}
