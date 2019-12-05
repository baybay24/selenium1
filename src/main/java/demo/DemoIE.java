package demo;

import browser.InitDriver;
import elements.ConfigureElement;
import elements.Element;
import elements.UserDefineData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.Queue;

public class DemoIE {
	@Test
	public static void main() {
		// TODO Auto-generated method stub


		WebDriver driver = InitDriver.initBrowser("ie");

		driver.get("http://www.baidu.com");

		Queue<Element> elements = ConfigureElement.getElements(driver);

		UserDefineData.assign(elements);

		driver.findElement(By.className("wd")).sendKeys("limit");
		driver.findElement(By.id("su")).submit();



//		driver.close();
	}

}
