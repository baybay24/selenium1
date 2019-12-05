package elements;

import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementSelector {

	private static WebDriver driver;
	private static Properties props;
	
	public WebElementSelector(WebDriver driver) {
		WebElementSelector.driver = driver;
	}

	public WebElement getElementBy (String name) {	
				
				String value = props.getProperty(name);
									
				if(name.equalsIgnoreCase("id")) {
					return driver.findElement(By.id(value)); 
				}
				else if(name.equalsIgnoreCase("name")) {
					return driver.findElement(By.name(value));
				}
				else if(name.equalsIgnoreCase("className")) {
					return driver.findElement(By.className(value));
				}
				else if(name.equalsIgnoreCase("selector")) {
					return driver.findElement(By.cssSelector(value));
				}
				else if(name.equalsIgnoreCase("xpathExpression")) {
					return driver.findElement(By.xpath(value));
				}
				else if(name.equalsIgnoreCase("linkText")) {
					return driver.findElement(By.linkText(value));
				}
				else if(name.equalsIgnoreCase("tagName")) {
					return driver.findElement(By.tagName(value));
				}
				else if(name.equalsIgnoreCase("partialLinkText")) {
					return driver.findElement(By.partialLinkText(value));
				}
				else if(name.equalsIgnoreCase("selector")) {
					return driver.findElement(By.cssSelector(value));
				}
					
		return null;
	}
	
}
