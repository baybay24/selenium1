package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DemoIE {
	@Test
	public static void main() {
		// TODO Auto-generated method stub
		String rootPath = new DemoIE().getClass().getResource("").getPath();
		System.out.print(rootPath);
		System.setProperty("webdriver.ie.driver", "D:\\software\\driver\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();

		driver.get("http://www.baidu.com");
	}

}
