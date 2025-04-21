package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_02Page {
    private WebDriver driver;

    // Selectores de la página
    private By runTestButton = By.id("runTest");
    private By resultMessage = By.id("resultMessage");

    public tc_02Page(WebDriver driver) {
        this.driver = driver;
    }

    public void runMatrixTest() {
        // Acción para ejecutar el test de la matriz
        driver.findElement(runTestButton).click();
    }

    public boolean isAnalysisSuccessful() {
        // Comprobar si el análisis fue exitoso al verificar el mensaje de resultado
        String resultText = driver.findElement(resultMessage).getText();
        return resultText.contains("expected result");
    }
}