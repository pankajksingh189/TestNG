package rerunningFailedTests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunningFailedTests implements IRetryAnalyzer{
	private int maxRetry=2  ;
	private int retry=0;

	@Override
	public boolean retry(ITestResult arg0) {
		if (retry < maxRetry) {
			retry++;
			return true;
		}
		return false;
	}
}
