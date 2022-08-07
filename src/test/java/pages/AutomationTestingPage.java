package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationTestingPage {

    public AutomationTestingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='col-sm-8 col-xs-8 col-md-8']")
    public WebElement Verifytext;

    @FindBy(xpath = "//a[@href='Register.html']")
    public WebElement RegisterButton;

    @FindBy(xpath = "//input[@placeholder='First Name']")
   public WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastName;

    @FindBy(xpath = "//textarea[@class='form-control ng-pristine ng-valid ng-touched']")
    public WebElement adress;

    @FindBy(xpath = "//input[@value='FeMale']")
    public WebElement feMale;

    @FindBy(xpath = "//input[@value='Movies']")
    public WebElement hobby;

    @FindBy(xpath = "//div[@id='msdd']")
    public WebElement languages;
    @FindBy(xpath = "(//a[@class='ui-corner-all'])[3]")
    public WebElement catalan;

    @FindBy(xpath = "//a[@style='text-decoration:none']")
    public WebElement arabic;

    @FindBy(xpath = "//select[@id='Skills']")
    public WebElement skill;
    @FindBy(xpath = "//select//option[@value='Android']")
    public WebElement android;
    @FindBy(xpath = "//select[@id='country']")
    public WebElement country;
    @FindBy(xpath = "//select[@id='yearbox']")
    public WebElement yearBox;

    @FindBy(xpath = "//button[@id='submitbtn']")
    public WebElement submit;

    public void scrollToWebelementVisible(WebElement webElement) {
        JavascriptExecutor jss = (JavascriptExecutor) Driver.getDriver();
        jss.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }


    /////Alerttttttt//////

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement switchTo;

    @FindBy(xpath = "(//a[@style='color: white'])[1]")
    public WebElement alerts;

    @FindBy(xpath = "//a[@class='analystic']")
    public WebElement alertwithOk;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement onclickAlertButton;





}
