package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TechGlobalCheckboxPage extends TechGlobalBasePage{

    public TechGlobalCheckboxPage(){
        super();
    }

    @FindBy(css = "#checkbox-button-group_1 input")
    public List<WebElement> checkBoxesPart1;
}
