package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.interacciones.BusquedaEmpleoInteraccion;
import starter.interacciones.CompletarFormularioInteraccion;
import starter.pages.empleo.EmpleoPage;
import starter.pages.empleo.PosicionOfertadaPage;
import starter.pages.inicio.InicioPage;

public class EmpleabilidadStepDefinitions {

    @Steps
    InicioPage inicioPage;

    @Steps
    BusquedaEmpleoInteraccion busquedaEmpleoInteraccion;

    @Steps
    PosicionOfertadaPage posicionOfertadaPage;


    @Steps
    CompletarFormularioInteraccion completarFormularioInteraccion;

    @Before
    public void abrirNavegador() {
        inicioPage.abrirPagina();
    }

    @Given("que quiero aplicar a Choucair")
    public void quieroAplicarAChoucair() {
        inicioPage.irAEmpleos();

    }

    @When("completo el formulario de aplicacion como {string}")
    public void searchesFor(String posicion) {
        busquedaEmpleoInteraccion.buscarOferta(posicion);
        busquedaEmpleoInteraccion.selecionarUnPosicion();
        posicionOfertadaPage.clickEnAplicar();
        completarFormularioInteraccion.completarFormularioMisDatos();

    }

    @Then("el sistema muestra un mensaje de confirmacion")
    public void should_see_information_about() {
            completarFormularioInteraccion.checkEnvioExito();
    }
}
