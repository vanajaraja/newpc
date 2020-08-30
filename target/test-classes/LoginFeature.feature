Feature: Testing the login functionality

@Smoke
Scenario: Test the FB lgin page with valid credentials
Given User hould be in login page
When Enter username and password 
	|vanajasadasivam@gmail.com|Singapore@12|
Then User should be navigated to Home page

@Regression
Scenario Outline: Search for a products and prints it price

Given user should be in Search Page
When search for a product "<productname>"
Then Prints the product cost

Examples: 
|productname|
|Mens watches|
|Womens watches|
|Kids watches|
 