package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.utility.Utility;

public class AmazonHomePgae extends Utility {

	public void OpenAmazon() {
		initialization(prop.getProperty("Amazonurl"));

	}

	public void click() {
		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.id("nav-link-accountList"));
		actions.moveToElement(mainMenu);
		actions.build().perform();

		WebElement subMenu = driver.findElement(By.cssSelector("span.nav-action-inner"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();

	}

	public boolean amazomPage() {
		WebElement amazompage = driver.findElement(By.xpath("//h1[@class='a-spacing-small']"));

		return waitAndIsDisplayed(amazompage);
	}
	public void dropDownValueSelect(String value) {
		WebElement locatorDropDown = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		selectDropDown(locatorDropDown,value);
	}
	
	public void sendValue(String value) {
		WebElement locatorsearch = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		locatorsearch.sendKeys(value);
	}
	public void clickOnSubmitButton() {
		WebElement clickLocator = driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
		waitAndClick(clickLocator);
	}
	public boolean displaySearchResult(String search) {
		return driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/div/div[1]/div/div/span[4]")).getText().contains(search);
	}
}
