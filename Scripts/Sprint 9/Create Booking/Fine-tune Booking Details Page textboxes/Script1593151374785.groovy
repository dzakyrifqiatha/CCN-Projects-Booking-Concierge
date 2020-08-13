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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_New Booking'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-option_New Booking'))

WebUI.mouseOver(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter 3 numeric characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter 8 numeric characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input__mat-input-Origin'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter 3 alpha characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input__mat-input-Destination'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter 3 alpha characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter no more than 15 characters (alphanumeric, hyphen, full stop or space) only.', 
    false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter no more than 4 numeric characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input__mat-input-Weight'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter no more than 7 characters only (numeric, up to one decimal place).', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input__mat-input-Volume'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter no more than 9 characters only (numeric, up to two decimal place).', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input_Special Handling Codes 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter 3 alphanumeric characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input_Special Handling Codes 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter 3 alphanumeric characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input_Special Handling Codes 3'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter 3 alphanumeric characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input_Special Handling Codes 4'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter 3 alphanumeric characters only.', false)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/button_add Flights'))

WebUI.mouseOver(findTestObject('Page_Create New Booking/input__mat-input-Flight (Carrierr Code)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter 2 alphanumeric characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input__mat-input-Flight Number'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter only format: 0001A.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input__mat-input-Flight Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed date format: DD-MMM-YY.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input__mat-input-Board Point'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter 3 alpha characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input__mat-input-Off Point'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter 3 alpha characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/span_Allocation Code'))

WebUI.verifyTextPresent('Select allocation code.', false)

not_run: WebUI.click(findTestObject('Page_Create New Booking/button_Flights-Done'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/button_add Dimensions'))

WebUI.mouseOver(findTestObject('Page_Create New Booking/input_Volume_mat-input-Length'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter no more than 5 numeric characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input_Volume_mat-input-Width'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter no more than 5 numeric characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input_Volume_mat-input-Height'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter no more than 5 numeric characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input_Volume_mat-input-Unit'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter no more than 3 alphanumeric characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input_Volume_mat-input-Pieces'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter no more than 4 numeric characters only.', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input_Volume_mat-input-Weight'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter no more than 7 characters only (numeric, up to one decimal place).', false)

WebUI.mouseOver(findTestObject('Page_Create New Booking/input_Volume_mat-input-Volume'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Allowed to enter no more than 9 characters only (numeric, up to two decimal place).', false)

not_run: WebUI.click(findTestObject('Page_Create New Booking/button_Dimensions-Done'))

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Page_Create New Booking/textarea_Remarks_Booking'), 'Test Remarks')

not_run: WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

not_run: WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

WebUI.delay(10)

