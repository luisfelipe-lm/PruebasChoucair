Feature: buscar posiciones disponibles

  Scenario: Aplicacion a Choucair
    Given que quiero aplicar a Choucair
    When completo el formulario de aplicacion como "analista de pruebas"
    Then el sistema muestra un mensaje de confirmacion

