@MyBookings @Shipper @Consignee @UNID	@Insurance @ULD @FlightSchedule
Feature: Create New Booking

## create new booking with all details are filled
## the flight has 0 stops
## ULD is mandatory for SQ bookings
## CommodityCode on ULD modals are autopopulated by CommodityInfo on Booking Details section
## ULDType and ULDContour should be selected from dropdown instead of typing it manually
## AWBSuffix should be selected from the AWB Stock by clicking the search icon next to AWBSuffix textfield
## To determine which airlines have the Shipper and Consignee button, we have to configure it in Shipper Consignee page in BC Portal Admin
	@Positive @EmailSendMode
	Scenario Outline: Create new booking successful
		Given agent go to Create New Booking page
		When agent input booking details <AWBPrefix>, <Origin>, <Destination>, <GoodsDesc>, <Pieces>, <Weight>, <Volume>, <CommodityInfo>
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
		
			
	Scenario Outline: adding UNID to the booking
		Given agent click add dangerous goods details
		And agent input UNID details <UNID>, <ProperShippingName>, <PG>, <PI>, <TI>, <NoOfPackages>, <QtyPerPackages>
		When agent click Save Dangerous Goods button
		Then agent see dangerous goods details populated on Dangerous Goods Section
		
		Examples:
		| UNID	| ProperShippingName	| PG	| Class	| PI	| TI	| NoOfPackages	| QtyPerPackages	|
		| 1723	| Allyl Iodide				| II	| 3			| 352	| 2		| 2							| 2								|
		
		
	Scenario Outline: adding Shipper to the booking
		Given agent click add shipper button
		And agent input shipper info <ShipperCode>, <ShipperAccountNo>, <ShipperName>, <ShipperAddress>, <ShipperCity>, <ShipperState>, <ShipperCountry>, <ShipperPostalCode>, <ShipperContact>, <ShipperFax>
		When agent click Save Shipper button
		Then agent see shipper details populated on Shipper Section
		
		Examples:
		| ShipperCode		| ShipperAccountNo		| ShipperName		| ShipperAddress	| ShipperCity	| ShipperState	| ShipperCountry	| ShipperPostalCode	| ShipperContact	| ShipperFax |
		|	SHP1					| 1234567890					| TEST SHIPPER	| TESTING ADDRESS	| SIN					| SIN						| SG							| 92455							| 655123455				| 655123445	 |
		
		
	Scenario Outline: adding Consignee to the booking
		Given agent click add consignee button
		And agent input consignee info <CosigneeCode>, <CosigneeAccountNo>, <CosigneeName>, <CosigneeAddress>, <CosigneeCity>, <CosigneeState>, <CosigneeCountry>, <CosigneePostalCode>, <CosigneeContact>, <CosigneeFax>
		When agent click Save Consignee button
		Then agent see consignee details populated on Consignee Section
		
		Examples:
		| CosigneeCode		| CosigneeAccountNo		| CosigneeName		| CosigneeAddress	| CosigneeCity	| CosigneeState	| CosigneeCountry	| CosigneePostalCode	| CosigneeContact	| CosigneeFax			|
		|	CNE1						| 1234567891					| TEST CONSIGNEE	| TESTING ADDRESS	| SIN						| SIN						| SG							| 92455								| 655123459				| 655123489				|		
		
		
	Scenario Outline: Adding Insurance to the booking
		Given agent click add insurance button
		And agent input insurance details <CommodityType>, <GoodsDescription>, <GoodsValue>, <InsuranceCode>, <InsuranceName>, <InsuranceEmail>, <InsuranceAddress>, <InsuranceCity>, <InsuranceState>, <InsuranceCountry>, <InsurancePostalCode>
		When agent click Save insurance button
		Then agent see insurance details populated on Insurance Section
		
		Examples:
		| CommodityType	| GoodsDescription	| GoodsValue	| InsuranceCode	| InsuranceName	| InsuranceEmail					| InsuranceAddress	| InsuranceCity	| InsuranceState	| InsuranceCountry	| InsurancePostalCode |
		|	TEST					| TEST INSURANCE		| 12					| SHP						| TEST SHIPPER	| testtestbc2@hotmail.com	| TESTING ADDRESS		| SIN						| SIN							| SG								|	123123		 					|
		
	
	Scenario Outline: Adding ULD to the booking
		Given agent click add ULD button
		And agent input ULD details <ULDType>, <ULDContour>, <NumOfULD>, <WeightPerULD>, <CommodityCodeULD>
		When agent click Save uld button
		Then agent see ULD details populated in ULD section
		
		Examples:
		| ULDType	| ULDContour	| NumOfULD	| WeightPerULD	| CommodityCodeULD	|
		| FLA			| L3					| 2					| 3							| ACP								|
		
	
	Scenario Outline: Sending the booking
		When agent click Send Request button
		Then agent see <SendBookingMessage> displaying
		And agent redirected back to BC Dashboard page
		
		Examples:
		| SendBookingMessage				|
		| Booking Request is sent. 	|