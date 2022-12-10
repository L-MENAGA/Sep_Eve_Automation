package com.sd;

import org.openqa.selenium.WebDriver;

import com.BDD_Helper.BDD_File_Reader_Manager;
import com.Runner.Run;

import Cucumber_Mrng_Project.Cucumber_Mrng.BDD_Base_Class;
import Cucumber_Mrng_Project.Cucumber_Mrng.BDD_Page_Object_Manager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BDD_Base_Class {
	public static WebDriver driver = Run.driver;
	BDD_Page_Object_Manager pom = new BDD_Page_Object_Manager(driver);
	
	
	
	@Before
	public void beforeHooks(Scenario s) {
		
		System.out.println("Scenario:    "  +s.getName());
		System.out.println("Scenario Started");
	}
	
	@After
	public  void afterHooks(Scenario m) {
		if(m.isFailed()) {
			
			System.out.println("Screeshot");
		}
		
		 Status status = m.getStatus();
		 System.out.println( "Status  : "   +status);
		
	}
	

	@Given("User Launches The Application")
	public void user_launches_the_application() {
		url("https://adactinhotelapp.com/");
	  
	}
	@When("User Enters {string} in Username Field")
	public void user_enters_in_username_field(String username) {
		inputValueElement(pom.getInstanceHp().getEmail(),username);
		
	}
	@When("User Enters {string}  in Password Field")
	public void user_enters_in_password_field(String password) {
		inputValueElement(pom.getInstanceHp().getPassword(),password);
	   
	}
	@Then("User Clicks On Login Button It Navigates To Home Page")
	public void user_clicks_on_login_button_it_navigates_to_home_page() {
	    clickOnElement(pom.getInstanceHp().getLogin());
	}


	@When("User Selects On {string}")
	public void user_selects_on(String hotelLocaion) {
	   
	}
	@When("User Selects {string} and {string} No. Of Childrens")
	public void user_selects_and_no_of_childrens(String noRoom, String noChildren) {
	   
	}
	@When("User Selects Checkin Date")
	public void user_selects_checkin_date() {
	    
	}
	@When("User Selects Check Out Date")
	public void user_selects_check_out_date() {
	   
	}




		
	   
	}







