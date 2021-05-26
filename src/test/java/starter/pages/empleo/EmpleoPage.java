package starter.pages.empleo;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;


public class EmpleoPage extends PageObject {

    @FindBy(css = ".position")
    protected List<WebElement> listaDeEmpleos;

    @Steps CampoBusquedaEmpleoPage campoBusquedaEmpleoPage;

    public List<WebElement> getListaDeEmpleos() {
        return listaDeEmpleos;
    }
}
