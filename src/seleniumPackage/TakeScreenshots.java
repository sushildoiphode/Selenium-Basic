package seleniumPackage;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeoutException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakeScreenshots {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.testingshastra.com/");
		//usingRobot();
	//}
	//public static void usingRobot() {
		String path=System.getProperty("user.dir");
		System.out.println(path);
		File f=new File(path+"/Screenshot/"+getDate());
		
		if (f.mkdirs()==true) {
			System.out.println("Folder Created");
		} else {
			System.out.println("Folder not Created");
		}
		File file=new File(f,"/screenshot_"+getDateAndTime()+".png");
		
		/*
		 * RemoteWebDriver d=(RemoteWebDriver) driver; File
		 * src=d.getScreenshotAs(OutputType.FILE); 
		 * FileUtils.copyFile(src, file);
		 */
	
           AShot ashot=new AShot();
		//Screenshot sc=ashot.takeScreenshot(driver);
		//ImageIO.write(sc.getImage(), "PNG", new File("D:\\capturedthroughAshot12345.png"));
		
		//Using FUll page
		Screenshot sc=ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
		ImageIO.write(sc.getImage(), "PNG", file);
	}
	private static String getDateAndTime() {
		LocalDateTime now=LocalDateTime.now();
		DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy_MM_dd_HHmmss");
		String formatteddate = now.format(date);
		return formatteddate;
	}
	private static String getDate() {
		LocalDateTime now=LocalDateTime.now();
		DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy_MM_dd");
		String formattedDate=now.format(date);
		return formattedDate;
	}

}
