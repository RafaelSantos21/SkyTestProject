package web.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public BaseTest(){
        startDriver(true);
    }

    protected static void startDriver(boolean maximizar) {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rafah\\Downloads\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, 15);

            if (maximizar == true){
                    driver.manage().window().maximize();
            }
        }
    }
}


