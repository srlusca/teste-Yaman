package pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AddNewOportunidadePage {

    private WebDriver navegador;
    private ReadExcel excel = new ReadExcel();

    public AddNewOportunidadePage(WebDriver navegador) throws IOException {
        this.navegador = navegador;
    }

    public AddNewOportunidadePage nomeOportunidade() {
        //ReadExcel excelFile = new ReadExcel();
        //String nomeOportunidade = excelFile
        navegador.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys("VARIAVEL NOME OPORTUNIDADE");
        return this;
    }

    public AddNewOportunidadePage responsavel() {
        navegador.findElement(By.id("select2-chosen-6")).click();
        return this;
    }

    public AddNewOportunidadePage selectResponsavel() throws IOException {
        navegador.findElement(By.xpath("//*[@id=\"select2-results-6\"]/*/*/*/div[text()='"+ excel.getData().get(5) +"']")).click();
        return this;
    }

    public AddNewOportunidadePage estagioVendas() {
        navegador.findElement(By.id("s2id_autogen7")).click();
        return this;
    }

    public AddNewOportunidadePage selectEstagioVendas() {
        navegador.findElement(By.xpath("//*[@id=\"EditView\"]/div[2]/div/div/div[1]/table/tbody/tr[5]/td[4]/*[2]/*[text()='"+ "VARIAVEL ESTAGIO VENDAS" +"']")).click();
        return this;
    }

    public AddNewOportunidadePage previsaoFechamento() {
        navegador.findElement(By.id("Potentials_editView_fieldName_closingdate")).sendKeys("VARIAVEL PREVISAO FECHAMENTO");
        return this;
    }

    public AddNewOportunidadePage descricao(String descricao) {
        navegador.findElement(By.id("Potentials_editView_fieldName_description")).sendKeys(descricao);
        return this;
    }

    public OportunidadesPage salvarOportunidade() {
        navegador.findElement(By.xpath("//*[@id=\"EditView\"]/div[3]/div/div/button")).click();
        return new OportunidadesPage(navegador);
    }
}
