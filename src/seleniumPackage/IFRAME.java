package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFRAME {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flashscore.in/football/");
		Thread.sleep(3000);
		driver.switchTo().frame("lsadvert-zid-1234-iframe");
		//driver.findElement(By.xpath("//li/a[@href='/isl/']")).click();
		driver.findElement(By.xpath("//img[@src='https://content.livesportmedia.eu/media?name="
				+ "row_120x240_22.gif%20(13)&type=gif&s=1576063689']")).click();;
							
	}

}
