package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		String text=driver.findElement(By.xpath("//a[text()='Gmail']")).getText();
		System.out.println(text);

	}

}
