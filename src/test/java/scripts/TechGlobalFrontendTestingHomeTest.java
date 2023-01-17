package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;

public class TechGlobalFrontendTestingHomeTest extends Base{
    @BeforeMethod
     public void setPage() {
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();

    }
    @Test(priority = 1,description = "all cards validation")
    public void validate_allCards() {
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        String[] list = {"Locators",
                "Xpath-CSS Locators",
                "Dynamic Elements",
                "Waits",
                "Dropdowns",
                "Radio Buttons",
                "Checkboxes",
                "Alerts",
                "IFrames",
                "Multiple Windows",
                "Static Tables",
                "Dynamic Tables",
                "File Upload",
                "File Download",
                "Actions",
                "Login Form",
                "Forgot Password",
                "Sortable Tables",
                "Pagination",
                "Calendar"};
        for (int i = 0; i < techGlobalFrontendTestingHomePage.allCard.size(); i++) {
            Assert.assertTrue(techGlobalFrontendTestingHomePage.allCard.get(i).isDisplayed());
            Assert.assertEquals(techGlobalFrontendTestingHomePage.allCard.get(i).getText(), list[i]);
        }
    }
    @Test(priority = 2,description = "Validate URL")
    public void validateFrontendTestingURL(){
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        Assert.assertTrue(driver.getCurrentUrl().contains("frontend"));
        }
}
