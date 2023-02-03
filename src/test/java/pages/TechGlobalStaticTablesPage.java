package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class TechGlobalStaticTablesPage extends TechGlobalBasePage{
    public TechGlobalStaticTablesPage(){
        super();
    }

    @FindBy(css = "#company_table tr>th")
    public List<WebElement> table_headers;

    @FindBy(xpath = "//tbody/tr/td[1]")
    public List<WebElement> table_columns;



    public List<List<WebElement>> getTableData(){
        List<List<WebElement>> tableData = new ArrayList<>();

        // We are iterating from 1 to our row size.
        for (int i = 1; i <= table_columns.size(); i++) {
            tableData.add(Driver.getDriver().findElements(By.cssSelector("tbody>tr:nth-child(" + i + ") td")));
        }
        return tableData;
    }
}
