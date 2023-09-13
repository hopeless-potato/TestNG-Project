package testNG.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	  
	   @Test(dataProvider="credentials")
	   public void login(String a, String b) {
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://login.salesforce.com/?locale=in");
		   driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys(a);
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(b);
	   }  	   
	   
	   @DataProvider
	   public Object[][] credentials() {
	    	Object[][] data=new Object[2][2];
	    	data[0][0]="harry";
	    	data[0][1]="harry@123";
	    	data[1][0]="natasha";
	    	data[1][1]="natasha@123";
	    	return data;
	    }
   }

    