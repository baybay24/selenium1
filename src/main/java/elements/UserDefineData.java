package elements;

import elements.Element;
import org.openqa.selenium.WebElement;
import tools.ReadPropertyFile;

import java.util.*;

public class UserDefineData {

    public static void assign(Queue<Element> queue){
        String fileName = "data.properties";
        Properties props = ReadPropertyFile.read(fileName);



        if (props != null) {
            while (true) {
                Element ele = queue.poll();
                if(ele!=null){
                    String attributeType = ele.getAttributeType();
                    String attributeValue = props.getProperty(attributeType);
                    WebElement element = (WebElement) ele.getElement();
                    selectType(attributeType,attributeValue,element);
                }

            }
        }
    }


    private static void selectType(String type, String attributeValue, WebElement element){
        if(type.equalsIgnoreCase("input")){
            element.sendKeys(attributeValue);
        }
        else if(type.equalsIgnoreCase("button")){
            element.submit();
        }
    }
}
