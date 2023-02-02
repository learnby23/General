package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HTMLCodeofElement {
	
	@Test
	public void htmlcodeofElement() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='but2']"));
		System.out.println("The HTML code of the element is: "+button.getAttribute("outerHTML"));
		
		driver.quit();
	}

}
