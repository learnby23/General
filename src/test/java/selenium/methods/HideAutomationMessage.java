package selenium.methods;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HideAutomationMessage {

	@Test
	public void hideAutomationMessage() {

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://facebook.com");

		driver.quit();
	}

}
