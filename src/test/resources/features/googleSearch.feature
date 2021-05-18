@Guru99-Primary
Feature: Guru99 Primary Testing


Background: Launch the application
 Given 		Launch website "chrome"


Scenario: Customer Login as Mohit

	Given Customer Enters Credential and Login
	When  New Customer "Mohit Maane" entered
	Then  Customer Log outs
	

Scenario: Customer Login as Chutiay

	Given Customer Enters Credential and Login
	When  New Customer "Kaushik Ray" entered
	Then  Customer Log outs
	

