package pages;

import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.ReadExcel;

import java.io.IOException;

public class OportunidadeClickPage {
    private WebDriver navegador;

    public OportunidadeClickPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public OportunidadeClickPage validarTitulo() throws IOException {
        ReadExcel excel = new ReadExcel();
        String titulo = excel.getData().get(5).toString();
        WebElement potentialname = navegador.findElement(By.className("potentialname"));
        String tituloWeb = potentialname.getText();

        assertEquals(titulo, tituloWeb);
        return this;
    }

    public OportunidadeClickPage validarTituloDois() throws IOException {
        ReadExcel excel = new ReadExcel();
        String titulo = excel.getData().get(10).toString();
        WebElement potentialname = navegador.findElement(By.className("potentialname"));
        String tituloWeb = potentialname.getText();

        assertEquals(titulo, tituloWeb);
        return this;
    }

    public OportunidadeClickPage validarTituloTres() throws IOException {
        ReadExcel excel = new ReadExcel();
        String titulo = excel.getData().get(15).toString();
        WebElement potentialname = navegador.findElement(By.className("potentialname"));
        String tituloWeb = potentialname.getText();

        assertEquals(titulo, tituloWeb);
        return this;
    }

    public InitPage backHome() throws InterruptedException {
        Thread.sleep(3000);
        navegador.findElement(By.xpath("//*[@id=\"page\"]/nav/div[1]/div/div[1]/div/div[2]")).click();
        return new InitPage(navegador);
    }

}
