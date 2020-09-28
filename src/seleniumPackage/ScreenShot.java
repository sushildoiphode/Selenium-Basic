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
import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.testingshastra.com/");
		usingRobot();
	}
	public static void usingRobot() {
		String path=System.getProperty("user.dir");
		System.out.println(path);
		File f=new File(path+"/Screenshot/"+getDate());
		
		if (f.mkdirs()==true) {
			System.out.println("Folder Created");
		} else {
			System.out.println("Folder not Created");
		}
		File file=new File(f,"/screenshot_"+getDateAndTime()+".png");
		
		try {
			Robot robo=new Robot();
			Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rect=new Rectangle(d);
			BufferedImage image=robo.createScreenCapture(rect);
			ImageIO.write(image, "png", file);
		} catch (AWTException e) {
			System.err.println("unable to take Screenshot");	
			e.printStackTrace();
		}catch(IOException e){
			System.err.println("Unable to take Screenshot");
			e.printStackTrace();
		}
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
		String formattedDate1=now.format(date);
		return formattedDate1;
	}
}
