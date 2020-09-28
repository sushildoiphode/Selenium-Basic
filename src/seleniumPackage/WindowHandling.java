package seleniumPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bankofmaharashtra.in/");
		driver.findElement(By.xpath("//span[text()='Loan Scheme']")).click();
		String p=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> itr=s.iterator();
		while (itr.hasNext()) {
			if(p.equals(itr.next())) {
				
			}
			else
				driver.switchTo().window(itr.next());
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div/a")).click();
		}
		
		
		
		

	}

}
