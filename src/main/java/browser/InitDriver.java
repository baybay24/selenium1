package browser;

import org.openqa.selenium.WebDriver;
import tools.ReadPropertyFile;

import java.util.Properties;

public class InitDriver  {

    public static WebDriver initBrowser(String browserName){
        String fileName = "driver.properties";
        Properties props = ReadPropertyFile.read(fileName);
        if (props != null) {
            WebDriver driver = SelectDriver.getDriverByFile(browserName, props);
            return driver;
        } else {
            WebDriver driver = SelectDriver.getDriverConstants(browserName);
            return driver;
        }
    }

}
