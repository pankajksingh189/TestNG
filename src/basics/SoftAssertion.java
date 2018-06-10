package basics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	
// Executes all line of code
	@Test(priority=1)
	public void testSoftAssert() {
		SoftAssert sf=new SoftAssert();
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("inside method: "+name);
		sf.assertTrue(false, "Failed");
		System.out.println("First assertion completed.");
		sf.assertTrue(true, "Passed");
		System.out.println("Second assertion completed.");
		sf.assertAll();
	}

	// terminates test if failed
	@Test(priority=2)
	public void testHardAssert() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("inside method: "+name);
		Assert.assertTrue(false, name);
		System.out.println("First assertion completed.");
	}
	
	}
