import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.annotations.Test;

public class InsiderTest extends BaseTest {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Test(description = "Insider Link Kontrolü")
    public void insiderLinkControl() throws InterruptedException {
        webDriver.get("https://useinsider.com/");
        sleep(2000);
    }

    @Test(description = "Company Buton Kontrolü")
    public void companyButonControl() throws InterruptedException {
        webDriver.get("https://useinsider.com/");
        sleep(2000);
        mainPage.acceptAllButonClick();
        sleep(2000);
        loginPage.companyButton();
        sleep(2000);
        loginPage.careersButton();
    }

    @Test
    public void filterJob() throws InterruptedException {
        webDriver.get("https://useinsider.com/careers/quality-assurance/");
        sleep(2000);
        mainPage.acceptAllButonClick();
        sleep(1000);
        loginPage.qaAllJob();
        sleep(20000);
        loginPage.locationDropdown();
        sleep(2000);
        loginPage.locationClick();
        sleep(1000);
        loginPage.departmentDropdown();
        sleep(2000);
        loginPage.departmentClick();
        sleep(5000);
    }

      @Test
    public void jobListControl() throws InterruptedException {
        webDriver.get("https://useinsider.com/careers/quality-assurance/");
        sleep(2000);
        mainPage.acceptAllButonClick();
        sleep(1000);
        loginPage.qaAllJob();
        sleep(20000);
        loginPage.locationDropdown();
        sleep(2000);
        loginPage.locationClick();
        sleep(1000);
        loginPage.departmentDropdown();
        sleep(2000);
        loginPage.departmentClick();
        sleep(10000);
        loginPage.jobList();
        sleep(1000);
    }

  @Test
    public void voiwRollerButtonLinkControl() throws InterruptedException {
        webDriver.get("https://useinsider.com/careers/quality-assurance/");
        sleep(2000);
        mainPage.acceptAllButonClick();
        sleep(1000);
        loginPage.qaAllJob();
        sleep(5000);
        loginPage.position();
        sleep(3000);
        loginPage.viewRoleButton();
        sleep(5000);
    }
}