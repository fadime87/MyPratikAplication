package Stepdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationExcercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01_Stepdefination {
  AutomationExcercisePage automationExcercisePage=new AutomationExcercisePage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("AutomationExerciseUrl"));

    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(automationExcercisePage.VerifyHomePage.isDisplayed());

    }

    @Then("Click on Signup Login button")
    public void click_on_signup_login_button() {
      automationExcercisePage.SingUpLoginButton.click();

    }

    @Then("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
      Assert.assertTrue(automationExcercisePage.VerifySingUpButton.isDisplayed());

    }
    @Then("Enter name and email address")
    public void enter_name_and_email_address() {

      actions.click(automationExcercisePage.nameButton)
              .sendKeys(Keys.TAB)
              .sendKeys(faker.name().firstName())
              .sendKeys(Keys.TAB)
              .sendKeys(faker.internet().emailAddress()).perform();

    }
    @Then("Click Signup button")
    public void click_signup_button() {
            automationExcercisePage.singUpButton.click();
    }
   @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
   public void verify_that_enter_account_information_is_visible() {
      Assert.assertTrue(automationExcercisePage.VerfyAccountInformation.isDisplayed());
    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
      actions.click(automationExcercisePage.MrsButton)
              .sendKeys(Keys.TAB)
              .sendKeys(Keys.TAB)
             // .sendKeys(Keys.TAB)
              .sendKeys(faker.internet().password())
              .sendKeys(Keys.TAB)
              .sendKeys("6")
              .sendKeys(Keys.TAB)
              .sendKeys("April")
              .sendKeys(Keys.TAB)
              .sendKeys("1988").perform();


    }
    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        automationExcercisePage.scrollToWebelementVisible(automationExcercisePage.Newsletter1);
     automationExcercisePage.Newsletter1.click();
    }
    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {

    automationExcercisePage.Newsletter2.click();
    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
              actions.click(automationExcercisePage.firstName1)
                     // .sendKeys(Keys.TAB)
                      .sendKeys(faker.name().firstName())
                      .sendKeys(Keys.TAB)
                      .sendKeys(faker.name().lastName())
                      .sendKeys(Keys.TAB)
                      .sendKeys(faker.address().fullAddress())
                      .sendKeys(Keys.TAB)
                      .sendKeys(faker.address().fullAddress()).perform();
        Select select=new Select(automationExcercisePage.country);
        select.selectByValue("Canada");
         automationExcercisePage.scrollToWebelementVisible(automationExcercisePage.state);
  actions.click(automationExcercisePage.state)
          //.sendKeys(Keys.TAB)
          .sendKeys(faker.address().state())
          .sendKeys(Keys.TAB)
          .sendKeys(faker.address().city())
          .sendKeys(Keys.TAB)
          .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
          .sendKeys(faker.phoneNumber().phoneNumber())
          .sendKeys(Keys.TAB).perform();


    }
    @Then("Click Create Account button")
    public void click_create_account_button() {
        automationExcercisePage.createAccount.click();

    }
    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
Assert.assertTrue(automationExcercisePage.VeryfcreateAccount.isDisplayed());
    }
    @Then("Click Continue button")
    public void click_continue_button() {
    automationExcercisePage.countinue.click();
    }
    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(automationExcercisePage.verifylogged.isDisplayed());

    }
    @Then("Click Delete Account button")
    public void click_delete_account_button() {

  automationExcercisePage.deleteButonu.click();
    }
   // @Then("Verify that ACCOUNT DELETED! is visible and click {string} button")
   // public void verify_that_account_deleted_is_visible_and_click_button(String string) {

   // }
}
