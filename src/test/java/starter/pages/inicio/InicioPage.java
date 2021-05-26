package starter.pages.inicio;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;

@DefaultUrl("https://www.choucairtesting.com/")
public class InicioPage extends PageObject {

    @Steps private BarraPage barraPage;


    public void abrirPagina(){
        getDriver().get(InicioPage.class.getAnnotation(DefaultUrl.class).value());
    }

    public void irAEmpleos(){
        barraPage.clickEnEmpleos();
    }
}
