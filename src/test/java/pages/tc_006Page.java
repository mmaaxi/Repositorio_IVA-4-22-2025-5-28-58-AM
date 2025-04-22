package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_006Page {
    WebDriver driver;
    WebDriverWait wait;

    By exportButton = By.id("exportButtonId");
    By excelFile = By.xpath("//path/to/exported/excel/file");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void clickExportButton() {
        wait.until(ExpectedConditions.elementToBeClickable(exportButton)).click();
    }

    public void openExportedExcel() {
        // Logic to open the Excel file
    }

    public boolean isColumnPresent(String columnName) {
        // Logic to verify if the specific column with 'columnName' is present in the Excel file
        return true; // Replace with actual implementation
    }
}