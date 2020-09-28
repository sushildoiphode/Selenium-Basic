package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//html/body/div[1]/div[6]/div[2]/div[text()='Later']")).click();;
		//ChromeOptions option=new ChromeOptions();
		//option.addArguments("--disable-popup-blocking");
		WebElement mouse=driver.findElement(By.xpath("//a[text()='Get in Touch']"));
		WebElement mice=driver.findElement(By.xpath("//a[text()='Payments']"));
		Actions s=new Actions(driver);
		s.moveToElement(mouse).build().perform();
		
		Thread.sleep(10000);
		s.contextClick(mouse);
		s.perform();
		Thread.sleep(10000);
		System.out.println("1");
	
	}

}
