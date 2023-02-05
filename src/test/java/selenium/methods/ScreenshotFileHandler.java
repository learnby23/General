package selenium.methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenshotFileHandler {
	
	@Test
	public void screenshotfileHandler() throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		//driver.findElement(By.id("alert1")).click();
		// click on alert button but we can't take screenshot to overcome this issue we
		// need to use the Robot class

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//The screenshot does not contain the name of url 
		File path = new File(System.getProperty("user.dir") + "\\Screenshot\\screenfile.png");//To capture in file directory
		FileHandler.copy(srcFile, path);

		driver.quit();
		
	}

}
