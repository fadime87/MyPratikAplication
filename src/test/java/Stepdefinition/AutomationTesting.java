package Stepdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationTestingPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationTesting {

    AutomationTestingPage automationTestingPage=new AutomationTestingPage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();


    @Given("url ye gider {string}")
    public void url_ye_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("automationTestingUrl"));

    }

    @Given("Verify that Automation Demo Site is visible successfully")
    public void verify_that_automation_demo_site_is_visible_successfully() {
        Assert.assertTrue(automationTestingPage.Verifytext.isDisplayed());

    }

    @Given("Register button click")
    public void register_button_click() {
        automationTestingPage.RegisterButton.click();

    }

    @Then("Fill details")
    public void fill_details() throws InterruptedException {

        actions.click (automationTestingPage.firstName)
                        .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
        .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys("123456789")
                .sendKeys(Keys.TAB).perform();
                  automationTestingPage.feMale.click();
               actions.click(automationTestingPage.hobby)
                       .sendKeys(Keys.TAB)
                       .sendKeys(Keys.TAB).perform();

               automationTestingPage.languages.click();
               Thread.sleep(2000);
               automationTestingPage.arabic.click();

               Select select=new Select(automationTestingPage.skill);
           select.selectByValue("Android");

        automationTestingPage.scrollToWebelementVisible(automationTestingPage.country);

          Select select2=new Select(automationTestingPage.country);
          select2.selectByValue("Australia");

       // select = new Select(obje.bayiislemleripage().bayiislemleriTumIslemlerBelirltilenAdetKayitSayisi);
        //  List<WebElement> sec3 = select.getOptions();
        // select.selectByIndex(Faker.instance().random().nextInt(sec3.size()));

        actions.click(automationTestingPage.yearBox)
                .sendKeys(Keys.TAB)
                .sendKeys("1987")
                .sendKeys(Keys.TAB)
                .sendKeys("January")
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
               // .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
               // .sendKeys(faker.internet().password()).perform();
                       .sendKeys("12345").perform();
         automationTestingPage.submit.click();















    }

}
