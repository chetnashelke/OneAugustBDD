package com.StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefination {

	WebDriver driver;
	@Given("User open a url")
	public void user_open_a_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   driver.findElement(By.name("password")).sendKeys("admin123");
	   driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Then("User on home page and verify homepage title")
	public void user_on_home_page_and_verify_homepage_title() {
	  String title =  driver.getTitle();
	  Assert.assertEquals(title, "OrangeHRM");
	}
}
