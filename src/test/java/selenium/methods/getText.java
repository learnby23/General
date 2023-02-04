package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getText {

	@Test
	public void gettext() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String text = driver.findElement(By.xpath("//a[text()='Gmail']")).getText();
		System.out.println(text);
		driver.close();
		driver.quit();

	}

}
