package rerunningFailedTests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestClass {

	@Test(retryAnalyzer=RerunningFailedTests.class)
	public void testHomePage() {
		System.out.println("Inside testHomePage()");
		Assert.fail();
	}
	
	@Test
	public void testLogin() {
		System.out.println("Inside testLogin()");
		Assert.fail();
	}	
}
