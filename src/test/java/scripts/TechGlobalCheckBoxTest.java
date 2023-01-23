package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalCheckboxPage;
import pages.TechGlobalFrontendTestingHomePage;

public class TechGlobalCheckBoxTest extends Base{

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalCheckboxPage = new TechGlobalCheckboxPage();
    }
    @Test(priority = 1, description = "checkbox validation")
    public void checkboxTest(){
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(6);
        for (int i = 0; i < techGlobalCheckboxPage.checkBoxesPart1.size(); i++) {
            Assert.assertFalse(techGlobalCheckboxPage.checkBoxesPart1.get(i).isSelected());
        }
        techGlobalCheckboxPage.checkBoxesPart1.get(0).click();
        Assert.assertTrue(techGlobalCheckboxPage.checkBoxesPart1.get(0).isSelected());
    }
}
