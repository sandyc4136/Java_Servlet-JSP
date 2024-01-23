package com.cdac;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class PhoneBookTest {

	@Test
	public void addContact() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://vjmklvljn3.csb.app/");
		
		driver.findElement(By.tagName("span")).click();
		
		
		driver.findElement(By.xpath("//div[@class='container']/form/div[1]/input")).sendKeys("Sandip");
		driver.findElement(By.xpath("//div[@class='container']/form/div[2]/input")).sendKeys("832385835");
		driver.findElement(By.className("btn-primary")).click();
		driver.close();
		
		
		//assertEquals()
		// write assertion t check if the entry for sandip was done or not
	}

}
