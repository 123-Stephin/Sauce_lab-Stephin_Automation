package Stephinpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.manage().window().maximize();
//		//driver.get("https://www.amazon.in");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watches");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).click();
Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("watches");
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		//driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("9642408872");
	}

}
