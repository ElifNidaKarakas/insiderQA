import Base.BaseTest;
import Pages.HomePage;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test(description = "Login Button Control")
    public void LoginButtonControl() throws InterruptedException {
        webDriver.get("https://useinsider.com/");
        sleep(2000);
        homePage.loginButton();
        sleep(3000);
    }

    @Test(description = "Hatalı kullanıcı girişi kontrolü")
    public void notValidLogin() throws InterruptedException {
        webDriver.get("https://inone.useinsider.com/login");
        sleep(2000);
        homePage
                .emailDoldur(email);
        sleep(1000);
        homePage
                .passwordDoldur("11111")
                .loginTikla();

        sleep(2000);
        //homePage.hataMesajiKontrolu(errorMessage);

    }

    @Test(description = "Şifre Alanı Maskeleme Butonu Kontrolü")
    public void passwordMaskingControl() throws InterruptedException {
        webDriver.get("https://inone.useinsider.com/login");
        sleep(2000);
        homePage
                .emailDoldur(email);
        sleep(2000);
        homePage.passwordDoldur(password);
        sleep(2000);
        homePage
                .passwordMaskeleme()
                .loginTikla();
        sleep(2000);
    }


    @Test(description = "Bos Karakter Kontrolu")
    public void requiredBlankControl() throws InterruptedException {
        webDriver.get("https://inone.useinsider.com/login");
        sleep(2000);
        homePage
                .emailDoldur("")
                .passwordDoldur("")
                .loginTikla();
        sleep(3000);
//        homePage.mailHataKontrolu(bosMailMessage)
//                .bosPasswordHataMesajiKontrolu(bosPasswordMessage);
        homePage.emailDoldur(email)
                .loginTikla();
        sleep(3000);
        homePage
                .passwordDoldur(password)
                .loginTikla();
        sleep(3000);

    }

    @Test(description = "Minumum Karakter Kontrolü")
    public void minControl() throws InterruptedException {
        webDriver.get("https://inone.useinsider.com/login");
        sleep(2000);
        homePage
                .emailDoldur("1")
                .passwordDoldur("2")
                .loginTikla();
        sleep(3000);
       // homePage.mailHataKontrolu(bosMailMessage);
        homePage.emailTemizle();
        sleep(2000);
        homePage.emailDoldur(email)
                .passwordDoldur("2")
                .loginTikla();
        sleep(2000);
        //homePage.hataMesajiKontrolu(errorMessage);
    }

    @Test(description = "Maximum Karakter Kontrolü")
    public void maxControl() throws InterruptedException {
        webDriver.get("https://inone.useinsider.com/login");
        sleep(2000);
        homePage
                .emailDoldur("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111")
                .passwordDoldur(password);
        sleep(3000);
        homePage.loginTikla();
        Thread.sleep(3000);
       // homePage.mailHataKontrolu(bosMailMessage);
        sleep(3000);
        homePage.emailTemizle()
                .passwordTemizle()
                .emailDoldur(email)
                .loginTikla();
        sleep(3000);
    }
}
