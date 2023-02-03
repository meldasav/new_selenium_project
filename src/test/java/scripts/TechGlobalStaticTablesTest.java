package scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalStaticTablesPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TechGlobalStaticTablesTest extends Base {

    @BeforeMethod
    public void setPage() {
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalStaticTablesPage = new TechGlobalStaticTablesPage();
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard("Static Tables");
    }

    @Test(description = "Validate all cells")
    public void testCells() {
        List<List<WebElement>> tableData = techGlobalStaticTablesPage.getTableData();
        List<List<String>> table = new ArrayList<>();
        table.add(Arrays.asList("1", "Amazon", "1,523,000", "USA"));
        table.add(Arrays.asList("2", "Alibaba", "245,700", "China"));
        table.add(Arrays.asList("3", "Microsoft", "221,000", "USA"));
        table.add(Arrays.asList("4", "Apple", "154,000", "USA"));
        table.add(Arrays.asList("5", "Samsung", "116,915", "S. Korea"));

        for (int i = 0; i < tableData.size(); i++) {
            for (int j = 0; j < tableData.get(i).size(); j++) {
                Assert.assertEquals(tableData.get(i).get(j).getText(), table.get(i).get(j));
            }
        }
    }
}

