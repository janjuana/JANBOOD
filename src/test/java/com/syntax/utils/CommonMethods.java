package com.syntax.utils;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods extends BaseClass {

	public static void enterValue(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public static WebElement waiting(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void click(WebElement element) {
		WebElement elm = waiting(element);
		elm.click();
	}

	public static void Action(WebElement e, String a) {
		Actions obj = new Actions(driver);
		obj.moveToElement(e).click().sendKeys(Keys.CLEAR).sendKeys(a).build().perform();
		obj.sendKeys(Keys.ENTER).build().perform();

	}

	public static void Select(WebElement a, String b) {
		Select obj1 = new Select(a);
		obj1.selectByVisibleText(b);

	}

}
