package demo;

import browser.InitDriver;
import elements.UserDefineData;
import elements.ConfigureElement;
import elements.Element;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Queue;

public class DemoChrom {
	@Test
	public void main() {
		// TODO Auto-generated method stub

		WebDriver driver = InitDriver.initBrowser("chrome");

		driver.get("http://www.baidu.com");

		Queue<Element> elements = ConfigureElement.getElements(driver);

		UserDefineData.assign(elements);


		driver.close();
	}

}
