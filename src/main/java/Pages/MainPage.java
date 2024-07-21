package Pages;

import Base.BaseLibrary;
import org.openqa.selenium.By;

public class MainPage extends BaseLibrary {

    public MainPage acceptAllButonClick() {
        webDriver.findElement(By.xpath("//*[@id=\"wt-cli-accept-all-btn\"]")).click();
        return this;
    }
}
