package selenium.methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.Test;

public class ScreenshotFileUtils {

	@Test
	public void screenshotfileUtils() throws IOException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File tgtfile = new File(System.getProperty("user.dir") + "\\Screenshot\\fileutil.jpeg");
		FileUtils.copyFile(srcfile, tgtfile);
		
		driver.quit();
	}

}
