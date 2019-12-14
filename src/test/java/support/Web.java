package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver pageChrome () {
        System.setProperty("webdriver.chrome.driver", "/home/lucasmoreira/Documentos/chromedriver");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("https://startupflex.com.br/crm/");
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return navegador;
    }
}
