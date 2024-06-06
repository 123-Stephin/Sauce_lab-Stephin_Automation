package Stephinpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.manage().window().maximize();
		
		driver.findElement(By.id("nav-orders")).click();
		driver.findElement(By.className("a-input-text")).sendKeys("stephinphilip270@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("123456@Stephin");
		driver.findElement(By.className("a-button-input")).click();
		
		driver.findElement(By.name("field-keywords")).click();
		driver.findElement(By.className("nav-input")).sendKeys("Mac book");
		driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
