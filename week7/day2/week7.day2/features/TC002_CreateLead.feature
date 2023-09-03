@Mugesh
Feature: Funtionality of Create Lead Module 
#Background:
#	Given Launch the browser 
#	And Load the url 
@Regression
Scenario Outline: Create Lead with Mandatory fields 

#	Given Launch the browser 
#	And Load the url 
	Given Enter the Username as 'demoSalesManager' 
	Given Enter the Password as 'crmsfa' 
	When Click on the Login button 
	Then WelcomePage is dispalyed 
	When Click on CRMSFA link 
	When Click on Leads link 
	When Click on CreateLead link 
	When Enter the companyName as <companyName> 
	When Enter the firstName as <firstname> 
	When Enter the lastName as <lname> 
	When Click on Create button 
	Then ViewLead page is displayed 

	
	Examples: 
		|companyName|firstname|lname|
		|'Testleaf'|'Vidya'|'R'|
		|'Qeagle'|'Aravind'|'R'|
