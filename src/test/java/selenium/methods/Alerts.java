package selenium.methods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alerts {

	@Test
	public void handleAlert() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//input[@id='alert1']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();

		driver.findElement(By.xpath("//input[@id='alert1']")).click();
		Thread.sleep(2000);
		alert.dismiss();

		driver.findElement(By.xpath("//input[@id='alert1']")).click();
		Thread.sleep(2000);
		System.out.println("The text of alert is: " + driver.switchTo().alert().getText());
		alert.accept();

		driver.findElement(By.xpath("//input[@id='prompt']")).click();
		alert.sendKeys("Welcome");
		alert.accept();
		driver.quit();

		/*
		 * We will not see the sendKeys element in field in case of chrome browser
		 * because there is problem in chrome browser to display the message
		 */

	}
}
