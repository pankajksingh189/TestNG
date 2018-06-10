package main;

import org.testng.annotations.*;

public class DataProviderTestNG {

	//This method will provide data to any test method that declares that its Data Provider
	//is named "test1"
	@org.testng.annotations.DataProvider(name = "test1")
	public Object[][] createData1() {
		return new Object[][] {
			{ "Pankaj", new Integer(27) },
			{ "Singh", new Integer(28)},
		};
	}

	//This test method declares that its data should be supplied by the Data Provider
	//named "test1"
	@Test(dataProvider = "test1")
	public void verifyData1(String n1, Integer n2) {
		System.out.println(n1 + " --> " + n2);
	}

}
