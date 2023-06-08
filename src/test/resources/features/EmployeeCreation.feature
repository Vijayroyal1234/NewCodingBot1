Feature: this feature is used for verifying the employee creation functionality

Background: this is background steps
Given close all the running browsers
And verify the environment is active or not

@smoke @dataCreation @CreateEmp
Scenario: create an employee without login details
Given launch the application
And login to the application
When user navigates to Add Employee Page
And user enters the employee data without login details
And user saves the employee
Then verify employee is created successfully
And logout from application

@regression @CreateEmp
Scenario: create an employee with login details
Given launch the application
And login to the application
When user navigates to Add Employee Page
And user enters the employee data with login details
And user saves the employee
Then verify employee is created successfully
And logout from application
And login to the application as employee
And logout from application


@smoke @CreateEmp
Scenario: create an employee with custom employee id
Given launch the application
And login to the application
When user navigates to Add Employee Page
And user enters the employee data with login details
And user saves the employee
Then verify employee is created successfully
And logout from application
And login to the application as employee
And logout from application





@regression @CreateEmp
Scenario: create an employee with duplicate employee id
Given launch the application
And login to the application
When user navigates to Add Employee Page
And user enters the employee data with login details
And user saves the employee
Then verify employee is created successfully
And logout from application
And login to the application as employee
And logout from application



@regression @CreateEmp @DataCreation
Scenario: create an employee with disabled status
Given launch the application
And login to the application
When user navigates to Add Employee Page
And user enters the employee data with login details
And user saves the employee
Then verify employee is created successfully
And logout from application
And login to the application as employee
And logout from application



@regression @CreateEmp
Scenario: create an employee with invalid password criteria
Given launch the application
And login to the application
When user navigates to Add Employee Page
And user enters the employee data with login details
And user saves the employee
Then verify employee is created successfully
And logout from application
And login to the application as employee
And logout from application