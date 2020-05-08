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

WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_New Booking'), 'Template001')

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-option_Top Template'))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), '113')

WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), '1234567')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), 'SIN')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), 'BKK')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), 'Test New Booking 1')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), '100')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Weight'), '1234')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Volume'), '100')

WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 1'), 'AA1')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 2'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 3'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 4'), '')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/button_add Flights'))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight (Carrierr Code)'), 'JQ')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Number'), '123')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Date'), '20-May-20')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Board Point'), 'ABC')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Off Point'), 'DEF')

not_run: WebUI.selectOptionByLabel(findTestObject('Page_Create New Booking/span_Allocation Code'), ' KK ', false)

WebUI.click(findTestObject('Page_Create New Booking/button_Flights-Done'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/button_add Dimensions'))

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Length'), '111')

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Width'), '222')

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Height'), '121')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Unit'), 'CVB')

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Pieces'), '100')

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Weight'), '111.2')

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Volume'), '222.3', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Create New Booking/button_Dimensions-Done'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Create New Booking/textarea_Remarks_Booking'), 'Test Remarks')

WebUI.click(findTestObject('Page_Create New Booking/button_Send Request'))

WebUI.delay(10)

