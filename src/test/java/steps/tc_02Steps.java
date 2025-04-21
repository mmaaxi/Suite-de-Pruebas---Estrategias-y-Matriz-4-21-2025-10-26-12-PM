package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_02Page;

public class tc_02Steps {
    private WebDriver driver;
    private tc_02Page matrixPage;

    @Given("El usuario está en la página de prueba de matriz")
    public void el_usuario_esta_en_la_pagina_de_prueba_de_matriz() {
        // Setup del WebDriver
        driver = new ChromeDriver();
        driver.get("https://www.example.com/matrix-test");
        matrixPage = new tc_02Page(driver);
    }

    @When("El usuario ejecuta el test de la matriz de datos")
    public void el_usuario_ejecuta_el_test_de_la_matriz_de_datos() {
        // Lógica para ejecutar el test de la matriz
        matrixPage.runMatrixTest();
    }

    @Then("La matriz se analiza correctamente y se muestran los resultados esperados")
    public void la_matriz_se_analiza_correctamente_y_se_muestran_los_resultados_esperados() {
        // Verificar los resultados esperados
        assertTrue(matrixPage.isAnalysisSuccessful());
        driver.quit();
    }
}