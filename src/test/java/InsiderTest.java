import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.annotations.Test;

public class InsiderTest extends BaseTest {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Test(description = "Company Buton Kontrolü")
    public void companyButonKontrol() throws InterruptedException {
        webDriver.get("https://useinsider.com/");
        sleep(2000);
        mainPage.acceptAllButonClick();
        Thread.sleep(2000);
        loginPage.companyButton();
        Thread.sleep(2000);
        loginPage.careersButton();

    }

    @Test(description = "Şehir ve meslek filtreleme")
    public void filterJob() throws InterruptedException {
        webDriver.get("https://useinsider.com/careers/quality-assurance/");
        sleep(2000);
        mainPage.acceptAllButonClick();
        sleep(1000);
        loginPage.qaAllJob();
        sleep(2000);
        loginPage.locationFilter();
        sleep(1000);
        loginPage.locationClick();
        sleep(1000);
        loginPage.departmentFilter();
        sleep(2000);
        loginPage.departmentClick();

    }
}