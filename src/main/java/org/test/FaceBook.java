package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	WebDriver driver;

	@BeforeClass
	public void beforeLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");

	}

	@AfterClass
	private void afterLaunch() {
		driver.quit();
	}

	@Test
	public void test1() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("hariharan@mail.com");
		driver.findElement(By.id("pass")).sendKeys("Hari@123");
//		driver.findElement(By.id("loginbutton")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).getText());
	}

}
