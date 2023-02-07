package selenium.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenRecorder {
	
	@Test(enabled = false)
	public void screenRecorder() throws Exception {
		
		ScreenRecorderUtil.startRecord("ScreenRecorder");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		ScreenRecorderUtil.stopRecord();
		
		driver.quit();
	}

}
