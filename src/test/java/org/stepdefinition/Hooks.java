package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	
@Before
public void bef() {

	launchBrowser();
	launchUrl("https://www.facebook.com/");
	
}
	
@After
public void aft() {

	   closeBrowser();
}

@Before(order=1)
public void bef1() {
System.out.println("Before Scenario 1");
}
	
@Before(order=3)
public void bef2() {
System.out.println("Before Scenario 2");
}

@Before(order=2)
public void bef3() {
System.out.println("Before Scenario 3");
}

@After(order=9)
public void aft1() {
System.out.println("After Scenarion 1");
}

@After(order=7)
public void aft2() {
System.out.println("After Scenarion 2");
}

@After(order=8)
public void aft3() {
System.out.println("After Scenarion 3");
}
	
	
	
	
	
	
	
}
