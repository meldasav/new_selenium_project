package scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalWaitsPage;
import utilities.Driver;
import utilities.Waiter;

public class TechGlobalWaitsTest extends Base{

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalWaitsPage = new TechGlobalWaitsPage();
    }

    @Test(priority = 1,description = "implement waits")
    public void implementWaits(){
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(3);
        techGlobalWaitsPage.redButton.click();
        Assert.assertTrue(techGlobalWaitsPage.actualRedBox.isDisplayed());
        techGlobalWaitsPage.blueButton.click();

        Waiter.waitForVisibilityOfElement(techGlobalWaitsPage.actualBlueBox,60);
        Assert.assertTrue(techGlobalWaitsPage.actualBlueBox.isDisplayed());

    }
}
