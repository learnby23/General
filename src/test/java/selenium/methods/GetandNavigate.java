package selenium.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetandNavigate {
	
	@Test
	public void getandnavigate() {

		WebDriver driver = new ChromeDriver(); // Launch the chrome browser
		driver.get("https://www.google.com"); // Provide the URL to browser
		driver.navigate().to("http://facebook.com"); //
		driver.navigate().back(); //
		driver.navigate().forward(); //
		driver.navigate().refresh(); //
		System.out.println("Hashcode of driver: " + driver.navigate().hashCode());

		driver.quit();

	}

}
