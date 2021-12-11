/**
 * In this class contains utility methods in framework level
 *  1)CaptureScreenshot(String Filename)
 * Author:Basheer Ahamed
 *  Date:12/08/2021*/

package framework;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.apache.commons.io.FileUtils.copyFile;



public class utility extends webBrowser {
    //Capture Screenshot and store in the folder
    public static void CaptureScreenshot(String Filename) throws IOException {
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyHHmmss");
        Date date = new Date();
        String d= formatter.format(date);
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        copyFile(file,new File("src/test/Screenshots/"+Filename+d+".png"));

    }


    public static void waitForElement(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }




}
