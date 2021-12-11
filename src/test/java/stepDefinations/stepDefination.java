/**
 * In this class contains step definitions of the feature file
 * Author:Basheer Ahamed
 *  Date:12/10/2021
 */
package stepDefinations;
import ApplicationPages.registration_Page;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webBrowser;


import java.io.IOException;




public class stepDefination extends webBrowser {

    webBrowser webBrowser = new webBrowser();
    registration_Page registration_Page = new registration_Page();

    @Then("^I validate title and URL$")
    public void i_validate_title_and_URL() throws IOException, InterruptedException {
        registration_Page.verifyPagetitle("Etherscan Registration Page");


    }

    @After
    public void teardown() {
        System.out.println("=========================================================================================");
        driver.quit();
    }

    @Before
    public void firstprin(Scenario sc) {
        System.out.println("welcome to Smoke Test " + sc.getName());
    }

    @When("^I open Etherscan website$")
    public void iOpenEtherscanWebsite() {
        String webdriver = System.getProperty("propertyName");
        if (webdriver.equals("firefox")) {
            System.out.println("====Application Lunch in firefox Browser====");
        } else {
            System.out.println("====Application Lunch in default Chrome Browser ===");
        }
        createWebDriver(webdriver);
    }

    @When("^Tescase\"([^\"]*)\" number and Testcase Description \"([^\"]*)\"$")
    public void tescase_number_and_Testcase_Description(String arg1, String arg2) {
        System.out.println("======" + "TestCase Number:" + arg1 + "======" + "TestCase Description:" + arg2 + "=============");
    }


    @Given("^enter Username name as \"([^\"]*)\"$")
    public void enter_Username_name_as(String arg1) {
        registration_Page.enter_Username(arg1);

    }

    @Then("^enter Email Address as \"([^\"]*)\"$")
    public void enter_Email_Address_as(String arg1) {
        registration_Page.enter_EmailAddress(arg1);
    }

    @Then("^enter Password as \"([^\"]*)\" and Confirm Password as \"([^\"]*)\"$")
    public void enter_Password_as_and_Confirm_Password_as(String arg1, String arg2) {
        // Write code here that turns the phrase above into concrete actions
        registration_Page.enter_Password(arg1);
        registration_Page.enter_ConfirmPassword(arg2);
    }


    @Then("^click Create an Account button \"([^\"]*)\"$")
    public void clickCreateAnAccountButton(String arg0) throws Throwable {
        registration_Page.Click_cretae_Account_btn(arg0);
        registration_Page.errorverify(arg0);
    }

    @Then("^I agree to the Terms and Conditions \"([^\"]*)\"$")
    public void iAgreeToTheTermsAndConditions(String arg0) throws Throwable {
        if (arg0.equals("Yes")) {
            registration_Page.checkbox_terms();
        }
    }
}