@MyAirlines
Feature: Create New Airlines

  @Positive
  Scenario: Go to My Airline page
  	Given agent on BC Dashboard page
  	When agent click My Airline button
  	Then agent redirect to My Airline page
  	When agent click Create Airline button
  	Then agent redirect to Create New Airline page

## create new airlines with email send mode
## the configuration and data input can be random or following the configuration from Airline Common Reference in BC Portal Admin
  @Positive @MyAirlines @CreateAirlines
  Scenario Outline: Create new airlines with email send mode successfully
  	Given agent on Create New Airline page
  	And agent input <carrier code> on Carrier Code field
  	And agent input <carrier prefix> on Carrier Prefix field
  	And agent input <station> on Station field
  	And agent input <email> on Airline Email field
  	When agent click Save button
  	Then agent successfully create a new airline
  	And agent see successful message <success alert> displaying
  	
  	Examples:
  	| carrier code 	| carrier prefix	| station	| email					| message																	|
		| MM						| 123							| SIN			| test@test.com	| Airline has been created successfully.	| 

## create new airlines with EDI send mode
## the configuration and data input should be follow the configuration from Airline Common Reference in BC Portal Admin
	@Positive @MyAirlines @CreateAirlines
	Scenario Outline: Create new airlines with EDI send mode successfully
		Given agent on Create New Airline page
  	And agent input <carrier code> on Carrier Code field
  	And agent input <carrier prefix> on Carrier Prefix field
  	And agent input <station> on Station field
  	When agent click Save button
  	Then agent successfully create a new airline
  	And agent see <success alert> displaying
  	
  	Examples:
  	| carrier code 	| carrier prefix	| station	| message																	|
		| LX						| 724							| KUL			| Airline has been created successfully.	|
		
## create new airlines with both Email and EDI send mode
## emails are pre-configured on Airline Common Reference in BC Portal Admin
## the configuration and data input should be follow the configuration from Airline Common Reference in BC Portal Admin
	@Positive @MyAirlines @CreateAirlines
  Scenario Outline: Create new airlines with both send mode successfully
  	Given agent on Create New Airline page
  	And agent input <carrier code> on Carrier Code field
  	And agent input <carrier prefix> on Carrier Prefix field
  	And agent input <station> on Station field
  	When agent click Save button
  	Then agent successfully create a new airline
  	And agent see <success alert> displaying
  	
  	Examples:
  	| carrier code 	| carrier prefix	| station	| message																	|
		| SQ						| 618							| SIN			| Airline has been created successfully.	|  
  