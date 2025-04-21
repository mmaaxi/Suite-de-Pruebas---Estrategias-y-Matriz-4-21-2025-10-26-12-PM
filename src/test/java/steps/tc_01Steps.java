package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_01Page;
import static org.junit.Assert.assertTrue;

public class tc_01Steps {
    WebDriver driver;
    tc_01Page strategyPage;

    @Given("^I open the strategy validation page$")
    public void openStrategyValidationPage() {
        driver = new ChromeDriver();
        strategyPage = new tc_01Page(driver);
        strategyPage.openPage();
    }

    @When("^I execute strategy validation from Google Sheets$")
    public void executeStrategyValidation() {
        strategyPage.validateStrategyFromGoogleSheets();
    }

    @Then("^I should see the expected information displayed correctly$")
    public void validateExpectedInformation() {
        assertTrue(strategyPage.isExpectedInformationDisplayed());
        driver.quit();
    }
}