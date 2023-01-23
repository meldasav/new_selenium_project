package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TechGlobalRadioButtonsPage extends TechGlobalBasePage{
    public TechGlobalRadioButtonsPage(){
       super();
    }
    @FindBy(css = "#radio-button-group_1 input")
    public List<WebElement> checkboxes;

    @FindBy(css = "#radio-button-group_1 label")
    public List<WebElement> checkBoxesLabel;

    @FindBy(css="#radio-button-group_2 input")
    public List<WebElement> checkBoxes2;
}
