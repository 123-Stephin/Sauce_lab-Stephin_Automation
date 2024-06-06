package com.java.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CuraHealth {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
		driver.findElement(By.id("btn-make-appointment")).click();
		
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		
		Select dropdown = new Select(driver.findElement(By.id("combo_facility")));
		dropdown.selectByValue("Hongkong CURA Healthcare Center");
		
		driver.findElement(By.id("chk_hospotal_readmission")).click();	
		
		driver.findElement(By.id("radio_program_medicaid")).click();
		
		driver.findElement(By.xpath("//input[@class='form-control']")).click();
		driver.findElement(By.xpath("//th[@class='next']")).click();
		driver.findElement(By.xpath("//td[text()='15']")).click();
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Nice Hospital");
		
		driver.findElement(By.id("btn-book-appointment")).submit();
	}

}
