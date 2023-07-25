@MyAirlines
Feature: Create New Airlines

  @Positive @AirlinePage
  Scenario: Go to My Airline page
  	Given agent on BC Dashboard page
  	When agent click My Airline button
  	Then agent redirect to My Airline page
  	When agent click Create Airline button
  	Then agent redirect to Create New Airline page

## create new airlines with email send mode
## the configuration and data input can be random or following the configuration from Airline Common Reference in BC Portal Admin
  @Positive @CreateAirlines @Email
  Scenario Outline: Create new airlines with email send mode successfully
  	Given agent on Create New Airline page
  	And agent input <carrier_code> on Carrier Code field
  	And agent input <carrier_prefix> on Carrier Prefix field
  	And agent input <station> on Station field
  	And agent input <airline_email> on Airline Email field
  	When agent click Save button
  	Then agent successfully create a new airline for email send mode
  #	Then agent see successful message <success_alert_email> displaying for email send mode
  	
  	Examples:
  	| carrier_code 	| carrier_prefix	| station	| airline_email					| #success_alert_email											|
		| MM						| 323							| SIN			| test@hotmail.com			| #Airline has been created successfully.	| 

## create new airlines with EDI send mode
## the configuration and data input should be follow the configuration from Airline Common Reference in BC Portal Admin
	@Positive @CreateAirlines @EDI
	Scenario Outline: Create new airlines with EDI send mode successfully
		Given agent on Create New Airline page
  	And agent input <carrier_code_edi> on Carrier Code field for EDI
  	And agent input <carrier_prefix_edi> on Carrier Prefix field for EDI
  	And agent input <station_edi> on Station field for EDI
  	When agent click Save button for EDI Airline
  	Then agent successfully create a new EDI airline
  #	And agent see <message_edi> displaying for EDI airline creation
  	
  	Examples:
  	| carrier_code_edi 	| carrier_prefix_edi	| station_edi	| # message_edi															|
		| TK								| 235									| SIN					| # Airline has been created successfully.	|
		
## create new airlines with both Email and EDI send mode
## emails are pre-configured on Airline Common Reference in BC Portal Admin
## the configuration and data input should be follow the configuration from Airline Common Reference in BC Portal Admin
	@Positive @CreateAirlines @Both
  Scenario Outline: Create new airlines with both send mode successfully
  	Given agent on Create New Airline page
  	And agent input <carrier_code_both> on Carrier Code field for both
  	And agent input <carrier_prefix_both> on Carrier Prefix field for both
  	And agent input <station_both> on Station field for both
  	When agent click Save button for both
  	Then agent successfully create a new airline for both
  #	And agent see <success_alert_both> displaying for both airline creation
  	
  	Examples:
  	| carrier_code_both 	| carrier_prefix_both	| station_both	| #success_alert_both											|
		| MH									| 232									| MNL						| #Airline has been created successfully.	|  
  