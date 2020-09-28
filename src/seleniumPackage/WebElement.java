package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:/html%20file/dropdown.html");
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.findElement(By.name("fname")).sendKeys("Sushil");
		driver.findElement(By.name("lname")).sendKeys("Doiphode");
		Select select=new Select(driver.findElement(By.tagName("select")));
		select.selectByVisibleText("Pune");
		/*Thread.sleep(10000);
		  driver.switchTo().frame(0);
		  driver.findElement(By.xpath("//a[text()='Assignments']")).click();
		  Thread.sleep(5000);
		//driver.switchTo().parentFrame();
		//s.selectByVisibleText("Mumbai");
		
		try {
			select.selectByVisibleText("Mumbai");
		}
		catch (StaleElementReferenceException e) {
			driver.navigate().refresh();
			Thread.sleep(5000);
			select.selectByVisibleText("Mumbai");
			//driver.findElement(By.name("fname")).sendKeys("Sushil");
		}*/
		}

	}


