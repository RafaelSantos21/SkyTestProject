package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//div[@class='modal fade modal-pre-page in']/descendant-or-self::span[@class='sky_icon sky_icon-close icon_xs']")
    private WebElement btnFecharModalPreHomePage;

    @FindBy(xpath = "//a[@class='btn linkMedium secondaryWeb']/child::strong[contains(text(), 'Programação')]")
    private WebElement linkProgramacao;

    public HomePage(WebDriver driver){ PageFactory.initElements(driver, this); }

    public WebElement getBtnFecharModalPreHomePage() { return btnFecharModalPreHomePage; }
    public WebElement getLinkProgramacao(){ return linkProgramacao;}

}
