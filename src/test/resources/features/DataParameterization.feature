Feature: writing the scenarios with data parameterization

@regression
Scenario: a sample scenario to pass the data in the steps
Given launch the browser "chrome" browser and navigate to "https://facebook.com"
And login to the application and validate
	|username|aqewqheqewq|
	|password|eqweqweqqeq|
Then enter employee personal data
	|FirstName|dsadhaskdas|
	|MiddleName|dajshdajshdaks|
	|LastName|dsajhdskajhdsa|
	|EmployeeId|kjdshadsa|
	
	
	@Parameterization
Scenario Outline: a sample scenario to run with multiple data sets
Given launch <browser> and navigate to <url>
And enter <username> and <password> and click on login button

Examples:
	|browser|url|username|password|
	|chrome|https://google.com|abc123|sadsadsada|
	|firefox|https://facebook.com|jdkshadjshd|sadsadsada|
	

