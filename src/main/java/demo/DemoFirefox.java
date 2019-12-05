package demo;



import java.util.Queue;

import elements.UserDefineData;
import elements.ConfigureElement;
import browser.InitDriver;
import elements.Element;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoFirefox {

@Test
	public void main() throws InterruptedException {
		// TODO Auto-generated method stub

	//initial web driver

		WebDriver driver = InitDriver.initBrowser("firefox");

		driver.get("http://www.baidu.com");

		Queue<Element> elements = ConfigureElement.getElements(driver);

		UserDefineData.assign(elements);

//		TimeUnit.SECONDS.sleep(2);

		driver.close();
	}
}
