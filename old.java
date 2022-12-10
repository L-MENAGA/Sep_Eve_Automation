

package com.sd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BDD_Helper.BDD_File_Reader_Manager;
import com.Runner.TestRunner;

import Cucumber_Mrng_Project.Cucumber_Mrng.BDD_Base_Class;
import Cucumber_Mrng_Project.Cucumber_Mrng.BDD_Page_Object_Manager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class old {//extends BDD_Base_Class{
	/*public static WebDriver driver = TestRunner.driver;
	BDD_Page_Object_Manager pom = new BDD_Page_Object_Manager(driver);
	
	
	@Before
	private void beforeHooks(Scenario s) throws Throwable {
		
		
		String name = s.getName();
		
		System.out.println("Scenario Name "   +name);
		
		System.out.println("Scenario Started");
		
	}
	
	@After
	private void afterHooks(Scenario s) {
		if(s.isFailed()) {
			System.out.println("Screeshot");
		}
		
		Status status = s.getStatus();
		System.out.println("Status "    +status);
	}
	
	
	
	
	
	
	
	@Given("User Launches The Application")
	public void user_launches_the_application() throws Throwable {
		
		//String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		url("https://adactinhotelapp.com/");
		
	 }


	/*@When("User Enters Username And Password")
	public void user_enters_username_and_password() {
		//signin Button
		clickOnElement(pom.getInstanceLogin().getSignIn());
		
		//username
	inputValueElement(pom.getInstanceHp().getEmail(), "abc@gmail.com");
		
		//password
	inputValueElement(pom.getInstanceHp().getPassword(), "123456");
	    
	}*/
	
	
	
	/*@When("User Enters Username And Password")
	public void user_enters_username_and_password() throws Throwable {
		
		WebElement userbox = driver.findElement(By.id("username"));		
		inputValueElement(userbox, "Username");
		
		WebElement passbox = driver.findElement(By.id("password"));		
		inputValueElement(passbox, "Password");
		
		
		Thread.sleep(2000);
	    
	}



	

	/*@When("User Enters {string} And {string}")
	public void user_enters_and(String Username, String Password) throws Throwable {
	
	}*/



	/*@Then("User Clicks On SignIn And Navigates To Search Hotel Page")
	public void user_clicks_on_sign_in_and_navigates_to_search_hotel_page() {
		//click
		WebElement login = driver.findElement(By.id("login"));
		clickOnElement(login);
	}*/




}
