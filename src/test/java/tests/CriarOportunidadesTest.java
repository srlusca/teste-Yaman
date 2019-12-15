package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.InitPage;
import pages.LoginPage;
import pages.OportunidadesPage;
import support.Web;

import java.io.IOException;

public class CriarOportunidadesTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.pageChrome();
    }

    @Test
    public void testCriarOportunidades () throws InterruptedException, IOException {
        new LoginPage(navegador)
                .username("Lucas Moreira")
                .password("123456")
                .clickSignin();
        new InitPage(navegador)
                .navigator()
                .myMouse()
                .oportunidades();
        new OportunidadesPage(navegador)
                .addOportunidades()
                .nomeOportunidade()
                .responsavel()
                .selectResponsavel()
                .estagioVendas()
                .selectEstagioVendas()
                .previsaoFechamento()
                .descricao("Teste Yaman")
                .salvarOportunidade()
                .backHome();
        new InitPage(navegador)
                .navigator()
                .myMouse()
                .oportunidades();
    }

//    @After
//    public void finalTest() {
//        navegador.quit();
//    }
}
