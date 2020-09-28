package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/account/register/basicdetails");
		driver.findElement(By.xpath("//button[@value='fresher']")).click();
		WebElement name=driver.findElement(By.name("fname"));
		name.sendKeys("Sushil Doiphode");
		//name.sendKeys(Keys.TAB);
		WebElement email=driver.findElement(By.id("email"));
		Actions s=new Actions(driver);
		s.keyDown(name, Keys.CONTROL).sendKeys("a").keyUp(name, Keys.CONTROL).build().perform();
		//Thread.sleep(5000);
		//s.keyDown(name, Keys.CONTROL).sendKeys("c").keyUp(name, Keys.CONTROL).perform();
		//s.sendKeys(Keys.TAB);
		//s.keyDown(name, Keys.CONTROL).sendKeys(Keys.TAB).keyUp(name, Keys.CONTROL);
		//Thread.sleep(5000);
		//s.keyDown(email, Keys.CONTROL).sendKeys("v").keyUp(email, Keys.CONTROL).build().perform();
		
		Thread.sleep(4000);
		s.keyDown(name, Keys.CONTROL).sendKeys("c").perform();
		Thread.sleep(4000);
		s.keyUp(name, Keys.CONTROL).build().perform();
		s.keyDown(email, Keys.CONTROL).sendKeys("v").keyUp(email, Keys.CONTROL).build().perform();
		s.keyUp(email, Keys.CONTROL).sendKeys("v").build().perform();	
	}

}





