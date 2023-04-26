import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('OLD-Obsolete/Authentication Login/Login - BQ2.0'), [('Log_Email') : 'testingdevbc2@gmail.com', ('Log_Password') : 'password'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/a_AWB 1st row'))

if (WebUI.verifyElementPresent(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/td_FlightSection - FNumber'), 
    5)) {
    WebUI.click(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/mat-icon_FlightSection - create'))

    WebUI.click(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/div_FlightSection - AllocationCodeDropdown'))

    WebUI.click(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/span_HN'))

    WebUI.click(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/mat-icon_FlightSection - done'))
} else if (WebUI.verifyElementNotPresent(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/td_FlightSection - FNumber'), 
    5)) {

WebUI.callTestCase(findTestCase('OLD-Obsolete/BC2/Sprint 9/5641 - BQ Implement Tooltip'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/input_FlightSection - CarrierCode'),
	'')

WebUI.setText(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/input_FlightSection - FNumber'),
	'')

WebUI.setText(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/input_FlightSection - FDate'), '')

WebUI.setText(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/input_FlightSection - Departure'),
	'')

WebUI.setText(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/input_FlightSection - Arrival'),
	'')

WebUI.click(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/div_FlightSection - AllocationCodeDropdown'))

WebUI.click(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/span_LL'))

WebUI.click(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/mat-icon_FlightSection - done'))

WebUI.delay(2)

WebUI.click(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/button_Submit Booking BQ'))

WebUI.delay(5)

WebUI.click(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/a_Return to the BC Booking Queue Page'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ BookingDetails/Flight Section/b_WAIT LIST'), 'WAIT LIST')

}


