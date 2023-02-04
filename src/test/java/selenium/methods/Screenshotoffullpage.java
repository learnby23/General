package selenium.methods;

import java.io.File;
import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class Screenshotoffullpage {
	
	@Test
	public void takesScreenshot() throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Screenshot screenshotfullpage = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
		
		ImageIO.write(screenshotfullpage.getImage(),"PNG",new File(System.getProperty("user.dir")+"\\Screenshot\\page.png"));
		
		driver.quit();
	}
}
