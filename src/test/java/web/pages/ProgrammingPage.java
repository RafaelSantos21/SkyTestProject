package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgrammingPage {

    @FindBy(xpath = "//div[@class='channel-schedule-container']/descendant::div[contains(text(), '53')]/ancestor::div[@class='channel-list-item']/following::div[@class='channel-program-list']/child::div/child::div/child::div/child::div[@class='program-schedule-item']/child::div[@class='schedule-inner schedule-live']")
    private WebElement selectProgram;

    @FindBy(xpath = "//div[@class='sky-modal-program-title']/child::h2[contains(text(), \" \")]")
    private WebElement nameProgramSelected;

    @FindBy(xpath = "//div[@class='sky-modal-program-date-time']/child::span[contains(text(), \" \")]")
    private WebElement timeProgramSelected;

    public ProgrammingPage (WebDriver driver){ PageFactory.initElements(driver, this); }

    public WebElement getSelectProgram(){return selectProgram;}
    public WebElement getNameProgramSelected() { return nameProgramSelected; }
    public WebElement getTimeProgramSelected() { return timeProgramSelected; }
}
