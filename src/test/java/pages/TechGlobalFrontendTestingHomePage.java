package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TechGlobalFrontendTestingHomePage extends TechGlobalBasePage{
    public TechGlobalFrontendTestingHomePage(){
        super();
    }
    @FindBy(css = ".CardGrids_CardGrids__qDdyI>div")
    public List<WebElement> allCard;

    public void getFrontendTestingPage(){
        headerDropdown.click();
        headerDropdownOptions.get(0).click();
    }

    public void clickOnCard(String cardText){
        for(WebElement card : allCard){
            if(card.getText().equals(cardText)){
                card.click();
                break;
            }
        }
    }

    public void clickOnCard(int index){
        allCard.get(index).click();
    }
}
