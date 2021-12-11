/**
 * In this class contains webBrowser related methods in framework level
 *  1)Driver()---Intiate chromedriver or Firefoxdriver
 *  * Author:Basheer Ahamed
 *  Date:12/08/2021
 */

package framework;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.util.concurrent.TimeUnit;


public class webBrowser {


    public static WebDriver driver=null ;

    public static WebDriver createWebDriver(String webdriver) {

        switch(webdriver) {
            case "firefox":
                File driverPath = new File("./Drivers/geckodriver.exe");
                System.setProperty("webdriver.gecko.driver", driverPath.getAbsolutePath());
                driver= new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                driver.get("https://etherscan.io/register");
                return driver;

            default:
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");
                options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                driver.get("https://etherscan.io/register");
                return driver;
        }
    }




}



