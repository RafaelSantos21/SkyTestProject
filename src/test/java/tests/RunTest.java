package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import web.BaseTest.BaseTest;
import web.funcionalidade.SelectCurrentProgramFuncionalidade;
import org.junit.*;
import org.junit.rules.TestName;
import web.reports.ScreenShot;
import web.reports.Generator;

import java.util.concurrent.TimeUnit;

public class RunTest extends BaseTest {

private static SelectCurrentProgramFuncionalidade programmingFuncionalidade;
private static String url ="http://sky.com.br/";

public RunTest(){
    this.programmingFuncionalidade = new SelectCurrentProgramFuncionalidade();
}

@Rule
public TestName test = new TestName();

@Before
public void setUp(){
    //Abrir o Navegador
    driver.get(url);
}

@Test
public void selectCurrentProgramTest(){
    programmingFuncionalidade.selectCurrentProgram();
    String screenshotArquivo = "C:\\Users\\Rafah\\Desktop\\tests-report\\" + Generator.dateTimeForFile() + "programaEscolhido.png";
    ScreenShot.takePrintScreen(driver, screenshotArquivo);
    }

    @After
    //Metodo para Fechar o Navegador
    public void tearDown(){
    driver.quit();
    }
}


