package Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

    public class BaseTest extends BaseLibrary {

    @BeforeMethod
    public void setUp() throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        sleep(3000);

    }

    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }
}