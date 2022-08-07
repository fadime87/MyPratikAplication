package Stepdefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.AutomationTestingPage;
import utilities.Driver;
import utilities.JSUtils;

public class Alert {
    AutomationTestingPage automationTestingPage=new AutomationTestingPage();

    @Then("SwitchTo ya tiklayin")
    public void switch_to_ya_tiklayin() {
        automationTestingPage.switchTo.click();
        automationTestingPage.alerts.click();

       // driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
       // driver.switchTo().alert().accept();
        automationTestingPage.onclickAlertButton.click();

    }
}
