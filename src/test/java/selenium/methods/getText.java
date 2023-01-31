package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getText {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		String text=driver.findElement(By.xpath("//a[text()='Gmai']")).getText();
		System.out.println(text);
		

	}

}
