@MyBookings @BookingReply @BQ
Feature: Reply Booking Request

## every booking request for email send mode will send an email about the booking request to airlines inbox
## and in BQ Dashboard if the airline have a BQ Account
## all we have to do is to update the Allocation Code in the Flight Details section

	Scenario Outline: Airline login to their BQ Account
		Given airline input <username>, <password> in BQ loagin page
		When airline click Sign in button
		Then airline login successfully to BQ Dashboard
		
		Examples:
		| email										| password	|
		| testingdevbc2@gmail.com	| password	|
		
	@Positive @EmailSendMode
	Scenario Outline: Reply a booking request successfully
		Given airline click the new booking request
		And airline is on BQ Booking Details page
		When airline select <allocationCode> in the Allocation Code dropdown
		And airline click Submit button
		Then airline will see the booking status is updated to <status>
		And booking status in BC Dashboard is also updated to <status>
	
		Examples:
		| allocationCode	| status		|
		| SS							| Confirmed	|
		| KK							| Confirmed	|
		| HK							| Wait List	|
		| HL							| Wait List	|
		| HN							| Wait List	|
		| LL							| Wait List	|
		| UU							| Rejected	|
		| UN							| Rejected	|