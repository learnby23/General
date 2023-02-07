package selenium.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TabandWindow {

	@Test
	public void tabandWindow() {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		driver.close();
		
//		driver.switchTo().newWindow(WindowType.WINDOW);
		
	}

}
