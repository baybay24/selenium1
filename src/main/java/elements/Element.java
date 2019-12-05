package elements;

import org.openqa.selenium.WebElement;

public class Element {

    private  String attributeType;
    private WebElement element;

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    public WebElement getElement() {
        return element;
    }

    public void setElement(WebElement element) {
        this.element = element;
    }
}
