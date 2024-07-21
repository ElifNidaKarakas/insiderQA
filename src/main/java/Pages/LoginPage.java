package Pages;

import Base.BaseLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.browser.model.Bucket;

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

    public LoginPage locationFilter() {
        webDriver.findElement(By.xpath("//*[@id=\"top-filter-form\"]/div[1]/span/span[1]/span/span[2]")).click();
        return this;
    }

    public LoginPage locationClick() {
        webDriver.findElement(By.cssSelector("#select2-filter-by-location-result-d323-Istanbul\\,\\ Turkey")).click();
        return this;
    }

    public LoginPage departmentFilter(){
        webDriver.findElement(By.xpath("//*[@id=\"select2-filter-by-department-container\"]")).click();
        return this;
    }

    public LoginPage departmentClick(){
        webDriver.findElement(By.id("id=select2-filter-by-department-container")).click();
        return this;
    }
}
