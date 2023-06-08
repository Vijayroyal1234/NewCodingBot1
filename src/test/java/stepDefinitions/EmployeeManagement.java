package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class EmployeeManagement {
	
	@Then("user navigates to Add Employee Page")
	public void navigateToAddEmployeePage() {
		System.out.println("Application is successfully navigated to the Add Employee page.");
		
	}
	
	@Then("user enters the employee data without login details")
	public void enterEmpBasicInfo() {
		
		System.out.println("Employee first name, last name, middle name and employee id are entered..");
		
	}
	
	@Then("user saves the employee")
	public void saveEmployee() {
		System.out.println("Employee detauls have been saved..");
	}
	
	@Then("verify employee is created successfully")
	public void verifyEmployeeCreation() {
		System.out.println("Employee has been created successfully..");
		
	}
	
	@And("user enters the employee data with login details")
	public void enterEmpLoginDetails() {
		System.out.println("Employee username and password are entered.");
	}

}
