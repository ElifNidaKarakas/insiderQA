import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.annotations.Test;

public class InsiderTest extends BaseTest {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    //Visit https://useinsider.com/ and check Insider home page is opened or not
    @Test(description = "Insider Link Kontrolü")
    public void insiderLinkControl() throws InterruptedException {
        webDriver.get("https://useinsider.com/");
        sleep(2000);
    }

    //Select the “Company” menu in the navigation bar, select “Careers” and check Career page, its Locations, Teams, and Life at Insider blocks are open or not
    @Test(description = "Company Buton Kontrolü")
    public void companyButonControl() throws InterruptedException {
        webDriver.get("https://useinsider.com/");
        sleep(2000);
        mainPage.acceptAllButonClick();
        Thread.sleep(2000);
        loginPage.companyButton();
        Thread.sleep(2000);
        loginPage.careersButton();
    }

    //Go to https://useinsider.com/careers/quality-assurance/, click “See all QA jobs”, filter jobs by Location:
    // “Istanbul, Turkey”, and Department: “Quality Assurance”, check the presence of the job list
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
        sleep(10000);
    }

    //Check that all jobs’ Position contains “Quality Assurance”, Department contains “Quality Assurance”, and Location contains “Istanbul, Turkey”
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

    //Click the “View Role” button and check that this action redirects us to the Lever Application form page
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