package Stephinpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class saucelab {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		driver.get("https://www.saucedemo.com/");
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");			//username
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");				//pswd
		
		driver.findElement(By.className("submit-button")).click();
			
		driver.findElement(By.xpath("//img[@src='/static/media/red-tatt-1200x1500.30dadef4.jpg']")).click();
		
		
		driver.findElement(By.id("add-to-cart")).click();
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
		
		driver.findElement(By.xpath("//a[@class='bm-item menu-item'][1]")).click();
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

		driver.findElement(By.xpath("//button[text() ='Remove']")).click();
		
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
		
		driver.findElement(By.xpath("//option[text()='Price (high to low)']")).click();
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Stephin");
		
		driver.findElement(By.id("last-name")).sendKeys("Abraham");
		
		driver.findElement(By.id("postal-code")).sendKeys("560076");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("finish")).click();
		
		driver.findElement(By.id("back-to-products")).click();
		
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();



}

}
