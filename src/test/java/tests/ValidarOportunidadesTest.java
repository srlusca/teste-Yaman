package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.InitPage;
import pages.LoginPage;
import pages.OportunidadeClickPage;
import pages.OportunidadesPage;
import support.Web;

import java.io.IOException;

public class ValidarOportunidadesTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.pageChrome();
    }

    @Test
    public void testValidarOportunidades() throws InterruptedException, IOException {
        new LoginPage(navegador)
                .username()
                .password()
                .clickSignin();
        new InitPage(navegador)
                .navigator()
                .myMouse()
                .oportunidades();
        new OportunidadesPage(navegador)
                .clickPage();
        new OportunidadeClickPage(navegador)
                .validarTitulo()
                .backHome();
        new InitPage(navegador)
                .navigator()
                .myMouse()
                .oportunidades();
        new OportunidadesPage(navegador)
                .clickPageDois();
        new OportunidadeClickPage(navegador)
                .validarTituloDois()
                .backHome();
        new InitPage(navegador)
                .navigator()
                .myMouse()
                .oportunidades();
        new OportunidadesPage(navegador)
                .clickPageTres();
        new OportunidadeClickPage(navegador)
                .validarTituloTres();
    }

    @After
    public void finalTest() {
        navegador.quit();
    }
}
