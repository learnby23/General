package selenium.methods;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DownloadFileInChrome {
	@Test
	public void downloadFile() throws InterruptedException {

		ChromeOptions options = new ChromeOptions(); // Create the object of the ChromeOptions Class
		String downloadFilepath = System.getProperty("user.dir"); // To get the path of the project directory

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>(); // Below 4 Lines to set user defined path
																				// of file
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options); // Pass the ChromeOptions object to Driver(Compulsory)
		driver.manage().window().maximize();
		driver.get("https://jmeter.apache.org/download_jmeter.cgi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.linkText("apache-jmeter-5.5_src.zip")).click();

		File downloadFile = new File(downloadFilepath + "apache-jmeter-5.5_src.zip"); // Check the path of file
		Thread.sleep(15000); // Wait to download the file and after that the Assert will Check

		Assert.assertTrue(downloadFile.exists()); // To check the file is exists of the mentioned path or not

		downloadFile.delete(); // To delete the file after download

	}
}
