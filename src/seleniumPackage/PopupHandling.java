package seleniumPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopupHandling {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		WebElement drag=driver.findElement(By.xpath("//div//div/img[@id=\"drag1\"]"));
		WebElement drop=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[4]"));
		Actions s=new Actions(driver);
		//s.dragAndDrop(drag, drop);
		//s.perform();
		s.clickAndHold(drag);
		s.moveToElement(drop);
		s.release();
		s.perform();
		System.out.println("Sushil");
		
		
		
		
		
				
	
		/*ChromeOptions option=new ChromeOptions();
		option.addArguments("--enable-popup-blocking");
		option.addArguments("-incognito");
		WebDriver driver=new ChromeDriver(option);
		driver.get("http://www.facebook.com");
		*/
	  
		
		
	}

}

