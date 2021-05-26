package starter.pages.empleo;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebElement;
import starter.interacciones.AccionesDeUsuario;

import java.nio.file.Paths;

public class FormularioEmpleoPage extends PageObject {

    @FindBy(id = "nombre-completo")
    private WebElement nombreCompletoCampo;

    @FindBy(id = "correo-electronico")
    private WebElement correoElectronicoCampo;

    @FindBy(id = "celular-o-telefono-de-contacto")
    private WebElement celularCampo;

    @FindBy(id = "que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente")
    private WebElement estudiosFormalesCampo;

    @FindBy(id = "que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica")
    private WebElement tiempoExperienciaCampo;

    @FindBy(id = "conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica")
    private WebElement cononcesDeAutomatizacionCampo;

    @FindBy(id = "cual-es-tu-aspiracion-salarial")
    private WebElement aspiracionSalarialCampo;


    @FindBy(id = "si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias")
    private WebElement seleccionadoCampo;

    @FindBy(id = "cv")
    private WebElement cvBtn;

    @FindBy(css = "[value='Send application']")
    private WebElement enviarSolicitudBtn;

    @FindBy(id = "mensaje-adicional")
    private WebElement mensajeAdicionalCampo;


    @Steps
    AccionesDeUsuario accionesDeUsuario;


    public void completarFormulari(String nombre,String correo,String celular,String estudios,String experiencia,String cononcesDeAutomatizacion,String aspiracion, String seleccionado,String mensajeAdicional){
        nombreCompletoCampo.sendKeys(nombre);
        correoElectronicoCampo.sendKeys(correo);
        celularCampo.sendKeys(celular);
        estudiosFormalesCampo.sendKeys(estudios);
        tiempoExperienciaCampo.sendKeys(experiencia);
        cononcesDeAutomatizacionCampo.sendKeys(cononcesDeAutomatizacion);
        seleccionadoCampo.sendKeys(seleccionado);
        mensajeAdicionalCampo.sendKeys(mensajeAdicional);
        aspiracionSalarialCampo.sendKeys(aspiracion);
        cvBtn.sendKeys(Paths.get("hv.docx").toAbsolutePath().toString());
        accionesDeUsuario.scrollHaciaElElement(enviarSolicitudBtn);
        accionesDeUsuario.clickForzado(enviarSolicitudBtn);

    }




}
