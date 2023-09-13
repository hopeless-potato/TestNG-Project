package testNG.demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {
	
	@Test
	public void method2() {
		System.out.println("hello3");
	}
	
	@Test(dependsOnMethods="method2")
	public void method10() {
		System.out.println("hello4");
	}
	
	@BeforeTest
	public void method5() {
		System.out.println("beforeTest");
	}
	
	@AfterTest
	public void method6() {
		System.out.println("afterTest");
	}
	
	@BeforeMethod
	public void method11() {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void method12() {
		System.out.println("after method");
	}

}
 