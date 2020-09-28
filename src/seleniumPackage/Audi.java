package seleniumPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Audi {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("wdgt-file-upload")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\TS1.exe");
	}
}
