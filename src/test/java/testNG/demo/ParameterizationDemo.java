package testNG.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationDemo {
	
	//adding one line comment to commit into central repo
	//just a random comment
	
	@Test
	@Parameters({"url", "username", "password"})
	public void method1(String d, String b, String c) {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get(d);
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys(b);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(c);
	}
	
	@Test
	@Parameters({"username", "password"})
	public void method2(String a, String b) {
		System.out.println(a+'\n'+b);
	}

}
