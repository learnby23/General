package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoSuggestions {

	@Test
	public void autoSuggestions() throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		search.sendKeys("Camera");
		Thread.sleep(5000);

		Actions actions = new Actions(driver);
		actions.sendKeys(search, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		WebElement rightclick = driver.findElement(By.linkText("Amazon miniTV"));
		actions.contextClick(rightclick).perform();
		// actions.click(rightclick).perform();
		// actions.doubleClick(rightclick).perform();
		Thread.sleep(2000);

		driver.quit();

	}

}
