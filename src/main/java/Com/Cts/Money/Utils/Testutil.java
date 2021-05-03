package Com.Cts.Money.Utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import Com.Cts.Money.Base.Testbase;

public class Testutil extends Testbase
{
	public static void Maximize()
	{
		driver.manage().window().maximize();
	}
	
	public static void Implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public static void Screenshot()
	{
		try
		{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File(".//src//main//java//Com//Cts//Money//Screen//fb"+System.currentTimeMillis()+".jpg"));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void Day(WebElement day,int d)
	{
		Select sel = new Select(day);
		sel.selectByIndex(d);
	}
	
	public static void Month(WebElement month,String m)
	{
		Select se = new Select(month);
		se.selectByVisibleText(m);
	}

	
	public static void Year(WebElement Year,String y)
	{
		Select s = new Select(Year);
		s.selectByValue(y);
	}


}
