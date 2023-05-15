@MyBookings @BookingReply @Email
Feature: Reply Booking Request

## every booking request for email send mode will send an email about the booking request to airlines inbox
## in the email, there's a button with text "Go to Booking"
## if we click it, it will redirect us to a new webform page similar to Booking Reply page in BQ Dashboard
## all we have to do is to update the Allocation Code in the Flight Details section

	Scenario: Airline open the Email Notification of Booking Request
		Given airline login to their email account
		When airline open the email about the booking request
		Then airline see the booking request details in the email body
		
	@Positive @EmailSendMode
	Scenario Outline: Reply a booking request successfully
		Given airline click Go to Booking button
		And airline is on Booking Reply webform page
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