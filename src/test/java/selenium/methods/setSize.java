package selenium.methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class setSize {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		
		// To set the Size of the Window
		Dimension d=new Dimension(400,600); 
		driver.manage().window().setSize(d);
	

	}

}
