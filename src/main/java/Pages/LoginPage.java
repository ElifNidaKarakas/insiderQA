package Pages;

import Base.BaseLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.qameta.allure.Step;

import java.util.List;

public class LoginPage extends BaseLibrary {
    @Step("Click on the Company button.")
    public LoginPage companyButton() {
        webDriver.findElements(By.id("navbarDropdownMenuLink")).get(4).click();

        return this;
    }

    @Step("Click on the Careers button.")
    public LoginPage careersButton() {
        webDriver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[6]/div/div[2]/a[2]")).click();
        return this;
    }

    @Step("Click on the Find your dream job button.")
    public LoginPage qaAllJob() {
        webDriver.findElement(By.xpath("//*[@id=\"page-head\"]/div/div/div[1]/div/div/a")).click();
        return this;
    }

    @Step("Location dropdown is clicked")
    public LoginPage locationDropdown() {
        webDriver.findElement(By.xpath("//span[@id='select2-filter-by-location-container']")).click();
        return this;
    }

    @Step("Location is selected")
    public LoginPage locationClick() {
        webDriver.findElement((By.id("select2-filter-by-location-container"))).click();
        return this;
    }

    @Step("Department dropdown is clicked ")
    public LoginPage departmentDropdown() {
        webDriver.findElement(By.xpath("//*[@id=\"select2-filter-by-department-container\"]")).click();
        return this;
    }

    @Step("Department is selected")
    public LoginPage departmentClick() {
        webDriver.findElement(By.id("select2-filter-by-department-container")).click();
        return this;
    }

    @Step("Click on Position ")
    public LoginPage position() {
        webDriver.findElement(By.xpath("//*[@id=\"jobs-list\"]/div[1]/div]")).click();
        // webDriver.findElements((By.className("[class='btn btn-navy rounded pt-2 pr-5 pb-2 pl-5']"))).get(0).click();
        return this;
    }

    @Step("Click on the View role button")
    public LoginPage viewRoleButton() {
        webDriver.findElement(By.xpath("//*[@id=\"jobs-list\"]/div[1]/div/a]")).click();
        return this;
    }

    @Step("It is checked whether the incoming results comply with the filter.")
    public LoginPage jobList() {
        List<WebElement> jobListings = webDriver.findElements(By.xpath("//*[@id=\"jobs-list\"]"));

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
            System.out.println("All results meet the established criteria.");
        } else {
            System.out.println("Some results do not meet the established criteria.");
        }

        return this;
    }
}