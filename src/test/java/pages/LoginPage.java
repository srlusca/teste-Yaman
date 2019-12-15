package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.ReadExcel;

import java.io.IOException;

public class LoginPage {
    private WebDriver navegador;

    public LoginPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public LoginPage username() throws IOException {
        ReadExcel excel = new ReadExcel();
        String username = excel.getData().get(22).toString();
        navegador.findElement(By.id("username")).sendKeys(username);
        return this;
    }

    public LoginPage password() throws IOException {
        ReadExcel excel = new ReadExcel();
        String password = excel.getData().get(23).toString().replace(".0", "");
        navegador.findElement(By.id("password")).sendKeys(password);
        return this;
    }

    public InitPage clickSignin() {
        navegador.findElement(By.xpath("//*[@id=\"loginFormDiv\"]/form/div[3]/button")).click();
        return new InitPage(navegador);
    }
}
