package starter.interacciones;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.pages.empleo.EmpleoPage;
import starter.pages.empleo.FormularioEmpleoPage;
import starter.pages.empleo.PosicionOfertadaPage;

public class CompletarFormularioInteraccion extends FormularioEmpleoPage {

    @Steps
    private PosicionOfertadaPage posicionOfertadaPage;


    @Step
    public void completarFormularioMisDatos(){
        completarFormulari("Luis Lopez","luis@lopez.com","3124578989",
                "Estudios especializados en analitica","En el sector bancario",
                "Sí, he trabajado con varias herramientas","3000.000","En una semana", "Hola, tengo ganas de aprender");
    }


    @Step
    public void checkEnvioExito(){
        Assert.assertTrue(posicionOfertadaPage
                .obtenerMensajeConfirmacion()
                .getText()
                .equalsIgnoreCase("Your job application has been submitted successfully"));
    }
}
