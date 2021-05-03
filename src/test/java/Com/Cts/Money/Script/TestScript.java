package Com.Cts.Money.Script;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Cts.Money.Base.Testbase;
import Com.Cts.Money.Pages.LoginPage;
import Com.Cts.Money.Utils.Testutil;

public class TestScript extends Testbase
{
  LoginPage log;
  
  @BeforeTest(alwaysRun=true)
  public void Setup()
  {
	  Open();
	  log=new LoginPage();
  }
  
  @Test
  public void VaildateTitle()
  {
	  String t=log.VerifyTitle();
	  Assert.assertEquals(t, "Sign up for Facebook | Facebook");
  }
  
  @Test
  public void VaildateUrl()
  {
	  String u=log.VerifyUrl();
	  Assert.assertEquals(u, "https://www.facebook.com/r.php");
  }
  
  
  @Test
  public void VaildateCreate()
  {
	  String p=log.VerifyCreate();
	  Assert.assertEquals(p, "Create a new account");
  }

  @Test
  public void VaildateFirstname()
  {
	  log.VerifyFirstname("roja");
	  
  }
  
  @Test
  public void VaildateLastname()
  {
	  log.VerifySurname("H");
	  
  }
  
  @Test
  public void ValidateDay()
  {
	  Testutil.Day(log.Day_Dropdown,6);
  }
  
  @Test
  public void ValidateMonth()
  {
	  Testutil.Month(log.Month_Dropdown,"Jan");
  }
  
  @Test
  public void ValidateYear()
  {
	  Testutil.Year(log.Year_Dropdown,"1990");
  }
  
  @Test
  public void VaildateRadio()
  {
	  boolean g =log.VerifyRadio();
	  Assert.assertTrue(g);
  }
  
  @AfterTest
  public void Teardown()
  {
	  driver.close();
  }
}
