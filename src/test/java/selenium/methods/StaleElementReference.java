package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class StaleElementReference {

	@Test
	public void stateElement() throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");

		WebElement text = driver.findElement(By.id("radio1")); // Located an element
		text.click(); // Provide the text in textfield

		driver.findElement(By.linkText("compendiumdev")).click(); // Click on redirection url and goes to new page

		driver.navigate().back(); // Back to the original page
		// text.clear();
		// To overcome this issue again locate the element and then perform the action
		// on it
		// text = driver.findElement(By.id("radio1"));
		text.click();

	}

}
