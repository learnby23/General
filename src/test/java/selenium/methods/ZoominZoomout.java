package selenium.methods;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ZoominZoomout {
	@Test
	public void zoomInOut() throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='150%'");
		Thread.sleep(2000);

		js.executeScript("document.body.style.zoom='200%'");
		Thread.sleep(2000);

		js.executeScript("document.body.style.zoom='90%'");
		Thread.sleep(2000);
		driver.quit();

	}

}
