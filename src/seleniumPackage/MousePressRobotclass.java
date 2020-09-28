package seleniumPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousePressRobotclass {
	public static void main(String[] args) throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.testingshastra.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*Actions s=new Actions(driver);
		Robot r=new Robot();
		r.mouseMove(350, 200);
		//Thread.sleep(4000);
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK); */
		//Robot r=new Robot();
		//r.mouseMove(350, 295);
		//Thread.sleep(4000);
		Actions s=new Actions(driver);
		s.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		s.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
		
}
}
