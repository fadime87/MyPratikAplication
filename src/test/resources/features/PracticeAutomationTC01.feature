Feature: PracticeAutomationTC01
  @HadiOlacakIns
  Scenario:Home page with three slider only
    Given Enter the URL 'http://practice.automationtesting.in/'
    Then Click on Shop Menu
    And Now click on Home menu button
    And Test whether the Home page has Three Sliders only
    #Then The Home page must contains only three sliders
   # And Now click the image in the Arrivals
    #And Test whether it is navigating to next page where the user can add that book into his basket.
    #And Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And Click on the Add To Basket button which adds that book to your basket
    And User can view that Book in the Menu item with price.
    And Now click on Item link which navigates to proceed to check out page.
    And Now user can find total and subtotal values just above the Proceed to Checkout button.
    And The total always  subtotal because taxes are added in the subtotal
    And Now click on Proceed to Check out button which navigates to payment gateway page.
    And User can view Billing Details,Order Details,Additional details and Payment gateway details.
    And Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
    And Now click on Place Order button to complete process
    Then On clicking place-order button user completes the process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.