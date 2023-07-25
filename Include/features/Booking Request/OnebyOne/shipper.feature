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
Feature: Create New Shipper

	@Positive @ShipperDetails	
	Scenario Outline: adding Shipper to the booking
		Given agent click add shipper button
		And agent input shipper info <ShipperCode>, <ShipperAccountNo>, <ShipperName>, <ShipperAddress>, <ShipperCity>, <ShipperState>, <ShipperCountry>, <ShipperPostalCode>, <ShipperContact>, <ShipperFax>
		When agent click Save Shipper button
		Then agent see shipper details populated on Shipper Section
		
		Examples:
		| ShipperCode		| ShipperAccountNo		| ShipperName		| ShipperAddress	| ShipperCity	| ShipperState	| ShipperCountry	| ShipperPostalCode	| ShipperContact	| ShipperFax |
		|	SHP1					| 1234567890					| TEST SHIPPER	| TESTING ADDRESS	| SIN					| SIN						| SG							| 92455							| 655123455				| 655123445	 |
		