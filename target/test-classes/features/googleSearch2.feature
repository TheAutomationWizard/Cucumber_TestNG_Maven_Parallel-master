@Guru99-Second
Feature: Guru99 Secondary Testing



Background: Launch the application
 Given 		Launch website "chrome"


Scenario: Customer Login as Nakul chacha

	Given Customer Enters Credential and Login
	When  New Customer "Nakul chacha" entered
	Then  Customer Log outs
	

Scenario: Customer Login as Rohit Bishoyi

	Given Customer Enters Credential and Login
	When  New Customer "Rohit Bishoyi" entered
	Then  Customer Log outs
	
