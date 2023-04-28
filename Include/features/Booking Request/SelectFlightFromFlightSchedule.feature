@MyBookings @FlightSchedule
Feature: Create New Booking

## create new booking with flight from Flight Schedule
## the flight has 0 stops
## ULD is mandatory for SQ bookings
## CommodityCode on ULD modals are autopopulated by CommodityInfo on Booking Details section
## ULDType and ULDContour should be selected from dropdown instead of typing it manually
## AWBSuffix should be selected from the AWB Stock by clicking the search icon next to AWBSuffix textfield
	@Positive @EmailSendMode
	Scenario Outline: Create new booking successful
		Given agent go to Create New Booking page
		When agent input <AWBPrefix>, <Origin>, <Destination>, <GoodsDesc>, <Pieces>, <Weight>, <Volume>, <CommodityInfo>
		And agent select AWB Suffix from the AWB Stock list
		Then agent see AWB SUffix populated on AWB Suffix textfield
	
		Examples:
		| AWBPrefix	| Origin	| Destination	| GoodsDesc	| Pieces	| Weight	| Volume	| CommodityInfo	|
		| 618				| SIN			| CGK					| TESTING		| 10			| 10			| 10			| ACP						| 

	
	Scenario: Adding flight to the booking
		Given agent click search flight button
		And agent click Search button on Flight Schedule modals
		And agent select flight
		When agent click Save flight button
		Then agent see flight details populated on Flight Section
		
	
	Scenario Outline: Adding ULD to the booking
		Given agent click add ULD button
		And agent input <ULDType>, <ULDContour>, <NumOfULD>, <WeightPerULD>, <CommodityCode>
		When agent click Save uld button
		Then agent see ULD details populated in ULD section
		
		Examples:
		| CommodityInfo	| ULDType	| ULDContour	| NumOfULD	| WeightPerULD	| CommodityCode	|
		| ACP						| FLA			| L3					| 2					| 3							| ACP						|
		
	
	Scenario Outline: Sending the booking
		When agent click Send Request button
		Then agent see <message> displaying
		And agent redirected back to BC Dashboard page
		
		Examples:
		| message										|
		| Booking Request is sent. 	|