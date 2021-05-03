package Com.Cts.Money.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Cts.Money.Base.Testbase;

public class LoginPage extends Testbase
{
  
  @FindBy(xpath="//input[@value='Log In to Existing Account']")
  WebElement login;
 
   @FindBy(id="email")
  WebElement Emailaddress;
  
  @FindBy(id="pass")
  WebElement Password;
  
  @FindBy(name="firstname")
  WebElement Firstname;
 
  @FindBy(name="lastname")
  WebElement Surname;
  
  @FindBy(xpath="//select[@id='day']")
  public WebElement Day_Dropdown;
  
  @FindBy(xpath="//select[@id='month']")
  public WebElement Month_Dropdown;
  
  @FindBy(xpath="//select[@id='year']")
  public WebElement Year_Dropdown;
  
  @FindBy(xpath="//div[text()='Create a new account']")
  WebElement Createnewaccount;
  
  @FindBy(xpath="//label[text()='Female']")
  WebElement Femaleradio;
  
  
  public LoginPage()
  {
	  super();
	  PageFactory.initElements(driver,this);
  }
  
  public String VerifyTitle()
  {
	  String t= driver.getTitle();
	  return t;
  }
  
  public String VerifyUrl()
  {
	  String p= driver.getCurrentUrl();
	  return p;
  }
  
  public void VerifyFirstname(String name)
  {
	  Firstname.sendKeys(name);
  }
  
  public void VerifySurname(String name)
  {
	  Surname.sendKeys(name);
  }
  
  public String VerifyCreate() 
  {
	  String st=Createnewaccount.getText();
	  return st;
  }
  
  public boolean VerifyRadio()
  {
	  boolean d=Femaleradio.isDisplayed();
	  return d;
  }
  
  public void VerifyEmail(String username)
  {
	  Emailaddress.sendKeys(username);
  }
  
  public void VerifyPass(String password)
  {
	  Password.sendKeys(password);
  }
  
  public void VerifyTest(String username,String password)
  {
	  try
	  {
	  Emailaddress.clear();
	  Emailaddress.sendKeys(username);
	  Thread.sleep(2000);
	  Password.clear();
	  Password.sendKeys(password);
	  Thread.sleep(2000);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
  }
}
