package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TechGlobalWaitsPage extends TechGlobalBasePage{
    public TechGlobalWaitsPage(){
        super();
    }
    @FindBy(id="red")
    public WebElement redButton;

    @FindBy(css = "button[class*='Box_c_box__Dvm3y Waits_red_box__k1UYZ box']")
    public WebElement actualRedBox;

    @FindBy(id="blue")
    public WebElement blueButton;

    @FindBy(css = "button[class*='Box_c_box__Dvm3y Waits_blue_box_']")
    public WebElement actualBlueBox;

}
