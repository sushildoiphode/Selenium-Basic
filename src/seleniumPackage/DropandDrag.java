package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class DropandDrag {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(8);
	
		  WebElement drag=driver.findElement(By.id("draggable")); 
		  WebElement drop=driver.findElement(By.id("droppable")); 
		  Actions s=new Actions(driver);
		  
		 Thread.sleep(5000); 
		// s.dragAndDrop(drag, drop); 
		  s.clickAndHold(drag);
		  s.moveToElement(drop); 
		  s.release(); 
		  s.perform(); 
		  System.out.println("1");
		

	}

}
