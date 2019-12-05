package pages;

import browser.InitDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public InitDriver driver;

    public  BasePage(InitDriver driver){
        this.driver = driver;
    }


}
