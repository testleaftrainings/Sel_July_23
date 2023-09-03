@Nadiya
Feature: Funtionality of Login Module

#Background:
#Given Launch the browser
#And Load the url
@Smoke@Funtional
Scenario: Login with Positive Credentials

#Given Launch the browser
#And Load the url
Given Enter the Username as 'demoSalesManager'
Given Enter the Password as 'crmsfa'
When Click on the Login button
Then WelcomePage is dispalyed

@Sanity@Funtional
Scenario: Login with Negative Credentials

#Given Launch the browser
#And Load the url
Given Enter the Username as 'demo'
Given Enter the Password as 'crmsfa'
When Click on the Login button
But Error message is dispalyed