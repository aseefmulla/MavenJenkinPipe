package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;

	@Test(priority = 1)
	public void f() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.get("https://www.goibibo.com/");
	}

	@Test(priority = 2)
	public void date() {
		String dot = "18/April 2019";
		String date, month, year;
		String caldt, calmonth, calyear;
		/*
		 * Split the String into String Array
		 */
		String dateArray[] = dot.split("/");
		date = dateArray[0];
		
		year = dateArray[1];

		driver.findElement(By.xpath("//div[@class='dF whiteBg col-sm-5 alignItemsCenter  col-md-2 ']/input")).click();

		calyear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
		/**
		 * Select the year
		 */
		while (!calyear.equals(year)) {
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			calyear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
			System.out.println("Displayed Year::" + calyear);
		}

		
		/**
		 * Select the Date
		 */
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
	}
}
