package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PracticeAutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PracticeAutomation01 {

    PracticeAutomationPage practiceAutomationPage=new PracticeAutomationPage();

    @Given("Enter the URL {string}")
    public void enter_the_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("automationPracticeTestingUrl"));
    }
    @Then("Click on Shop Menu")
    public void click_on_shop_menu() {
        practiceAutomationPage.ShopMenu.click();

    }
    @Then("Now click on Home menu button")
    public void now_click_on_home_menu_button() {
       practiceAutomationPage.homeMenu.click();
    }
    @Then("Test whether the Home page has Three Sliders only")
    public void test_whether_the_home_page_has_three_sliders_only() {
        Assert.assertTrue(practiceAutomationPage.img.isDisplayed());
    }
   // @Then("The Home page must contains only three sliders")
   // public void the_home_page_must_contains_only_three_sliders() {

   // }

    //@Then("Now click the image in the Arrivals")
   // public void now_click_the_image_in_the_arrivals() {
    //   practiceAutomationPage.img1.click();
    //}
   // @Then("Test whether it is navigating to next page where the user can add that book into his basket.")
   // public void test_whether_it_is_navigating_to_next_page_where_the_user_can_add_that_book_into_his_basket() {

  //  }
   // @Then("Image should be clickable and shoul navigate to next page where user can add that book to his basket")
   // public void image_should_be_clickable_and_shoul_navigate_to_next_page_where_user_can_add_that_book_to_his_basket() {

   // }
    @Then("Click on the Add To Basket button which adds that book to your basket")
    public void click_on_the_add_to_basket_button_which_adds_that_book_to_your_basket() {
   practiceAutomationPage.addToBasket.click();
    }
    @Then("User can view that Book in the Menu item with price.")
    public void user_can_view_that_book_in_the_menu_item_with_price() {
Driver.waitAndClick(practiceAutomationPage.viewBasket);

    }
    @Then("Now click on Item link which navigates to proceed to check out page.")
    public void now_click_on_item_link_which_navigates_to_proceed_to_check_out_page() {

    }
    @Then("Now user can find total and subtotal values just above the Proceed to Checkout button.")
    public void now_user_can_find_total_and_subtotal_values_just_above_the_proceed_to_checkout_button() {

    }
    @Then("The total always  subtotal because taxes are added in the subtotal")
    public void the_total_always_subtotal_because_taxes_are_added_in_the_subtotal() {

    }
    @Then("Now click on Proceed to Check out button which navigates to payment gateway page.")
    public void now_click_on_proceed_to_check_out_button_which_navigates_to_payment_gateway_page() {

    }
    @Then("User can view Billing Details,Order Details,Additional details and Payment gateway details.")
    public void user_can_view_billing_details_order_details_additional_details_and_payment_gateway_details() {

    }
    @Then("Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.")
    public void now_user_can_fill_his_details_in_billing_details_form_and_can_opt_any_payment_in_the_payment_gateway_like_direct_bank_transfer_cheque_cash_or_paypal() {

    }
    @Then("Now click on Place Order button to complete process")
    public void now_click_on_place_order_button_to_complete_process() {

    }
    @Then("On clicking place-order button user completes the process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.")
    public void on_clicking_place_order_button_user_completes_the_process_where_the_page_navigates_to_order_confirmation_page_with_order_details_bank_details_customer_details_and_billing_details() {

    }




}
