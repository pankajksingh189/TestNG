package main;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNg {

	@Parameters({ "first-name" ,"last-name"})
	@Test
	public void method(String fName,@Optional("Singh") String lName) {
		System.out.println("test is to test Parameters in TestNG.");
		System.out.println("Value passed from TestNG is "+fName+" "+lName);
	}
}


