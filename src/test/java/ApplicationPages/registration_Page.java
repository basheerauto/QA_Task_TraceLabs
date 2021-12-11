/**
 * In this class contains Etherscan website  Page wise business methods
 * Author:Basheer Ahamed
 * Date:12/08/2021
 */


package ApplicationPages;

import framework.utility;
import framework.webBrowser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

import static framework.utility.waitForElement;
import static org.junit.Assert.assertEquals;

public class registration_Page extends webBrowser {


    private static final String txt_Username = "//*[@id='ContentPlaceHolder1_txtUserName']";
    private static final String txt_EmailAddress = "//input[@id='ContentPlaceHolder1_txtEmail']";
    private static final String txt_Password = "//input[@id='ContentPlaceHolder1_txtPassword']";
    private static final String txt_ConfirmPassword = "//input[@id='ContentPlaceHolder1_txtPassword2']";
    private static final String btn_Create_an_Account = "//input[@value='Create an Account']";
    private static final String lbl_Sucessmsg = "//div[contains(text(),'Your account registration has been submitted')]";
    private static final String lbl_error = "//*[@class=\"invalid-feedback\"]";
    private static final String lbl_captchaerror = "//*[@class=\"alert alert-danger\"]";
    private static final String chkbox_terms = "//input[@type='checkbox']";

    //Verify webpage Title
    public void verifyPagetitle(String Title) throws IOException {
        try {
            Thread.sleep(1000);
            String j = driver.getTitle();
            System.out.println("Your page title Is : " + j);
            assertEquals(Title, driver.getTitle());
            acceptCookies();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong verify title");
            utility.CaptureScreenshot("Failed:TitleFailed" + "_");
            driver.quit();
        }
    }

    public void enter_Username(String Username) {
        WebElement element = driver.findElement(By.xpath(txt_Username));
        utility.waitForElement(element);
        element.sendKeys(Username);
    }


    public void enter_EmailAddress(String EmailAddress) {
        WebElement element = driver.findElement(By.xpath(txt_EmailAddress));
        utility.waitForElement(element);
        element.sendKeys(EmailAddress);
    }


    public void enter_Password(String Password) {
        WebElement element = driver.findElement(By.xpath(txt_Password));
        utility.waitForElement(element);
        element.sendKeys(Password);
    }


    public void enter_ConfirmPassword(String ConfirmPassword) {
        WebElement element = driver.findElement(By.xpath(txt_ConfirmPassword));
        utility.waitForElement(element);
        element.sendKeys(ConfirmPassword);
    }


    public void checkbox_terms() {
        WebElement element = driver.findElement(By.xpath(chkbox_terms));
        element.sendKeys(Keys.SPACE);


    }


    public void Click_cretae_Account_btn(String TCDesc) throws IOException, InterruptedException {
        WebElement element = driver.findElement(By.xpath(btn_Create_an_Account));
        waitForElement(element);
        element.click();
        if (TCDesc.equals("TC_01")) {
            try {
                WebElement resultText = driver.findElement(By.xpath(lbl_Sucessmsg));
                String finaltext = resultText.getText();
                Assert.assertTrue(finaltext.contains("Your account registration has been sub"));
                utility.CaptureScreenshot(TCDesc + "_Pass" + "_");
            } catch (Exception e) {
                e.printStackTrace();
                WebElement captcha_error = driver.findElement(By.xpath(lbl_captchaerror));
                String error_captcha = captcha_error.getText();
                System.out.println("Something went wrong while verifying Success registration:-" + error_captcha);
                utility.CaptureScreenshot(TCDesc + "_Fail" + "_");
            }
        }
    }

    public void acceptCookies() throws InterruptedException, IOException {
        try {
            driver.findElement(By.id("btnCookie")).click();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong click cookies button title");
            Thread.sleep(2000);
            utility.CaptureScreenshot("Failed:Cookies button click" + "_");
            driver.quit();
        }
    }

    public void errorverify(String TCDesc) throws InterruptedException, IOException {
        List<WebElement> elements = driver.findElements(By.xpath(lbl_error));
        // System.out.println("Number of elements:" + elements.size());
        for (int i = 0; i < elements.size(); i++) {
            String actualerror = elements.get(i).getText();
            if (actualerror.equals("")) {

            } else
                System.out.println("Field Error validation :-" + actualerror);
        }
        if (elements.size() > 0) {
            Thread.sleep(1000);
            utility.CaptureScreenshot(TCDesc + "_Pass" + "_");
        }
    }
}