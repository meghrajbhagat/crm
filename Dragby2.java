package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragby2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElements(By.xpath("//a[@aria-label=\"Google apps\"]"));
		driver.switchTo().frame("app");
		WebElement youtube = driver.findElement(By.xpath("//span[text()='YouTube']"));
		Actions a=new Actions(driver);
		a.click(youtube).perform();
		
		
	}

}
