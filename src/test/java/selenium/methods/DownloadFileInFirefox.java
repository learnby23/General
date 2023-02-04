package selenium.methods;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DownloadFileInFirefox {
	
	@Test(enabled = false)
	public void downloadFileInFolder() throws InterruptedException {
		
		FirefoxOptions options=new FirefoxOptions();
		String downloadFilepath=System.getProperty("user.dir")+"\\Files";
		
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.download.folderList",2);
		profile.setPreference("browser.download.dir", downloadFilepath);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		
		options.setProfile(profile);
		
		WebDriver driver=new FirefoxDriver(options);  //Pass the FirefoxOptions object to Driver(Compulsory)
		driver.manage().window().maximize();
		driver.get("https://jmeter.apache.org/download_jmeter.cgi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.linkText("apache-jmeter-5.5_src.zip")).click();
		Thread.sleep(20000);
		
		File downloadedFile=new File(downloadFilepath+"\\apache-jmeter-5.5_src.zip");
		
		Assert.assertTrue(downloadedFile.exists());
		
		downloadedFile.delete();
		
		driver.close();
		driver.quit();
	}

}
