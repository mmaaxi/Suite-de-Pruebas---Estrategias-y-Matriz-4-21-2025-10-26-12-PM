package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_01Page {
    WebDriver driver;
    String url = "http://example.com/strategy-validation";

    By googleSheetsStrategyButton = By.id("validateStrategyButton");
    By expectedInformationField = By.id("expectedInformation");

    public tc_01Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(url);
    }

    public void validateStrategyFromGoogleSheets() {
        driver.findElement(googleSheetsStrategyButton).click();
    }

    public boolean isExpectedInformationDisplayed() {
        return driver.findElement(expectedInformationField).isDisplayed();
    }
}