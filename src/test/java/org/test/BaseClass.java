package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;

	public static void launchBrowser() {

		driver = new ChromeDriver();

	}

	public static void closeBrowser() {

		driver.close();
	}

	public static String pageTitle() {

		String title = driver.getTitle();

		return title;
	}

	public static String pageUrl() {

		String url = driver.getCurrentUrl();

		return url;

	}

	public static void launchUrl(String url) {

		driver.get(url);
	}

	public static void fillTextBox(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void clickElement(WebElement ele) {

		ele.click();

	}

	public static void getDateAndTime() {

		Date d = new Date();
		System.out.println(d);

	}

}
