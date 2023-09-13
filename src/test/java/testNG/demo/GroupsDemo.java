package testNG.demo;

import org.testng.annotations.Test;

public class GroupsDemo {

	@Test(enabled=false)
	public void method1() {
		System.out.println("marked as imp");
	}
	
	@Test(groups="not imp")
	public void method2() {
		System.out.println("marked as not imp");
	}
	
	@Test(groups="imp")
	public void method3() {
		System.out.println("marked under exclude");
	}
	
	@Test(invocationCount=2)
	public void method4() {
		System.out.println("low priority");
	}
}