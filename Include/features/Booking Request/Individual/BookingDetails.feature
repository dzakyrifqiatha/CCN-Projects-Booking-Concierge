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
@MyBookings
Feature: Create Booking Details
  Agent wants to complete the booking details

  @MyBookings @Positive @BookingDetails
	Scenario Outline: Create new booking successful
		Given agent go to Create New Booking page
		When agent input booking prefix <BookingAWBPrefix>
		And agent input booking origin <BookingOrigin> 
		And agent input booking destination <BookingDestination> 
		And agent input booking goods desc <BookingGoodsDesc> 
		And agent input booking pieces <BookingPieces> 
		And agent input booking weight <BookingWeight> 
		And agent input booking volume <BookingVolume> 
		And agent input booking commodity info <BookingCommodityInfo>
		And agent select AWB Suffix from the AWB Stock list
		Then agent see AWB SUffix populated on AWB Suffix textfield
	
		Examples:
		| BookingAWBPrefix	| BookingOrigin	| BookingDestination	| BookingGoodsDesc	| BookingPieces	| BookingWeight	| BookingVolume	| BookingCommodityInfo	|
		| 618								| SIN						| CGK									| TESTING						| 10						| 10						| 10						| ACP										| 