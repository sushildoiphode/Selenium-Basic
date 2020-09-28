package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://gofile.io/welcome");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='nav-icon fas fa-file-upload']")).click();
		driver.findElement(By.id("btnChooseFiles")).click();
		

	}

}
