package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TechGlobalDynamicElementsPage extends TechGlobalBasePage{
    public TechGlobalDynamicElementsPage(){
        super();
    }

    @FindBy(xpath= "(//p[starts-with(@id,'box')])[1]")
    public WebElement box1;

    @FindBy(xpath= "(//p[starts-with(@id,'box')])[2]")
    public WebElement box2;
}
