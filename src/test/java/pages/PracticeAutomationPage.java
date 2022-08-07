package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeAutomationPage {
  public PracticeAutomationPage(){
      PageFactory.initElements(Driver.getDriver(), this);
  }

    @FindBy(xpath = "//li[@id='menu-item-40']")
    public WebElement ShopMenu;


   @FindBy(xpath = "(//a[@href='https://practice.automationtesting.in'])[2]")
   public WebElement homeMenu;

  @FindBy(xpath = "//img[@alt='Shop Selenium Books']")
  public WebElement img;

    @FindBy(xpath = "//img[@alt='Shop Selenium Books']")
    public WebElement img1;

  @FindBy(xpath = "(//a[@data-quantity='1'])[1]")
  public WebElement addToBasket;

    @FindBy(xpath = "//a[@title='View Basket']")
    public WebElement viewBasket;

    //@FindBy(xpath = "(//a[@data-quantity='1'])[1]")
   // public WebElement addToBasket;
}
