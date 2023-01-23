package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalRadioButtonsPage;

public class TechGlobalRadioButtonTest extends Base{

    @BeforeMethod
    public void setUp(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalRadioButtonsPage = new TechGlobalRadioButtonsPage();
    }

    @Test(priority = 1,description = "Validate checkboxes")
    public void checkBoxesTest(){
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(5);

        for (int i = 0; i < techGlobalRadioButtonsPage.checkboxes.size(); i++) {
            Assert.assertTrue(techGlobalRadioButtonsPage.checkboxes.get(i).isEnabled());
            Assert.assertTrue(techGlobalRadioButtonsPage.checkboxes.get(i).isDisplayed());
            Assert.assertFalse(techGlobalRadioButtonsPage.checkboxes.get(i).isSelected());

        }
             techGlobalRadioButtonsPage.checkboxes.get(0).click();
             Assert.assertTrue(techGlobalRadioButtonsPage.checkboxes.get(0).isSelected());
             Assert.assertFalse(techGlobalRadioButtonsPage.checkboxes.get(1).isSelected());
             Assert.assertFalse(techGlobalRadioButtonsPage.checkboxes.get(2).isSelected());

        for (int i = 0; i < techGlobalRadioButtonsPage.checkBoxes2.size(); i++) {
            Assert.assertTrue(techGlobalRadioButtonsPage.checkBoxes2.get(i).isDisplayed());
            Assert.assertTrue(techGlobalRadioButtonsPage.checkBoxes2.get(i).isEnabled());
            Assert.assertFalse(techGlobalRadioButtonsPage.checkBoxes2.get(i).isSelected());
        }
        techGlobalRadioButtonsPage.checkBoxes2.get(1).click();
        Assert.assertTrue(techGlobalRadioButtonsPage.checkBoxes2.get(1).isSelected());

        }
    }

