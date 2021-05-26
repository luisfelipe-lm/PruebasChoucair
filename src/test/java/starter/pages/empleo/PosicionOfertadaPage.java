package starter.pages.empleo;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import starter.interacciones.AccionesDeUsuario;

import java.time.Duration;

public class PosicionOfertadaPage extends PageObject {

    @FindBy(xpath = "//input[@value='Apply for job']")
    private WebElement aplicarAlPuestoBtn;

    @FindBy(css = ".job-manager-message")
    private WebElement mensajeConfirmaction;


    @Steps
    AccionesDeUsuario accionesDeUsuario;

    @Step
    public WebElement clickEnAplicar(){
        accionesDeUsuario.scrollHaciaElElement(aplicarAlPuestoBtn);
        accionesDeUsuario.clickForzado(aplicarAlPuestoBtn);
        return aplicarAlPuestoBtn;
    }

    public WebElement obtenerMensajeConfirmacion(){
        withTimeoutOf(Duration.ofSeconds(20)).waitFor(ExpectedConditions.visibilityOf(mensajeConfirmaction));
        return mensajeConfirmaction;
    }
}
