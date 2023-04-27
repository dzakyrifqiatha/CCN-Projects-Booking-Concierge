@MyBookings @Email
Feature: Create New Booking

## create new booking with email send mode
## the flight has 0 stops
	@Positive @EmailSendMode
	Scenario Outline: Create new booking successful
		Given agent go to Create New Booking page
		When agent input <AWBPrefix>, <AWBSuffix>, <Origin>, <Destination>, <GoodsDesc>, <Pieces>, <Weight>, <Volume>, <CarrierCode>, <FlightNumber>, <FlightDate>, <Departure>, <Arrival>, <AllocationCode>
		And agent click Send Request button
		Then agent see <message> displaying
		And agent redirected back to BC Dashboard page
	
		Examples:
		| AWBPrefix	| AWBSuffix	| Origin	| Destination	| GoodsDesc	| Pieces	| Weight	| Volume	| CarrierCode	| FlightNumber	|	FlightDate	| Departure	| Arrival	| AllocationCode	|
		| 123				| 1234567		| SIN			| CGK					| TESTING		| 10			| 10			| 10			| MM					| 123						| 24-Apr-23		| SIN				| CGK			| NN							|

## create new booking with email send mode
## the flight has 1 stops	
	@Positive @EmailSendMode
	Scenario Outline: Create new booking successful
		Given agent go to Create New Booking page
		When agent input <AWBPrefix>, <AWBSuffix>, <Origin>, <Destination>, <GoodsDesc>, <Pieces>, <Weight>, <Volume>, <CarrierCode>, <FlightNumber>, <FlightDate>, <Departure>, <Arrival>, <AllocationCode>
		And agent click add flight again
		And agent input <CarrierCode2>, <FlightNumber2>, <FlightDate2>, <Departure2>, <Arrival2>, <AllocationCode2>
		And agent click Send Request button
		Then agent see <message> displaying
		And agent redirected back to BC Dashboard page
	
		Examples:
		| AWBPrefix	| AWBSuffix	| Origin	| Destination	| GoodsDesc	| Pieces	| Weight	| Volume	| CarrierCode	| FlightNumber	|	FlightDate	| Departure	| Arrival	| AllocationCode	| CarrierCode2	| FlightNumber2	| FlightDate2	| Departure2	| Arrival2	| AllocationCode2	|
		| 123				| 1234567		| SIN			| BJS					| TESTING		| 10			| 10			| 10			| MM					| 123						| 24-Apr-23		| SIN				| BKK			| NN							| MM						| 223						| 24-Apr-23		| BKK					| BJS				| NN							|
	
	