package selenium.methods;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendKeys {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium"); // It is used to pass the value to input field
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER); // It is used to press the Enter Key

		// driver.findElement(By.xpath("//img[@alt='Google']")).sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Google']")));
		button.click();

	}

}
