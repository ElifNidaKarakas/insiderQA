package Pages;

import Base.BaseLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends BaseLibrary {

    public LoginPage companyButton() {
        webDriver.findElements(By.id("navbarDropdownMenuLink")).get(4).click();

        return this;
    }

    public LoginPage careersButton() {
        webDriver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[6]/div/div[2]/a[2]")).click();
        return this;
    }

    public LoginPage qaAllJob() {
        webDriver.findElement(By.xpath("//*[@id=\"page-head\"]/div/div/div[1]/div/div/a")).click();
        return this;
    }

    public LoginPage locationDropdown() {
        webDriver.findElement(By.xpath("//span[@id='select2-filter-by-location-container']")).click();
        return this;
    }

    public LoginPage locationClick() {
        webDriver.findElement((By.id("select2-filter-by-location-container"))).click();
        //webDriver.findElement(By.cssSelector("#select2-filter-by-location-result-7c4y-Istanbul\\,\\ Turkey")).click();
        return this;
    }

    public LoginPage departmentDropdown() {
        webDriver.findElement(By.xpath("//*[@id=\"select2-filter-by-department-container\"]")).click();
        return this;
    }

    public LoginPage departmentClick() {
        webDriver.findElement(By.id("select2-filter-by-department-container")).click();
        return this;
    }

    public LoginPage viewRoleButton() {
        webDriver.findElement(By.xpath("//*[@id=\"jobs-list\"]/div[1]/div/a")).click();
        return this;
    }

    public LoginPage position() {
        webDriver.findElement(By.xpath("//*[@id=\"jobs-list\"]/div[1]/div")).click();
        return this;
    }


    public LoginPage jobList(){
        // Filtreleme sonrası gelen sonuçları bul
        List<WebElement> jobListings = webDriver.findElements(By.xpath("//*[@id=\"jobs-list\"]"));
        // Kontrol edilmesi gereken kriterler
        String expectedCity = "Istanbul, Turkey";
        String expectedJobTitle = "Quality Assurance";
        boolean allResultsMatchCriteria = true;
        for (WebElement job : jobListings) {
            String city = job.findElement(By.className("[position-department text-large font-weight-600 text-primary]")).getText();
            String jobTitle = job.findElement(By.className("[position-location text-large]")).getText();
            if (!city.equals(expectedCity) || !jobTitle.equals(expectedJobTitle)) {
                allResultsMatchCriteria = false;
                break;
            }
        }
        if (allResultsMatchCriteria) {
            System.out.println("Tüm sonuçlar belirlenen kriterlere uygun.");
        } else {
            System.out.println("Bazı sonuçlar belirlenen kriterlere uygun değil.");
        }
        return this;
    }
}
