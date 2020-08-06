package web.reports;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;

public class ScreenShot {
    // Método para gerar Evidência via PrintScreen
    public static void takePrintScreen(WebDriver driver, String file){
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(file));
        } catch (Exception r){
            System.out.println("Erro ao copiar o arquivo para a pasta: " + r.getMessage());
        }
    }
}
