package starter.interacciones;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class AccionesDeUsuario extends PageObject {


    public void scrollHaciaElElement(WebElement webElement) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(arguments[1]);", webElement, true);
    }


    public void clickForzado(WebElement webElement) {
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", webElement);

    }
}
