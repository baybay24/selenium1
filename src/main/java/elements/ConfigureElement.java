package elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tools.ReadPropertyFile;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Logger;

/**
 * 根据配置文件读取web端控件
 */
public class ConfigureElement {

    public static Queue<Element> getElements(WebDriver driver){
        String fileName = "UI.properties";
        Properties props = ReadPropertyFile.read(fileName);

        if (props != null) {
            Iterator it =  props.propertyNames().asIterator();
            Queue queue = new ArrayBlockingQueue(200);

            while(it.hasNext()){
                String attributeType = (String) it.next();
                String attributeValue = props.getProperty(attributeType);
                WebElement element = getWebElement(driver, attributeValue);
                if(element!=null){
                    Element elementAtrr = new Element();
                    elementAtrr.setAttributeType(attributeType);
                    elementAtrr.setElement(element);
                    queue.add(elementAtrr);
                }

            }
            return queue;
        } else {
            Logger.getLogger("Controller").info("读取文件失败");

        }
            return null;
    }

    private static WebElement getWebElement(WebDriver driver, String attributeValues) {
            String attributeType = attributeValues.split(">")[0];
            String attributeValue = attributeValues.split(">")[1];

            if (attributeType.equalsIgnoreCase("id"))
                return driver.findElement(By.id(attributeValue));
            else if (attributeType.equalsIgnoreCase("name"))
                return driver.findElement(By.name(attributeValue));
            else if (attributeType.equalsIgnoreCase("className"))
                return driver.findElement(By.className(attributeValue));
            else if (attributeType.equalsIgnoreCase("cssSelector"))
                return driver.findElement(By.cssSelector(attributeValue));
            else if (attributeType.equalsIgnoreCase("linkText"))
                return driver.findElement(By.linkText(attributeValue));
            else if (attributeType.equalsIgnoreCase("partialLinkText"))
                return driver.findElement(By.partialLinkText(attributeValue));
            else if (attributeType.equalsIgnoreCase("tagName"))
                return driver.findElement(By.tagName(attributeValue));
            else if (attributeType.equalsIgnoreCase("xpath"))
                return driver.findElement(By.xpath(attributeValue));

        return null;
    }
}
