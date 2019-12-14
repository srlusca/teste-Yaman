package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver navegador;

    public LoginPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public LoginPage username(String username) {
        navegador.findElement(By.id("username")).sendKeys(username);
        return this;
    }

    public LoginPage password(String password) {
        navegador.findElement(By.id("password")).sendKeys(password);
        return this;
    }

    public InitPage clickSignin() {
        navegador.findElement(By.xpath("//*[@id=\"loginFormDiv\"]/form/div[3]/button")).click();
        return new InitPage(navegador);
    }
}
