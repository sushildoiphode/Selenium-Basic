package seleniumPackage;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class sc {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.testingshastra.com/");
		Thread.sleep(4000);
		/*Robot robo=new Robot();
		Rectangle re=new Rectangle();
		re.setSize(1366, 768);
		BufferedImage image=robo.createScreenCapture(re);
		File f=new File("D:\\Sushil\screen.png");
		ImageIO.write(image, "png", f);	  */
		
	}

}
