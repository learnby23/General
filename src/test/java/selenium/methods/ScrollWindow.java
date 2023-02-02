package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollWindow {

	@Test
	public void scrolltheWindow() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Gmail" + Keys.RETURN);

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", ""); // To scroll the window by 700 pixels down
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", ""); // To scroll the window at bottom
		driver.quit();

	}

}
