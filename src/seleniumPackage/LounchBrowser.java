package seleniumPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LounchBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).sendKeys("123456");
		//driver.findElement(By.cssSelector("input[name='SubmitCreate']")).click();
}	
}