package Stephinpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Winodws {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.get("http://google.com");
		driver.navigate().to("http://amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
