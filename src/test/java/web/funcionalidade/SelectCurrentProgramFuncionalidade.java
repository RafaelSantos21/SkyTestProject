package web.funcionalidade;

import org.openqa.selenium.By;
import web.BaseTest.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import web.pages.HomePage;
import web.pages.ProgrammingPage;

import java.util.concurrent.TimeUnit;

public class SelectCurrentProgramFuncionalidade extends BaseTest {

    private ProgrammingPage programmingPage;
    private HomePage homePage;

    public SelectCurrentProgramFuncionalidade(){
        this.programmingPage =  new ProgrammingPage(driver);
        this.homePage = new HomePage(driver);
    }

    //Metodo para Selecionar um Programa que esteja passando Agora. Neste caso mostrar os programas do Canal 53(DisneyXD)
    public void selectCurrentProgram(){

        //Aguardar que o elemento se torne visivel para então clica-lo
        wait.until(ExpectedConditions.visibilityOf(this.homePage.getBtnFecharModalPreHomePage())).click();
        //Clicar no link Programação
        this.homePage.getLinkProgramacao().click();
        //Aguardar que o elemento seja visivel para então clica-lo
        wait.until(ExpectedConditions.visibilityOf(this.programmingPage.getSelectProgram())).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

    }

    public String retornNameProgramSelected(){ return this.programmingPage.getNameProgramSelected().getText(); }
    public String retornTimeProgramSelected(){ return this.programmingPage.getTimeProgramSelected().getText(); }
}
