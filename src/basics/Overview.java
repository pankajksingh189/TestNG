package basics;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Overview {
  @Test(dataProvider = "create")
  public void Test3(Integer n, String s) {
	  System.out.println(n+"--"+s);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }

  @AfterMethod
  public void afterMethod() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }
  @BeforeClass
  public void beforeClass() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }

  @AfterClass
  public void afterClass() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }

  @BeforeTest
  public void beforeTest() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
   }

  @AfterTest
  public void afterTest() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }

  @BeforeSuite
  public void beforeSuite() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }

  @AfterSuite
  public void afterSuite() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }

  
  @Test
  public void Test1() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }
  
  @Test
  public void Test2() {
	  String name = new Object(){}.getClass().getEnclosingMethod().getName();
	  System.out.println(name);
  }


  @DataProvider(name = "create")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }

  /*
  Below is the list of listeners that TestNG implements.

  IExecutionListener – It keeps track of a TestNG run from the beginning to end.
  IAnnotationTransformer – It can customize a TestNG annotation and make it work accordingly.
  ISuiteListener – It monitors the start and finish of a test suite.
  ITestListener – It keeps checking on different states of a TestNG test.
  IConfigurationListener – It tracks the events triggered w.r.t. configuration methods.
  IMethodInterceptor – It gives us the ability to change the list of test methods during a TestNG run.
  IInvokedMethodListener – It adds handlers to invoke before calling the TestNG before and after methods.
  IHookable – It allows setting up a callback method to trigger before a test method.
  IReporter – It lets us produce a test report for overall execution.
  */
}
