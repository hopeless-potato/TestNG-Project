package testNG.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test1 {
	
	@Test(priority=1)
	public void method1() {
		System.out.println("hello1");
	}
	
	@Test(dependsOnMethods="method2")
	public void method9() {
		System.out.println("hello2");
	}
	
	@BeforeSuite
	public void method3() {
		System.out.println("beforeSuite");
	}
	
	@AfterSuite
	public void method4() {
		System.out.println("afterSuite");
	}
	
	@BeforeClass
	public void method7() {
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public void method8() {
		System.out.println("afterClass");
	}

}
