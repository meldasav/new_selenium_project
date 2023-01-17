package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class TechGlobalLogoTest extends Base{

    @Test
    public void validateTechGlobalLogo()  {
        Waiter.pause(3);
        Assert.assertTrue(techGlobalBasePage.logo.isDisplayed());
    }

}
