Feature: Prueba de Estrategia

  Scenario: Validación de estrategia basada en Google Sheets
    Given I open the strategy validation page
    When I execute strategy validation from Google Sheets
    Then I should see the expected information displayed correctly