package selenium.methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class setSize {
	
	@Test
	public void setsize() {
		
		WebDriver driver=new EdgeDriver();
		
		// To set the Size of the Window
		Dimension d=new Dimension(400,600); 
		driver.manage().window().setSize(d);
		
		driver.quit();
		
		

	}

}
