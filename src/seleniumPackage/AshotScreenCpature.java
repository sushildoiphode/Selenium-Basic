package seleniumPackage;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class AshotScreenCpature {
	
	//Changes done by deepak dude on 28-9
	//Changes

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.testingshastra.com/");
		driver.manage().window().maximize();
		AShot ashot=new AShot();
		
		//Screenshot sc=ashot.takeScreenshot(driver);
		//ImageIO.write(sc.getImage(), "PNG", new File("D:\\capturedthroughAshot12345.png"));
		
		
		//Using FUll page
		Screenshot sc=ashot.shootingStrategy(ShootingStrategies.viewportPasting(5000)).takeScreenshot(driver);
		ImageIO.write(sc.getImage(), "PNG", new File("D:\\captureAshot1112234.png"));
		
		
		
		
		
	}

}
