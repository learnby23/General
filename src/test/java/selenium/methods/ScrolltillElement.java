package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrolltillElement {

	@Test
	public void scrolltoElement() throws Exception {
		
		ScreenRecorderUtil.startRecord("ScrolltillElement");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		Thread.sleep(3000);

		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='alert2']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].scrollIntoView(true);", loginbutton);
		
		ScreenRecorderUtil.stopRecord();
		driver.quit();
	}

}
