package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {

	
	@Test
	public void serverStartedOk() {
	System.out.println("Inside serverStartedOk()");	
		Assert.fail();
	}
	 
	@Test(dependsOnMethods = { "serverStartedOk" })
	public void method1() {
		System.out.println("Running method1()");
	}

	@Test(groups = { "init" })
	public void envSetup() {
		System.out.println("Inside envSetup()");
	}
	 
	@Test(groups = { "init" })
	public void initEnvironment() {
		System.out.println("Inside initEnvironment()");		
	}
	 
	@Test(dependsOnGroups = { "init" })
	public void test() {
		System.out.println("Inside Test");
	}

}
