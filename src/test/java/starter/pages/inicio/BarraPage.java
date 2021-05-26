package starter.pages.inicio;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class BarraPage extends PageObject {

    @FindBy(linkText = "Empleos")
    private WebElement empleosBtn;

    public WebElement clickEnEmpleos(){
        empleosBtn.click();
        return empleosBtn;
    }
}
