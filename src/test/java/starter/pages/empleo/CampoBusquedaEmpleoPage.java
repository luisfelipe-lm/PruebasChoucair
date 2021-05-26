package starter.pages.empleo;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class CampoBusquedaEmpleoPage extends PageObject {

    @FindBy(id = "search_keywords")
    protected WebElement palabraClaveCampo;

    @FindBy(id = "search_location")
    protected WebElement lugarCampo;

    @FindBy(xpath = "//input[@value='Search Jobs']")
    protected WebElement buscarEmpleoBtn;



}
