package stepdef;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.cucumber.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TaggedHooksStepDefinition {
	
	
	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable {
		System.out.println("1st step");
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
		System.out.println("2nd step");
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
		System.out.println("3rd step");
	}
	
	@Given("user has already logged in to the application")
	public void user_has_already_logged_in_to_the_application(DataTable dataTable) {
	  List<Map<String,String>> mp=  dataTable.asMaps();
	  
	 
	  for(int i=0; i< mp.size(); i++) {
	  System.out.println(mp.get(i).get("username")+ " "+ mp.get(i).get("password")); }
	  
	}

	
	
	

}
