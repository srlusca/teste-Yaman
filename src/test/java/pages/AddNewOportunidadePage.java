package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.ReadExcel;
import java.io.IOException;

public class AddNewOportunidadePage {

    private WebDriver navegador;

    public AddNewOportunidadePage(WebDriver navegador) throws IOException {
        this.navegador = navegador;
    }

    public AddNewOportunidadePage nomeOportunidade() throws IOException {
        ReadExcel excel = new ReadExcel();
        String nomeOportunidade = excel.getData().get(5).toString();
        navegador.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys(nomeOportunidade);
        return this;
    }

    public AddNewOportunidadePage nomeOportunidadeDois() throws IOException {
        ReadExcel excel = new ReadExcel();
        String nomeOportunidade = excel.getData().get(10).toString();
        navegador.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys(nomeOportunidade);
        return this;
    }

    public AddNewOportunidadePage nomeOportunidadeTres() throws IOException {
        ReadExcel excel = new ReadExcel();
        String nomeOportunidade = excel.getData().get(15).toString();
        navegador.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys(nomeOportunidade);
        return this;
    }

    public AddNewOportunidadePage responsavel() {
        navegador.findElement(By.id("select2-chosen-6")).click();
        return this;
    }

    public AddNewOportunidadePage selectResponsavel() throws IOException {
        ReadExcel excel = new ReadExcel();
        String selectResponsavel = excel.getData().get(6).toString();
        navegador.findElement(By.xpath("//*[@id=\"select2-results-6\"]/*/*/*/div[text()='"+ selectResponsavel +"']")).click();
        return this;
    }

    public AddNewOportunidadePage selectResponsavelDois() throws IOException {
        ReadExcel excel = new ReadExcel();
        String selectResponsavel = excel.getData().get(11).toString();
        navegador.findElement(By.xpath("//*[@id=\"select2-results-6\"]/*/*/*/div[text()='"+ selectResponsavel +"']")).click();
        return this;
    }

    public AddNewOportunidadePage selectResponsavelTres() throws IOException {
        ReadExcel excel = new ReadExcel();
        String selectResponsavel = excel.getData().get(16).toString();
        navegador.findElement(By.xpath("//*[@id=\"select2-results-6\"]/*/*/*/div[text()='"+ selectResponsavel +"']")).click();
        return this;
    }

    public AddNewOportunidadePage estagioVendas() {
        navegador.findElement(By.id("s2id_autogen7")).click();
        return this;
    }

    public AddNewOportunidadePage selectEstagioVendas() throws IOException {
        ReadExcel excel = new ReadExcel();
        String selectEstagioVendas = excel.getData().get(7).toString();
        navegador.findElement(By.xpath("//*[@id=\"EditView\"]/div[2]/div/div/div[1]/table/tbody/tr[5]/td[4]/*[2]/*[text()='"+ selectEstagioVendas +"']")).click();
        return this;
    }

    public AddNewOportunidadePage selectEstagioVendasDois() throws IOException {
        ReadExcel excel = new ReadExcel();
        String selectEstagioVendas = excel.getData().get(12).toString();
        navegador.findElement(By.xpath("//*[@id=\"EditView\"]/div[2]/div/div/div[1]/table/tbody/tr[5]/td[4]/*[2]/*[text()='"+ selectEstagioVendas +"']")).click();
        return this;
    }

    public AddNewOportunidadePage selectEstagioVendasTres() throws IOException {
        ReadExcel excel = new ReadExcel();
        String selectEstagioVendas = excel.getData().get(17).toString();
        navegador.findElement(By.xpath("//*[@id=\"EditView\"]/div[2]/div/div/div[1]/table/tbody/tr[5]/td[4]/*[2]/*[text()='"+ selectEstagioVendas +"']")).click();
        return this;
    }

    public AddNewOportunidadePage previsaoFechamento() throws IOException {
        ReadExcel excel = new ReadExcel();
        String previsaoFechamento = excel.getData().get(8).toString();
        navegador.findElement(By.id("Potentials_editView_fieldName_closingdate")).sendKeys(previsaoFechamento);
        return this;
    }

    public AddNewOportunidadePage previsaoFechamentoDois() throws IOException {
        ReadExcel excel = new ReadExcel();
        String previsaoFechamento = excel.getData().get(13).toString();
        navegador.findElement(By.id("Potentials_editView_fieldName_closingdate")).sendKeys(previsaoFechamento);
        return this;
    }

    public AddNewOportunidadePage previsaoFechamentoTres() throws IOException {
        ReadExcel excel = new ReadExcel();
        String previsaoFechamento = excel.getData().get(18).toString();
        navegador.findElement(By.id("Potentials_editView_fieldName_closingdate")).sendKeys(previsaoFechamento);
        return this;
    }

    public AddNewOportunidadePage descricao() throws IOException {
        ReadExcel excel = new ReadExcel();
        String descricao = excel.getData().get(9).toString();
        navegador.findElement(By.id("Potentials_editView_fieldName_description")).sendKeys(descricao);
        return this;
    }

    public AddNewOportunidadePage descricaoDois() throws IOException {
        ReadExcel excel = new ReadExcel();
        String descricao = excel.getData().get(14).toString();
        navegador.findElement(By.id("Potentials_editView_fieldName_description")).sendKeys(descricao);
        return this;
    }

    public AddNewOportunidadePage descricaoTres() throws IOException {
        ReadExcel excel = new ReadExcel();
        String descricao = excel.getData().get(19).toString();
        navegador.findElement(By.id("Potentials_editView_fieldName_description")).sendKeys(descricao);
        return this;
    }

    public OportunidadesPage salvarOportunidade() {
        navegador.findElement(By.xpath("//*[@id=\"EditView\"]/div[3]/div/div/button")).click();
        return new OportunidadesPage(navegador);
    }
}
