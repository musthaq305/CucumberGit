package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{

	
	
	
	@When("User have to enter  invalid username and valid password")
	public void user_have_to_enter_invalid_username_and_valid_password(io.cucumber.datatable.DataTable d) {
		
		List<Map<String, String>> mp = d.asMaps(String.class,String.class);
		
		String email = mp.get(1).get("password");
		String pass = mp.get(2).get("email");
		
		WebElement mail = driver.findElement(By.id("emailId"));
		mail.sendKeys(email);
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pass);
	}

	
	@When("User have to enter {string} and {string}")
	public void user_have_to_enter_and(String email, String password) {
	    
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(email);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(password);
	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() {
	   
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

	@Then("User have to reach invalid credential page")
	public void user_have_to_reach_invalid_credential_page() {
	    
		String url = driver.getCurrentUrl();
		
		if (url.contains("privacy_mutation_token")) {
			
			System.out.println("User Reach Invalid Credential Page");
		}
		else {
             System.out.println("User Not Reach Invalid Credential Page");
		}
		
		
		
		
	}
	
	@When("User have to click forgotten password")
	public void user_have_to_click_forgotten_password() {
	  
		WebElement frgtnPass = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		frgtnPass.click();
	}

	@When("User have to enter invalid email")
	public void user_have_to_enter_invalid_email() {
	   
		WebElement email = driver.findElement(By.xpath("//input[@id='identify_email']"));
	    email.sendKeys("SST123@gmail.com");
	}

	@Then("User click the search button")
	public void user_click_the_search_button() {
	   
		WebElement search = driver.findElement(By.xpath("//button[@id='did_submit']"));
		search.click();
	}
     

@When("User have to enter  invalid username and invalid password")
public void user_have_to_enter_invalid_username_and_invalid_password() {
	
	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys("SSTechnology");
	
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("987654");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
