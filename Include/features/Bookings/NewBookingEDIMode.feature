@MyBookings @EDI
Feature: Create New Booking

## create new booking with EDI send mode
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
	And agent click add flight button
	And agent input <CarrierCode>, <FlightNumber>, <FlightDate>, <Departure>, <Arrival>, <AllocationCode>
	And agent click add ULD button
	And agent input <ULDType>, <ULDContour>, <NumOfULD>, <WeightPerULD>, <CommodityCode>
	And agent click Send Request button
	Then agent see <message> displaying
	And agent redirected back to BC Dashboard page
	
	Examples:
	| AWBPrefix	| Origin	| Destination	| GoodsDesc	| Pieces	| Weight	| Volume	| CommodityInfo	| CarrierCode	| FlightNumber	|	FlightDate	| Departure	| Arrival	| AllocationCode	| ULDType	| ULDContour	| NumOfULD	| WeightPerULD	| CommodityCode	|
	| 618				| SIN			| CGK					| TESTING		| 10			| 10			| 10			| ACP						| SQ					| 999						| 24-Apr-23		| SIN				| CGK			| NN							| FLA			| L3					| 2					| 3							| ACP						|

## create new booking with EDI send mode
## the flight has 1 stops	
	@Positive @EmailSendMode
	Scenario Outline: Create new booking successful
	Given agent go to Create New Booking page
	When agent input <AWBPrefix>, <Origin>, <Destination>, <GoodsDesc>, <Pieces>, <Weight>, <Volume>
	And agent select AWB Suffix from AWB Stock list
	And agent click add flight button
	And agent input <CarrierCode>, <FlightNumber>, <FlightDate>, <Departure>, <Arrival>, <AllocationCode>
	And agent click add flight button
	And agent input <CarrierCode2>, <FlightNumber2>, <FlightDate2>, <Departure2>, <Arrival2>, <AllocationCode2>
	And agent click add ULD button
	And agent input <ULDType>, <ULDContour>, <NumOfULD>, <WeightPerULD>, <CommodityCode>
	And agent click Send Request button
	Then agent see <message> displaying
	And agent redirected back to BC Dashboard page
	
	Examples:
	| AWBPrefix	| AWBSuffix	| Origin	| Destination	| GoodsDesc	| Pieces	| Weight	| Volume	| CarrierCode	| FlightNumber	|	FlightDate	| Departure	| Arrival	| AllocationCode	| CarrierCode2	| FlightNumber2	| FlightDate2	| Departure2	| Arrival2	| AllocationCode2	| ULDType	| ULDContour	| NumOfULD	| WeightPerULD	| CommodityCode	|
	| 123				| 1234567		| SIN			| BJS					| TESTING		| 10			| 10			| 10			| MM					| 123						| 24-Apr-23		| SIN				| BKK			| NN							| MM						| 223						| 24-Apr-23		| BKK					| BJS				| NN							| FLA			| L3					| 2					| 3							| ACP						|
	
## create new booking with EDI send mode
## the flight has 1 stops	
## the volume replaced by Density Group
	@Positive @EmailSendMode
	Scenario Outline: Create new booking successful
	Given agent go to Create New Booking page
	When agent input <AWBPrefix>, <Origin>, <Destination>, <GoodsDesc>, <Pieces>, <Weight>, <DensityGroup>, <CommodityInfo>
	And agent select AWB Suffix from the AWB Stock list
	And agent click add flight button
	And agent input <CarrierCode>, <FlightNumber>, <FlightDate>, <Departure>, <Arrival>, <AllocationCode>
	And agent click add ULD button
	And agent input <ULDType>, <ULDContour>, <NumOfULD>, <WeightPerULD>, <CommodityCode>
	And agent click Send Request button
	Then agent see <message> displaying
	And agent redirected back to BC Dashboard page
	
	Examples:
	| AWBPrefix	| Origin	| Destination	| GoodsDesc	| Pieces	| Weight	| DensityGroup	| CommodityInfo	| CarrierCode	| FlightNumber	|	FlightDate	| Departure	| Arrival	| AllocationCode	| ULDType	| ULDContour	| NumOfULD	| WeightPerULD	| CommodityCode	|
	| 618				| SIN			| CGK					| TESTING		| 10			| 10			| 4							| ACP						| SQ					| 999						| 24-Apr-23		| SIN				| CGK			| NN							| FLA			| L3					| 2					| 3							| ACP						|

		