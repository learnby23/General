package selenium.methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		// To set the Size of the Window
		Dimension d=new Dimension(1000,600); 
		driver.manage().window().setSize(d);
	

	}

}
