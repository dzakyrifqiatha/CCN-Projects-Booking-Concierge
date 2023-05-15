@MyBookings @BookingReply @EDI
Feature: Reply Booking Request

## every booking request for EDI send mode will send an FFR message to Chexs

	Scenario: Airline query the FFR message in Chexs
		Given airline login to Configurator
		When airline query the FFR message in Chexs log
		Then airline see the FFR message in the query result window
		
	@Positive @EmailSendMode
	Scenario Outline: Reply a booking request successfully
		Given airline go to Send Message tab in Configurator
		And airline input the <reply> message
		When airline click Send Message button
		Then airline will see the booking status is updated to <status>
		And booking status in BC Dashboard is also updated to <status>
	
		Examples:
		| reply		| allocationCode	| status		|
		| 				| SS							| Confirmed	|
		|					| KK							| Confirmed	|
		| 				| HK							| Wait List	|
		|					| HL							| Wait List	|
		|					| HN							| Wait List	|
		|					| LL							| Wait List	|
		|					| UU							| Rejected	|
		|					| UN							| Rejected	|