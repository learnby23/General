package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class HeadlessMode {
	
	@Test
	public void headlessBrowser() {
		
		ChromeOptions options=new ChromeOptions(); 	//Provides the options of chrome 
		options.addArguments("--headless=new");  	//To set the browser inn headless mode
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://google.com");
		String text=driver.findElement(By.xpath("//a[text()='Gmail']")).getText();
		System.out.println(text);
		
		driver.quit();
	}

}
