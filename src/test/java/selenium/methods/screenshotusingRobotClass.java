package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class screenshotusingRobotClass {

	@Test(priority = 1, enabled = true)
	public void screenShotusingrobot() throws AWTException, IOException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.id("alert1")).click(); //To generate the alert

		Robot robot = new Robot(); // Create the object of the Robot class
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize(); // Dimension of the File
		Rectangle rectlangle = new Rectangle(dimension); // Shape of the File
		BufferedImage bufferImage = robot.createScreenCapture(rectlangle); // Capture the screenshot

		File path = new File(System.getProperty("user.dir") + "\\Screenshot\\url_alert.png"); // File path
		ImageIO.write(bufferImage, "PNG", path); // To store the file

		driver.switchTo().alert().accept(); // To handle the alert

		driver.quit();
	}

}
