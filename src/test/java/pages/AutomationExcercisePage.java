package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExcercisePage {

    public AutomationExcercisePage()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//img[@src='/static/images/home/logo.png']")
    public WebElement VerifyHomePage;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement SingUpLoginButton;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement VerifySingUpButton;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement nameButton;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement emailButton;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement singUpButton;
    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement VerfyAccountInformation;

    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement MrsButton;
    @FindBy(xpath = "//input[@name='newsletter']")
    public WebElement Newsletter1;
    @FindBy(xpath = "//input[@id='optin']")
    public WebElement Newsletter2;

    public void scrollToWebelementVisible(WebElement webElement) {
        JavascriptExecutor jss = (JavascriptExecutor) Driver.getDriver();
        jss.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstName1;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    public WebElement createAccount;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement VeryfcreateAccount;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement countinue;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement verifylogged;

    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteButonu;
}
