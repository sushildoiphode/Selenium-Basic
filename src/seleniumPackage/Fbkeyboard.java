package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fbkeyboard {
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\selenium\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement name=driver.findElement(By.id("email"));
	name.sendKeys("Sushil");
	WebElement email=driver.findElement(By.id("pass"));
	Thread.sleep(5000);
	Actions s=new Actions(driver);
	Thread.sleep(2000);
	s.keyDown(name, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	//Thread.sleep(5000);
	s.keyDown(email, Keys.CONTROL).sendKeys("v").keyUp(name, Keys.CONTROL).build().perform();
	//System.out.println("2");
	
	
	}
	
}
