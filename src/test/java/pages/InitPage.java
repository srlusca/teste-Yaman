package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InitPage {
    private WebDriver navegador;

    public InitPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public InitPage navigator() {
        navegador.findElement(By.id("appnavigator")).click();
        return this;
    }

    public InitPage myMouse() throws InterruptedException {
        Thread.sleep(1000);
        WebElement vendas = navegador.findElement(By.id("SALES_modules_dropdownMenu"));
        Actions myMouse = new Actions(navegador);
        myMouse.moveToElement(vendas).build().perform();
        return this;
    }
    public OportunidadesPage oportunidades() {
//        navegador.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/li[1]/a/span[2]")).click();
        navegador.findElement(By.xpath("//*[@id=\"app-menu\"]//*//*[2]/*[3]/*[2]//*//*//*//*//*[2][text()=\" Oportunidades\"]")).click();
        return new OportunidadesPage(navegador);
    }

}
