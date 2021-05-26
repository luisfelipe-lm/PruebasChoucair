package starter.interacciones;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.support.ui.ExpectedConditions;
import starter.pages.empleo.CampoBusquedaEmpleoPage;
import starter.pages.empleo.EmpleoPage;

import java.time.Duration;

public class BusquedaEmpleoInteraccion extends CampoBusquedaEmpleoPage {

    private String palabraClave;
    @Steps
    EmpleoPage empleoPage;

    @Step
    public void buscarOferta(String palabraClave,String lugar){
        this.palabraClave = palabraClave;
        palabraClaveCampo.sendKeys(palabraClave);
        lugarCampo.sendKeys(lugar);
        buscarEmpleoBtn.click();
    }

    @Step
    public void buscarOferta(String palabraClave){
        palabraClaveCampo.sendKeys(palabraClave);
        buscarEmpleoBtn.click();
    }

    @Step
    public void selecionarUnPosicion(){
        withTimeoutOf(Duration.ofSeconds(20)).waitFor(ExpectedConditions.visibilityOfAllElements(empleoPage.getListaDeEmpleos()));
        if (empleoPage.getListaDeEmpleos().size() > 0) {
            empleoPage.getListaDeEmpleos().get(0).click();
        } else {
            throw new RuntimeException("No existen empleos para la palabra clave utilizada : "+ palabraClave);
        }
    }
}
