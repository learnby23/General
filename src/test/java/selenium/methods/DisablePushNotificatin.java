package selenium.methods;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DisablePushNotificatin {

	@Test
	public void disablePushNotification() {

		// First way to disable the notifications in chrome browser
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--disable-notifications");
		 */

		// Second way to disable the notifications in chrome browser
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", map);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://redbus.in");

	}

}
