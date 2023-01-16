package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TechGlobalHeaderTest extends Base {

    @Test(priority = 1)
    public void validateTechGlobalLogo() {

        Assert.assertTrue(techGlobalBasePage.headerDropdown.isDisplayed());
        Assert.assertEquals(techGlobalBasePage.headerDropdown.getText(), "Practices");
    }
    @Test(priority = 2)
    public void validateTechGlobalHeaderDropdown() throws InterruptedException {
        techGlobalBasePage.headerDropdown.click();
        Thread.sleep(3000);
        String[] dropdownItemsTexts = {"Frontend Testing", "Backend Testing", "Java Exercises"};

        for (int i = 0; i < techGlobalBasePage.headerDropdownOptions.size(); i++) {
            Assert.assertTrue(techGlobalBasePage.headerDropdownOptions.get(i).isDisplayed());
            Assert.assertTrue(techGlobalBasePage.headerDropdownOptions.get(i).isEnabled());
            Assert.assertEquals(techGlobalBasePage.headerDropdownOptions.get(i).getText(), dropdownItemsTexts[i]);
        }

    }
}





