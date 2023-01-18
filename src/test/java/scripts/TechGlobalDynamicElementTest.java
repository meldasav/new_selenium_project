package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalDynamicElementsPage;
import pages.TechGlobalFrontendTestingHomePage;

public class TechGlobalDynamicElementTest extends Base{

  @BeforeMethod
    public void setPage(){
      techGlobalDynamicElementsPage = new TechGlobalDynamicElementsPage();
      techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
  }

  @Test(priority = 1,description = "testing dynamic webElements")
    public void dynamicElementsTest(){
      techGlobalFrontendTestingHomePage.getFrontendTestingPage();
      techGlobalFrontendTestingHomePage.clickOnCard(2);
      Assert.assertTrue(techGlobalDynamicElementsPage.box1.isDisplayed());
      Assert.assertEquals(techGlobalDynamicElementsPage.box1.getText(),"Box 1");
      Assert.assertTrue(techGlobalDynamicElementsPage.box2.isDisplayed());
      Assert.assertEquals(techGlobalDynamicElementsPage.box2.getText(),"Box 2");
  }
}
