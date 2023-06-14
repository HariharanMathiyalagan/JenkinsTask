package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");
		driver.findElement(By.id("email")).sendKeys("978456231");
		driver.findElement(By.id("pass")).sendKeys("Hari@123");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println(driver.findElement(By.xpath("//*[text()='Wrong credentials']")).getText());
		driver.quit();
	}

}
