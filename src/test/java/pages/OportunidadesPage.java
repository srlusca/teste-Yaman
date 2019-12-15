package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;


public class OportunidadesPage {
    private WebDriver navegador;

    public OportunidadesPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public AddNewOportunidadePage addOportunidades() throws IOException {
        navegador.findElement(By.id("Potentials_listView_basicAction_LBL_ADD_RECORD")).click();
        return new AddNewOportunidadePage(navegador);
    }

    public InitPage backHome() throws InterruptedException {
        Thread.sleep(3000);
        navegador.findElement(By.xpath("//*[@id=\"page\"]/nav/div[1]/div/div[1]/div/div[2]")).click();
        return new InitPage(navegador);
    }
}
