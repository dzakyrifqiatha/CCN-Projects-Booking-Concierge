#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@MyBookings @Positive
Feature: Create UNID

  @Positive @UNIDDetails		
	Scenario Outline: adding UNID to the booking
		Given agent click add dangerous goods details
		And agent input UNID details <UNID>, <ProperShippingName>, <PG>, <PI>, <TI>, <NoOfPackages>, <QtyPerPackages>
		When agent click Save Dangerous Goods button
		Then agent see dangerous goods details populated on Dangerous Goods Section
		
		Examples:
		| UNID	| ProperShippingName	| PG		| PI		| TI	| NoOfPackages	| QtyPerPackages	|
		| 1990	| Allyl Iodide				| III		| Y964	| 2		| 2							| 2								|