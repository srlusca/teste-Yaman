package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.ReadExcel;

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

    public OportunidadeClickPage clickPage() throws IOException {
        ReadExcel excel = new ReadExcel();
        String titulo = excel.getData().get(5).toString();
        navegador.findElement(By.xpath("//*[@id=\"listview-table\"]/*[3]/*/*[@title='"+ titulo +"']")).click();

        return new OportunidadeClickPage(navegador);
    }

    public OportunidadeClickPage clickPageDois() throws IOException {
        ReadExcel excel = new ReadExcel();
        String titulo = excel.getData().get(10).toString();
        navegador.findElement(By.xpath("//*[@id=\"listview-table\"]/*[3]/*/*[@title='"+ titulo +"']")).click();

        return new OportunidadeClickPage(navegador);
    }

    public OportunidadeClickPage clickPageTres() throws IOException {
        ReadExcel excel = new ReadExcel();
        String titulo = excel.getData().get(15).toString();
        navegador.findElement(By.xpath("//*[@id=\"listview-table\"]/*[3]/*/*[@title='"+ titulo +"']")).click();

        return new OportunidadeClickPage(navegador);
    }
}
